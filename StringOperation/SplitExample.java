public class SplitExample{
    public static void main(String [] args){
        String apaaja = "Aku - Kamu - Dia - Orang Tua - Calon mantu - Sahabat - Saudara"; // definisi variable

        String[] akhirnya = apaaja.split("-"); // membagi String apa aja berdasarkan -

        System.out.println(akhirnya[0] + akhirnya[2]); // Memanggil variable berdasarkan indeks
        
        // memanggil semua varible
        // for(String akhirnya : apaaja.split("-")){
        //     System.out.println(akhirnya);
        // }

    }
}