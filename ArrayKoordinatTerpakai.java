public class ArrayKoordinatTerpakai implements Printable {
    //Atribut
    private static Koordinat[] unavailable;
    private static int neff;
    
    //Konstruktor
    public ArrayKoordinatTerpakai() {
        unavailable = new Koordinat[1000];
        neff = 0;
    }
    
    //Getter
    public Koordinat[] getUnavailable() {
        return unavailable;
    }
    public Koordinat getUnavailable(int i) {
        return unavailable[i];
    }
    public int getNeff() {
        return neff;
    }

    //Setter
    public void setKoordinat(Koordinat[] unavailable) {
        this.unavailable = unavailable;
    }
    public void setNeff(int i) {
        neff = i;
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
        int L = temp.getX();                    //Batas kiri bangunan
        int R = temp.getX() + b.getPanjang()-1; //Batas kanan bangunan
        int U = temp.getY();                    //Batas atas bangunan
        int D = temp.getY() + b.getPanjang()-1; //Batas bawah bangunan

        for(i=L; i<=R; i++){
             hasil.setX(i);
             hasil.setY(U);
             tambahLahan(hasil);
        }
        for(i=L; i<=R; i++){
             hasil.setX(i);
             hasil.setY(D);
             tambahLahan(hasil);
        }
        for(i=U; i<=D; i++){
             hasil.setX(i);
             hasil.setY(L);
             tambahLahan(hasil);
        }
        for(i=U; i<=D; i++){
             hasil.setX(i);
             hasil.setY(R);
             tambahLahan(hasil);
        }
    }
}
