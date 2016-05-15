public class Hewan {
    //Atribut
    private String nama;
    private boolean isHungry;
    private Koordinat lokasi;
    private String jenis;
    int umur;
    String fase;
    int hargabeli, hargajual;
    boolean isAlive;
    
    //Getter
    
    //Setter
    
    //Method
    
    public Hewan(String nama, boolean status, Koordinat lokasi, String jenis) {
        this.nama = nama;
        this.isHungry = status;
        this.lokasi = lokasi;
        this.jenis = jenis;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
   
    public void setLokasi(Koordinat lokasi) {
        this.lokasi = lokasi;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public Koordinat getLokasi() {
        return this.lokasi;
    }
    
    public String getJenis() {
        return this.jenis;
    }
    
    public void setStatus(boolean status) {
        this.isHungry = status;
    }
    
    public void setIsAlive(boolean status) {
        this.isAlive = isAlive;
    }
    
    public String getIsAlive() {
        if (isAlive) {
            return "hidup";
        }
        else {
            return "mati";
        }
    }
    public String getStatus() {
        if (isHungry) {
            return "Kenyang";
        }
        else {
            return "Lapar";
        }
    }
    
    public String getFase() {
        return fase;
    }
    
    public int getHargaBeli() {
        return hargabeli;
    }
    
    public int getHargaJual() {
        return hargajual;
    }
}
