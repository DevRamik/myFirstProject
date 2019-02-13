package Lesson21;

public class DeSerializable {
    public static void main(String[] args) {
        try {
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new java.io.FileInputStream("state.bin"));
            System.out.println("Double: " + ois.readDouble());
            System.out.println("String: " + ois.readObject().toString());
            System.out.println("Point: " + (Point) ois.readObject());
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
