package Interfaces;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyUtilsImpl1 implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c == -1)
                    break;
                bos.write(c);
            }

            bis.close();
            bos.flush();
            bos.close();

        } catch (Exception e) {
            throw new FileCopyFailedException("Не получилось скопировать");
        }
    }
}
