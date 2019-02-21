package Interfaces;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileCopyUtilsImpl3 implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        FileChannel fc = null;
        try {
            fc = new FileInputStream(source).getChannel();
            ByteBuffer buff = ByteBuffer.allocate(1024);
            fc.read(buff);
            buff.flip();
            fc.close();
            fc = new FileOutputStream(destination).getChannel();
            fc.write(buff);
            fc.close();
        } catch (java.io.IOException e) {
            throw new FileCopyFailedException("Не получилось скопировать");
        }
    }
}
