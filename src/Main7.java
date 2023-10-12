import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        String text = "Hello world";
        /*try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            byte[] buff = text.getBytes();
            fos.write(buff);
            System.out.println("Файл успешно записан");
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        try {
            FileInputStream fis = new FileInputStream("test.txt");
            int i;
            while ((i=fis.read()) != -1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}