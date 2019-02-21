package nedis.study.interfaces.t6.io;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        IOUtilsImpls utills = new IOUtilsImpls();
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
             in = new BufferedReader(
                    new BufferedReader(new FileReader("data.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
             out = new BufferedWriter(new FileWriter("data.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        utills.replaceChars(in, out, "abc", "ABC");

    }
}
