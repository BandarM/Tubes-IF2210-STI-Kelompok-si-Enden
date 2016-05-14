package javaapplication5;

public class Bangunan{
    private Koordinat titikPusat;
    private int panjang;
    private int lebar;
    private String namaBangunan;
    
    public Bangunan(String namaBangunan, Koordinat titikPusat, int panjang, int lebar){
        this.titikPusat = titikPusat;
        this.namaBangunan = namaBangunan;
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void setPanjang(int panjang){
        this.panjang=panjang;
    }
    
    public void setLebar(int panjang){
        this.panjang=panjang;
    }
    
    public void setTitikPusat(int panjang){
        this.panjang=panjang;
    }
    
    public int getPanjang(){
        return panjang;
    }
    
    public int getLebar(){
        return lebar;
    }
    
    public Koordinat getTitikPusat(){
        return titikPusat;
    }
}
