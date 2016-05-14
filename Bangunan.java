public class Bangunan{
	//Atribut
    private String namaBangunan;
    private Koordinat titikPusat;
    private int panjang;
    private int lebar;
    
	//Konstruktor
    public Bangunan(String s, Koordinat k, int p, int l){
        namaBangunan = s;
        titikPusat = k;
        panjang = p;
        lebar = l;
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
    
	//Method
}
