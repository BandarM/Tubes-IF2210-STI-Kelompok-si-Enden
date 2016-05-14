package harvestvalley;

public class Inventori implements Printable {
    //Atribut
    private static Tools[] alat;
    private static int neffAlat;
    int i;
   
    //Konstruktor
    public Inventori() {
        alat = new Tools[6];
        neffAlat = 0;
    }

    //Getter
    public Tools[] getAlat() {
        return alat;
    }
    public Tools getAlat(int i) {
        return alat[i];
    }
    public int neffAlat() {
        return neffAlat;
    }

    //Setter
    public void setTools(Tools[] t) {
        alat = t;
    }
    public void setNeffAlat(int i) {
        neffAlat = i;
    }

    //Method
    public void addTools(Tools t) {
        alat[neffAlat] = t;
        neffAlat++;
    }
    public void cetakInventori() {
        prtln("Isi tas >> ");
        prtln("   <<Tools>>");
        for(i=0; i<neffAlat; i++) {
            prtln("     " + alat[i].getNama());
        }
    }
}
