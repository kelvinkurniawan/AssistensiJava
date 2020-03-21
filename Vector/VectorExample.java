import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<String> item = new Vector<>(); //deklarasi vector dengan tipe data string

        //menambahkan elemen menggunakan method add()
        item.add("meja");
        item.add("kursi");
        item.add("payung");
        item.remove(2);

        //menambahkan elemen dengan menuliskan index
        //elemen yang sudah ada pada index tersebut akan mundur
        item.add(1,"kasur");

        //output vector
        System.out.println(item);

        Vector<String> otherItem = new Vector<>();
        otherItem.add("pesawat");
        otherItem.add("mobil");

        //bila ingin menambahkan item dari vector lain gunakan addAll()
        item.addAll(otherItem);
        System.out.println(item);

        //bila ingin mengambil satu elemen dari sebuah vector maka gunakan get()
        System.out.println("Elemen pada index ke 4 : " + item.get(4));

        //untuk mengetahui ukuran vector
        System.out.println("Ukuran vector : " + item.size());

    }
}
