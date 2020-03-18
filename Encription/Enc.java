public class Enc {
    
    public static void main(String[] args) {
        System.out.println(encrypt("Kelvin", 10)); // Memanggil fungsi encript
    }
    
    public static String encrypt(String data, int key) { // Membuat fungsi untuk enkripsi, parameter pertama adalah kata/kalimat, parameter kedua adalah key
        String ret = ""; // Membuat variable ret untuk menghasilkan string dari hasil encrypt
        for (char c : data.toCharArray()) { // Melakukan perulangan dan mengambil setiap karakter dari string yang ada diparameter pertama dan menampungnya di variable c
            if(c >= 'a' && c <= 'z') { // Memeriksa jika karakter berada diantara a - z
                c = (char) (c + key);
                if(c > 'z') {
                    c = (char) (c+'a'-'z'-1);
                }
                ret += c;
            } else if(c >= 'A' && c <= 'Z') {
                c = (char) (c + key);    
                if(c > 'Z') {
                    c = (char) (c+'A'-'Z'-1);
                }
                ret += c;
            } else {
                ret += c;   
            }
        }
        return ret;
    }
}
