public class Ayam extends Hewan{
    private String nama;
    private String jenis;
    private boolean status;
    private Koordinat lokasi;

    public Ayam(String nama, boolean status, Koordinat lokasi, String jenis) {
        super(nama, status, lokasi, jenis);
        this.nama = nama;
        this.jenis = jenis;
        this.lokasi = lokasi;
        this.status = status;
    }
    
    @Override
    public String getJenis() {
        return this.jenis = "Ayam";
    }
    
    @Override
    public String getFase() {
        if (umur <= 4) {
            fase = "Kecil";
        }
        else if (umur > 4) {
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
            hargabeli = 20;
        } else {
            hargabeli = 50;
        }
        return hargabeli;
    }
    
    @Override
    public int getHargaJual() {
        return hargajual = 70;
    }
}
