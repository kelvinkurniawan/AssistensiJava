package com.company;

class Mobil {

    //private hanya bisa diakses di kelas yang menginisialisasi
    private String model = "sedan";

    //gunakan akses modifier protected kalau ingin diakses dari kelas turunan
    protected int jmlPintu = 4;

    protected void berjalan(){
        System.out.println("jalan");
        System.out.println(model);
    }
}

//java tidak mendukung multiple inheritence, jadi hanya bisa mengambil dari satu kelas parent
class MobilTerbang extends MobilElektrik {

    public void terbang() {
        System.out.println("terbang");
    }
}

class MobilElektrik extends Mobil {

    private String brand = "tesla";

    protected void charging() {
        System.out.println("charging");
    }

}

class Main {
    public static void main(String[] args) {

        //Membuat objek terlebih dahulu
        MobilTerbang mobilKu = new MobilTerbang();
        mobilKu.berjalan(); //method berjalan dari kelas parent utama
        mobilKu.charging(); //method charging dari kelas anak pertama
        mobilKu.terbang();  //method terbang dari kelas anak kedua
        System.out.println(mobilKu.jmlPintu);  
    }
}



