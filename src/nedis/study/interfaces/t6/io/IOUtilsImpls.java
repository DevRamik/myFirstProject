package nedis.study.interfaces.t6.io;

import nedis.study.interfaces.t6.io.IOUtils;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IOUtilsImpls implements IOUtils {

    @Override
    public void replaceChars(Reader in, Writer out, String inChars, String outChars) throws NullPointerException, IllegalArgumentException {
        try {
            char ch = (char) in.read();
            System.out.println(ch);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String[] findFiles(String dir) throws NullPointerException, IllegalArgumentException {
        return new String[0];
    }
}
