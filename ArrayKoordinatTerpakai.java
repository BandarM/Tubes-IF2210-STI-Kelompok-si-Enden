package javaapplication5;
public class ArrayKoordinatTerpakai{
    private Koordinat[] unavailable;
    private int i;
    
    public ArrayKoordinatTerpakai(){
        i = 0;
    }
    
    public void tambahLahan(Koordinat lahan){
        i++;
        unavailable[i]=lahan;
    }
    
    public void tambahBangunan(Bangunan b){
       Koordinat temp = null;
       int j;
        
       int bataskiri = b.getTitikPusat().getX()-(b.getPanjang()/2);
       int bataskanan = b.getTitikPusat().getX()+(b.getPanjang()/2);
       int batasatas = b.getTitikPusat().getY()+(b.getLebar()/2);
       int batasbawah = b.getTitikPusat().getX()-(b.getPanjang()/2);
       
       for(j= bataskiri; j<=bataskanan; j++){
           temp.setX(j);
           temp.setY(batasbawah);
           
           tambahLahan(temp);
       }
       
       for(j= bataskiri; j<=bataskanan; j++){
           temp.setX(j);
           temp.setY(batasatas);
           
           tambahLahan(temp);
       }
       
       for(j= batasatas; j<=batasbawah; j++){
           temp.setX(j);
           temp.setY(bataskiri);
           
           tambahLahan(temp);
       }
       
       for(j= batasatas; j<=batasbawah; j++){
           temp.setX(j);
           temp.setY(bataskanan);
           
           tambahLahan(temp);
       }
    }
    
    public void setKoordinat(Koordinat[] unavailable){
        this.unavailable=unavailable;
    }
    
    public Koordinat[] getUnavailable(){
        return unavailable;
    }
    
    public Koordinat getUnavailable(int i){
        return unavailable[i];
    }
}
