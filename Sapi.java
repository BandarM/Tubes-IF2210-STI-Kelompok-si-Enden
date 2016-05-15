public class Sapi extends Hewan{
	//Atribut
    private String nama;
    private String jenis;
    private boolean status;
    private Koordinat lokasi;

    //Konstruktor
    public Sapi(String nama, boolean status, Koordinat lokasi, String jenis) {
        super(nama, status, lokasi, jenis);
        this.nama = nama;
        this.jenis = jenis;
        this.lokasi = lokasi;
        this.status = status;
    }
    
    //Getter
    
    //Setter
    
    //Method
    
    @Override
    public String getJenis() {
        return this.jenis = "Sapi";
    }
    
    @Override
    public String getFase() {
        if (umur <= 3) {
            fase = "Kecil";
        }
        else if (umur > 8) {
            fase = "Besar";
            if (umur % 2 == 0) {
                fase = "Besar (Panen)";
            }
        }
        return fase;
    }
    
    @Override
    public int getHargaBeli() {
        if ("Kecil".equals(fase)) {
            hargabeli = 60;
        } else {
            hargabeli = 90;
        }
        return hargabeli;
    }
    
    @Override
    public int getHargaJual() {
        return hargajual = 130;
    }
}
