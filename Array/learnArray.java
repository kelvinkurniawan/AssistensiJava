import java.util.Scanner;

public class learnArray{
    public static void main(String []args){ 

        Scanner sc = new Scanner(System.in); // Membuat object sc dari class Scanner
        int arr[] = new int[10]; // Membuat variable array dengan panjang 10, indeksnya 0 1 2 3 4 5 6 7 8 9

        System.out.print("Masukkan jumlah data : ");
        int jumlah = sc.nextInt();

        for(int i = 0; i < jumlah; i++){ // Melakukan perulangan
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            arr[i] = sc.nextInt(); // memanggil scanner dan menginputkan nilai ke variable arr, indeks nya disesuaikan dengan i
        }

        System.out.println(); 

        for(int i = 0; i < jumlah; i++){
            System.out.println("Bilangan ke-" + i + " adalah " + arr[i]); // Mencetak nilai dari variable arraynya
        }

        sc.close();
    }
    
}
