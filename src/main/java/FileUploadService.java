import java.io.File;
import java.io.FileOutputStream;

public class FileUploadService {

   
    public void uploadFile(String fileName, byte[] fileData) throws Exception {
        
        File file = new File("/uploads/" + fileName);

      
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(fileData);
        }
        
        System.out.println("File uploaded to: " + file.getAbsolutePath());
    }
}
