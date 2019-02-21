package IO;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class UtilsImpl2 implements Utils {
    @Override
    public void copyFile(String source, String destination) throws FailedException, FileAlreadyExistsException {
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
            e.printStackTrace();
        }
    }
}
