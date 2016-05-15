public class Bangunan{
    //Atribut
    private String namaBangunan;
    private Koordinat titikPusat;
    private int panjang;
    private int lebar;
    private int kapasitas;
    private int isi;
    
    //Konstruktor
    public Bangunan(String s, Koordinat k, int p, int l){
        namaBangunan = s;
        titikPusat = k;
        panjang = p;
        lebar = l;
    }
    public Bangunan(String s, Koordinat k, int p, int l, int kap, int i){
        namaBangunan = s;
        titikPusat = k;
        panjang = p;
        lebar = l;
        kapasitas = kap;
        isi = i;
    }
    
    //Getter
    public String getNamaBangunan() {
	return namaBangunan;
    }
    public Koordinat getTitikPusat() {
        return titikPusat;
    }
    public int getPanjang() {
        return panjang;
    }
    public int getLebar() {
        return lebar;
    }
    public int getKapasitas() {
        return kapasitas;
    }
    public int getIsi() {
        return isi;
    }
	
    //Setter
    public void setNamaBangunan(String s) {
        namaBangunan = s;
    }
    public void setTitikPusat(Koordinat k) {
        titikPusat = k;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    public void setKapasitas(int kap) {
        kapasitas = kap;
    }
    public void setIsi(int i) {
        isi = i;
    }
    
    //Method
}
