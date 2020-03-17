package test;

/**
 *
 * @author Kelvin
 */

import java.io.*;
import java.util.Scanner;

public class Test {

   public static void main(String[] args) throws IOException{
       Scanner scan = new Scanner(System.in); // Membuat objek scanner
       String nama,line,alamat;
        try{
            String filename= "MyFile.txt";
            FileWriter fw = new FileWriter(filename,true); // Membuat objek baru di FileWriter
            nama = scan.nextLine();
            System.out.print("alamat = ");
            alamat = scan.nextLine();
            fw.write(nama); // Untuk menuliskan text ke dalam file
            fw.write("\t" +alamat+ "\n"); // Untuk menuliskan text ke dalam file
            fw.close(); // Setiap selesai menulis ke file, FileWriter harus ditutup dengan close
            System.out.println("-----------------------");
            System.out.println("nama\t alamat");
            
            FileReader fr =new FileReader(filename); // Membuat objek dari FileReader
            BufferedReader bf = new BufferedReader(fr); // Membuat objek baru dari bufferedReader
            
            // Melakukan looping untuk menampilkan data yang ada di file
            while((line=bf.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException ioe){ // Menangkap kesalahan dari IOException
            System.err.println("IOException: " + ioe.getMessage()); 
        }
    }
    
}
