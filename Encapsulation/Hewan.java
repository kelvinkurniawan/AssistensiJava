public class Hewan{

    /* Modifier private */
    private String nama;
    private int jumlahPopulasi;
    private String fams;

    /* Setter */
    public void setFams(String param){
        this.fams = param;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setJumlahPopulasi(int jumlahPopulasi){
        this.jumlahPopulasi = jumlahPopulasi;
    }

    /* Getter */
    public String getFams(){
        return this.fams;
    }

    public String getNama(){
        return this.nama;
    }

    public int getJumlahPopulasi(){
        return this.jumlahPopulasi;
    }
    
}