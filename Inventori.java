public class Inventori implements Printable {
    //Atribut
    private static Tools[] alat;
    private static Items[] barang;
    private static int neffAlat;
    private static int neffBarang;
   
    //Konstruktor
    public Inventori() {
        alat = new Tools[6];
        barang = new Items[12];
        neffAlat = 0;
        neffBarang = 0;
    }

    //Getter
    public Tools[] getAlat() {
        return alat;
    }
    public Tools getAlat(int i) {
        return alat[i];
    }
    public Items[] getBarang(){
		return barang;
	}
    public Items getBarang(int i){
		return barang[i];
	}
    public int neffAlat() {
        return neffAlat;
    }
    public int neffBarang(){
		return neffBarang;
	}

    //Setter
    public void setTools(Tools[] t) {
        alat = t;
    }
    public void setItems(Items[] i){
		barang = i;
	}
    public void setNeffAlat(int i) {
        neffAlat = i;
    }
    public void setNeffBarang(int j){
		neffBarang = j;
	}

    //Method
    public void addTools(Tools t) {
        alat[neffAlat] = t;
        neffAlat++;
    }
    public void addItems(Items i){
		barang[neffBarang] = i;
		neffBarang++;
	}
    public void cetakInventori() {
        int i;
        int j;

        prtln("Isi tas >> ");
        prtln("   <<Tools>>");
        for(i=0; i<neffAlat; i++) {
            prtln("     " + alat[i].getNama());
        }
        prtln("   <<Items>>");
        for(j=0; j<neffBarang; j++) {
            prtln("     " + barang[j].getNama());
        }
    }
    
    //@Override
    public String toString() {
        int i;
        int j;
        String[] temp = new String[30];
        temp[29] = new String("  Isi tas >>\n   <<Tools>>\n");
        for(i=0; i<neffAlat; i++) {
            temp[i] = new String("       " + alat[i].getNama() + "\n");
            temp[29] += temp[i];
        }
		temp[28] = new String("   <<Items>>\n");
		i = 0;
		for(j=neffAlat; j<neffAlat+neffBarang; j++) {
            temp[j] = new String("       " + barang[i].getNama() + "\n");
            temp[28] += temp[j];
            i++;
        }
        
        return (temp[29]+temp[28]);
    }
}
