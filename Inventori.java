public class Inventori implements Printable {
    //Atribut
    private static Tools[] alat;
    private static int neffAlat;
   
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
        int i;

        prtln("Isi tas >> ");
        prtln("   <<Tools>>");
        for(i=0; i<neffAlat; i++) {
            prtln("     " + alat[i].getNama());
        }
    }
    
    //@Override
    public String toString() {
        int i;
        String[] temp = new String[30];
        temp[29] = new String("  Isi tas >>\n   <<Tools>>\n");
        for(i=0; i<neffAlat; i++) {
            temp[i] = new String("       " + alat[i].getNama() + "\n");
            temp[29] += temp[i];
        }
        
        return (temp[29]);
    }
}
