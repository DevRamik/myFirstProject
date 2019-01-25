package Lesson16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Main1 {

    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();
        text.add("qwerty");
        text.add("gold");
        text.add("serebro");
        text.add("dog");
        text.add("qazwsx");
        text.add("port");

        Collections.sort(text);

        for (String text1 : text) {
            System.out.println(text1);
        }

    }

}
