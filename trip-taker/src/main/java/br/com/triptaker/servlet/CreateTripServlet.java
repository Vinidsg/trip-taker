package br.com.triptaker.servlet;

import br.com.triptaker.dao.TripTakerDAO;
import br.com.triptaker.infra.AmazonS3Uploader;
import br.com.triptaker.model.Trip;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.commons.fileupload.FileUploadBase.isMultipartContent;

@WebServlet("/create-trip")
public class CreateTripServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String username = (String) request.getSession().getAttribute("username");
        if (username == null) {
            response.sendRedirect("/login");
            return;
        }

        response.sendError(HttpServletResponse.SC_FORBIDDEN, "Acesso proibido");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String username = (String) request.getSession().getAttribute("username");
        if (username == null) {
            response.sendRedirect("/login");
            return;
        }

        Map<String, String> parameters = uploadImage(request);

        String id = parameters.get("id");
        String local = parameters.get("local");
        int qtdPessoa = Integer.parseInt(parameters.get("qtdPessoa"));
        String guiaResponsavel = parameters.get("guiaResponsavel");
        double vlrUnitario = Double.parseDouble(parameters.get("vlrUnitario"));
        String dtInicio = parameters.get("dtInicio");
        String dtFinal = parameters.get("dtFinal");
        String descricao = parameters.get("descricao");
        String image = parameters.get("image");

        Trip trip = new Trip(id, local, qtdPessoa, guiaResponsavel, vlrUnitario, dtInicio, dtFinal, descricao, image);

        if (id.isEmpty()) {
            new TripTakerDAO().createTrip(trip);
        } else {
            new TripTakerDAO().updateTrip(trip);
        }

        response.sendRedirect("/getImage");
    }

    private Map<String, String> uploadImage(HttpServletRequest httpServletRequest) {

        Map<String, String> requestParameters = new HashMap<>();

        if (isMultipartContent(httpServletRequest)) {
            try {
                DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();

                List<FileItem> fileItems = new ServletFileUpload(diskFileItemFactory).parseRequest(httpServletRequest);

                for (FileItem fileItem : fileItems) {

                    checkFieldType(fileItem, requestParameters);
                }
            } catch (Exception ex) {

                System.out.println(ex.getMessage());

            }

        }
        return requestParameters;
    }

    private void checkFieldType(FileItem item, Map requestParameters) throws Exception {
        AmazonS3Uploader s3 = new AmazonS3Uploader();
        if (item.isFormField()) {
            String xxx = Streams.asString(item.getInputStream(), "UTF-8");
            System.out.println(xxx);
            requestParameters.put(item.getFieldName(), xxx);
        } else {
            String fileName = processUploadFile(item);
            requestParameters.put("image", s3.getURL(fileName));
        }
    }

    private String processUploadFile(FileItem fileItem) throws Exception {
        AmazonS3Uploader s3 = new AmazonS3Uploader();
        Long currentTime = new Date().getTime();
        String fileName = currentTime.toString().concat("-").concat(fileItem.getName().replace(" ", ""));
        String filePath = this.getServletContext().getRealPath("img").concat(File.separator).concat(fileName);
        fileItem.write(new File(filePath));
        s3.uploadImageToS3(filePath, fileName);
        return fileName;
    }
}
