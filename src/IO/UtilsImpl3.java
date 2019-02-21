package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileAlreadyExistsException;

public class UtilsImpl3 implements Utils {
    @Override
    public void copyFile(String source, String destination) throws FailedException, FileAlreadyExistsException {
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
            e.printStackTrace();
        }
    }
}
