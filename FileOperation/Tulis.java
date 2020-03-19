/**
 *
 * @author Kelvin
 */

import java.io.FileWriter;
import java.util.Scanner;


public class Tulis {
    public static void main(String[] args) {
        int alfabet;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Jumlah alfabet : ");
        alfabet = input.nextInt(); // Membuat input berupa angka untuk menentukan panjang array dan jumlah looping
        
        int [] jumlah = new int [alfabet]; // Membuat variable array dengan nama jumlah dengan panjang sesuai dengan variable alfabet
        
        for (int i = 0; i < alfabet; i++) { // Mengulangi perintah input sebanyak jumlah alfabet
            System.out.print("Masukkan Angka (65-122) :  ");
            jumlah[i] = input.nextInt(); // Menampung inputan ke dalam variable array
        }
        
        try { // Exception handling
            FileWriter tulisFile = new FileWriter("D:\\Latihan.txt"); // Membuat file dengan lokasi D:\\Latihan.txt
            for (int i = 0; i < alfabet; i++) { // Melakukan looping lagi
                tulisFile.write(jumlah[i]); // Menuliskan nilai dari array ke dalam file yang tadi dibuat
            }
            tulisFile.close(); // setiap menggunakan fileWriter harus di close
            
            System.out.println("Berhasil Guys");
            
        } catch (Exception e){ // jika gagal
            System.out.println("File tidak ada guys ");
        }
        
        
    }
}
