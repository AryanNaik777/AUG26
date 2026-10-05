package Encryption_Decryption;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import Calculator.ConsoleInput;

public class Program {
    private static final byte KEY = 'S';
    public static void main(String[] args) {
        encrpytMessageSave();
        decrpytMessageLoad();
    }

    private static void decrpytMessageLoad() {
        try (FileInputStream fileStream = new FileInputStream("D:\\CDAC\\Misc\\OOPJ\\CDAC.txt")) {
            byte[] byteArr = fileStream.readAllBytes();

            for(int idx = 0; idx < byteArr.length; idx++) {
                byteArr[idx] ^= KEY;
            }
            System.out.println(new String(byteArr));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void encrpytMessageSave() {
        try (FileOutputStream fileStream = new FileOutputStream("D:\\CDAC\\Misc\\OOPJ\\CDAC.txt")) {
            System.out.println("Enter your message:");
            String str = ConsoleInput.getString();
            byte[] byteStr = str.getBytes();
            for(int idx = 0; idx < byteStr.length; idx++) {
                byteStr[idx] ^= KEY;
            }
            fileStream.write(byteStr);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
