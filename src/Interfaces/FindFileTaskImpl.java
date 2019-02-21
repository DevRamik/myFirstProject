package Interfaces;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.file.Files;

public class FindFileTaskImpl extends TaskImpl implements FindFilesTask {

    //Путь к файлу
    private String directory;
    //Искать по ключевому слову
    private String searchString;
    //Куда копировать
    private PrintStream out;

    public FindFileTaskImpl() {

    }

    public FindFileTaskImpl(String directory, String searchString, PrintStream out) {
        this.directory = directory;
        this.searchString = searchString;
        this.out = out;
    }

    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        this.directory = directory;
    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        this.searchString = searchString;
    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out = out;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        File directoryFrom = new File(directory);
        if (directoryFrom.exists()) {
            throw new TaskExecutionFailedException("По указанному пути нет папки");
        }
        if (directoryFrom.isFile()) {
            throw new TaskExecutionFailedException("Это не папка");
        }
        File[] files = directoryFrom.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().contains(searchString);
            }
        });
        if (files.length == 0) {
            out.println("По данной характеристике, файл не найден");
        }
        for (File f : files) {
            out.println(f.getAbsolutePath());
        }
    }
    @Override
    public String toString() {
        return "FindFileTaskImpl{" +
                "directory='" + directory + '\'' +
                ", searchString='" + searchString + '\'' +
                ", out=" + out +
                '}';
    }
}
