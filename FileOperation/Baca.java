import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Kelvin
 */
public class Baca {

    public static void main(String[] args) {
        try {
            File inputFile = new File("D:\\Latihan.txt"); // Membaca file yang ada di D:\\Latihan.txt

            Scanner sc = new Scanner(inputFile); // Scanner dengan parameter inputFile

            while (sc.hasNext()) { // Melakukan perulangan 
                String data = sc.next(); // Variable data digunakan untuk mendapat value dari file
                System.out.print(data); // Mencetak data

            }

            System.out.println(""); 

        } catch (Exception e) {
            System.out.println("File Tidak ada Guys");
        }
    }
}
