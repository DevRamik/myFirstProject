package Interfaces;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCopyUtilsImpl4 implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        try {
            Files.copy(Paths.get(source), Paths.get(destination));
        } catch (IOException e) {
            throw new FileCopyFailedException("Не получилось скопировать");
        }
    }
}
