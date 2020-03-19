import java.io.*;

public class learnArray{
    public static void main(String []args){ 

        Scanner sc = new Scanner(System.in); // Membuat object sc dari class Scanner
        int arr[] = new int[10]; // Membuat variable array dengan panjang 10, indeksnya 0 1 2 3 4 5 6 7 8 9

        for(int i = 0; i < 10; i++){ // Melakukan perulangan
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            arr[i] = sc.nextInt(); // memanggil scanner dan menginputkan nilai ke variable arr, indeks nya disesuaikan dengan i
        }

        System.out.println(); 

        for(int i = 0; i < 10; i++){
            System.out.println("Bilangan ke-" + i + " adalah " + arr[i]); // Mencetak nilai dari variable arraynya
        }
    }
    
}
