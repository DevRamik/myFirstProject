package Interfaces;

import java.io.*;

public class FileCopyUtilsImpl2 implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        try {
            InputStream is = new FileInputStream(source);
            OutputStream os = new FileOutputStream(destination);

            int c = 0;
            while ((c = is.read()) > 0) {
                os.write(c);
            }

            is.close();
            os.flush();
            os.close();
        } catch (IOException e) {
            throw new FileCopyFailedException("Не получилось скопировать");
        }
    }
}
