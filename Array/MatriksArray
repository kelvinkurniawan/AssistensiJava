import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i,j;
        int baris, kolom, jumlah;
        int matriksA[][] = new int[10][10];
        int matriksB[][] = new int[10][10];
        int hasil[][] = new int[10][10];

        System.out.print("Masukkan jumlah baris : ");
        baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom : ");
        kolom = input.nextInt();

        System.out.println("=== Matriks A ===");

        //input matriks A
        for (i = 0; i < baris; i++) {
            for (j = 0; j < kolom; j++) {
                System.out.print("Masukkan data matriks ["+i+"]["+j+"] : ");
                matriksA[i][j] = input.nextInt();
            }
        }

        System.out.println("=== Matriks B ===");

        //input matriks B
        for (i = 0; i < baris; i++) {
            for (j = 0; j < kolom; j++) {
                System.out.print("Masukkan data matriks ["+i+"]["+j+"] : ");
                matriksB[i][j] = input.nextInt();
            }
        }

        //Operasi Penjumlahan
        for (i = 0; i< baris; i++) {
            for (j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        System.out.println("\n=== Hasil ===\n");

        //cetak hasil perhitungan
        for (i = 0; i < baris; i++) {
            for (j =0; j < kolom; j++) {
                System.out.print(hasil[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
