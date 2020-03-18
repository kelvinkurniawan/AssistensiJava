/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Kelvin
 */
public class dec {
    
    public static void main(String[] args) {
        System.out.println(decrypt("Uovfsj", 10));
    }

    public static String decrypt(String data, int key) { // Membuat fungsi untuk dekripsi, parameter pertama adalah enkripsi, parameter kedua adalah key
        String ret = ""; // Membuat variable ret untuk menghasilkan string dari hasil decrypt
        for (char c : data.toCharArray()) { // Melakukan perulangan dan mengambil setiap karakter dari string yang ada diparameter pertama dan menampungnya di variable c
            if(c >= 'a' && c <= 'z') { // Memeriksa jika karakter berada diantara a - z
                c = (char) (c - key); // mengurangi karakter yang ada pada variable c dengan key nya
                if(c < 'a') {
                    c = (char) (c-'a'+'z'+1);
                }
                ret += c; // Menampung variable c kedalam variable ret
            } else if(c >= 'A' && c <= 'Z') { // Sama dengan if yang diatas hanya berbeda huruf besar dan kecil
                c = (char) (c - key);
                if (c < 'A') {
                    c = (char) (c-'A'+'Z'+1);
                }
                ret += c;            
            } else { // Jika isi dari c tidak ada diantara a - z maka nilai akan dikembalikan apa adanya
                ret += c;            
            } 
        }
        return ret; // mengembalikan nilai ret
    }
}
