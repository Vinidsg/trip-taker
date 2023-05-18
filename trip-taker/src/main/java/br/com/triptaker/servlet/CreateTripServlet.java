package br.com.triptaker.servlet;

import br.com.triptaker.dao.TripTakerDAO;
import br.com.triptaker.model.Trip;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.commons.fileupload.FileUploadBase.isMultipartContent;

@WebServlet("/create-trip")
public class CreateTripServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = (String) request.getSession().getAttribute("username");
        if (username == null) {
            response.sendRedirect("/login");
            return;
        }

        response.sendError(HttpServletResponse.SC_FORBIDDEN, "Acesso proibido");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

                requestParameters.put("image", "img/default.jpg");
            }

        }
        return requestParameters;
    }

    private void checkFieldType(FileItem item, Map requestParameters) throws Exception {
        if (item.isFormField()) {
            requestParameters.put(item.getFieldName(), item.getString());
        } else {
            String fileName = processUploadFile(item);
            requestParameters.put("image", "img/".concat(fileName));
        }
    }

    private String processUploadFile(FileItem fileItem) throws Exception {
        Long currentTime = new Date().getTime();
        String fileName = currentTime.toString().concat("-").concat(fileItem.getName().replace(" ", ""));
        String filePath = this.getServletContext().getRealPath("img").concat(File.separator).concat(fileName);
        fileItem.write(new File(filePath));
        return fileName;
    }
}
