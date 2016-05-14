public class ArrayKoordinatTerpakai implements Printable{
    //Atribut
    private static Koordinat[] unavailable;
    private static int neff;
    
    //Konstruktor
    public ArrayKoordinatTerpakai(){
        unavailable = new Koordinat[1000];
        neff = 0;
    }
    
    //Getter
    public Koordinat[] getUnavailable(){
        return unavailable;
    }
    public Koordinat getUnavailable(int i){
        return unavailable[i];
    }
    
    //Setter
    public void setKoordinat(Koordinat[] unavailable){
        this.unavailable = unavailable;
    }
    
    //Method
    public void tambahLahan(Koordinat lahan){
        unavailable[neff] = lahan;
        neff++;
    }
    public void tambahBangunan(Bangunan b){
        Koordinat temp = new Koordinat(b.getTitikPusat());
        Koordinat hasil = new Koordinat();
        int i;
        int bKiri = temp.getX()-(b.getPanjang()/2);
        int bKanan = temp.getX()+(b.getPanjang()/2);
        int bAtas = temp.getY()+(b.getLebar()/2);
        int bBawah = temp.getX()-(b.getPanjang()/2);
       
        for(i= bKiri; i<=bKanan; i++){
             hasil.setX(i);
             hasil.setY(bBawah);

             tambahLahan(hasil);
             prtln(hasil.toString());
        }
        for(i= bKiri; i<=bKanan; i++){
             hasil.setX(i);
             hasil.setY(bAtas);

             tambahLahan(hasil);
             prtln(hasil.toString());
        }
        for(i= bAtas; i<=bBawah; i++){
             hasil.setX(i);
             hasil.setY(bKiri);

             tambahLahan(hasil);
             prtln(hasil.toString());
        }
        for(i= bAtas; i<=bBawah; i++){
             hasil.setX(i);
             hasil.setY(bKanan);

             tambahLahan(hasil);
             prtln(hasil.toString());
        }
    }
}
