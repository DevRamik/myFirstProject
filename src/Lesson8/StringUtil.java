package Lesson8;

public class StringUtil {
    public static String coding(String message) {
        String alfavit = "abcdefghijklmnopqrstuvwxyz";

        char[] alphabetLittle = alfavit.toCharArray();
        char[] alphabetBig = alfavit.toUpperCase().toCharArray();
        char[] charsFromMessage = message.toCharArray();

        //foreach
        for (char currentChar : charsFromMessage) {
            int index = alfavit.indexOf(currentChar);
            index = index + 3;
            char newChar = alfavit.charAt(index);
            System.out.print(newChar);
        }

        return null;
    }
}
