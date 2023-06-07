package br.com.triptaker.infra;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.endpoints.internal.Value;
import software.amazon.awssdk.services.s3.model.*;

import java.io.File;
import java.net.URL;

import static software.amazon.awssdk.services.s3.model.GetObjectRequest.*;

public class AmazonS3Uploader {
    private static final String BUCKET_NAME = "trip-taker";
    private static final String ACCESS_KEY = "AKIATMENAUSY2KNHHWSZ";
    private static final String SECRET_KEY = "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";
    private static final Region REGION = Region.US_EAST_1;

    public void uploadImageToS3(String imagePath, String fileName){
        S3Client s3Client = S3Client.builder()
                .region(REGION)
                .credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create(ACCESS_KEY, SECRET_KEY)))
                .build();
        try {

            File file = new File(imagePath);

            PutObjectRequest request = PutObjectRequest.builder()
                    .bucket(BUCKET_NAME)
                    .key(fileName)
                    .build();

            s3Client.putObject(request, RequestBody.fromFile(file));

            GetUrlRequest getRequest = GetUrlRequest.builder()
                            .bucket(BUCKET_NAME)
                            .key(fileName)
                            .build();

            URL objectUrl;
            objectUrl = s3Client.utilities().getUrl(getRequest);

            System.out.println("Imagem Salva no S3");
            System.out.println("URL do objeto: " + objectUrl);

        } catch (S3Exception e) {
            System.out.println(e.awsErrorDetails().errorMessage());
        }

    }

    public String getURL(String fileName) {
        S3Client s3Client = S3Client.builder()
                .region(REGION)
                .credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create(ACCESS_KEY, SECRET_KEY)))
                .build();
        String url = null;
        try {
            GetUrlRequest getRequest = GetUrlRequest.builder()
                    .bucket(BUCKET_NAME)
                    .key(fileName)
                    .build();

            url = String.valueOf(s3Client.utilities().getUrl(getRequest));
            System.out.println(url);

        } catch (S3Exception e) {
            System.out.println(e.awsErrorDetails().errorMessage());
        }
        return url;
    }

}
