package Interfaces;

import java.nio.file.FileAlreadyExistsException;

public class CopyFileTaskImpl extends TaskImpl implements CopyFileTask{
    //Откуда копировать
    private String fileFrom;
    //Куда копировать
    private String fileTo;
    //Способ копирования
    private FileCopyUtils copyUtils;

    public CopyFileTaskImpl() {

    }

    public CopyFileTaskImpl(String fileFrom, String fileTo, FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;
        this.fileFrom = fileFrom;
        this.fileTo = fileTo;
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;

    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyUtils.copyFile(fileFrom, fileTo);
        }  catch (Exception e) {
            throw new TaskExecutionFailedException(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "CopyFileTaskImpl{" +
                "fileFrom='" + fileFrom + '\'' +
                ", fileTo='" + fileTo + '\'' +
                ", copyUtils=" + copyUtils +
                '}';
    }
}
