import java.util.Scanner;

public class Kucing {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Hewan hewanKucing = new Hewan();

        String nama = input.nextLine();
        String keluarga = input.nextLine();
        int jumlahPopulasi = input.nextInt();


        hewanKucing.setNama(nama);
        hewanKucing.setJumlahPopulasi(jumlahPopulasi);
        hewanKucing.setFams(keluarga);

        System.out.println("Nama hewan : " + hewanKucing.getNama());
        System.out.println("Jumlah populasi : " + hewanKucing.getJumlahPopulasi());
        System.out.println("Keluarga : " + hewanKucing.getFams());
    }
}