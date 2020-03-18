public class Enc {
    
    public static void main(String[] args) {
        System.out.println(encrypt("Kelvin kurniawan", 9));
    }
    
    public static String encrypt(String data, int key) { // Membuat fungsi untuk enkripsi
        String ret = "";
        for (char c : data.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
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
