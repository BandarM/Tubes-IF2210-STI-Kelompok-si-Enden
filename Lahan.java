public class Lahan implements Printable {
    //Atribut
    private static Koordinat[] lahan;
    private static boolean[] status;
    
    //Konstruktor
    public Lahan() {
        lahan = new Koordinat[400];
        status = new boolean[400];
    }
    
    //Getter
    public Koordinat[] getLahan() {
        return lahan;
    }
    public Koordinat getLahan(int i) {
        return lahan[i];
    }
    public boolean[] getStatus(){
		return status;
	}
	public boolean getStatus(int i){
		return status[i];
	}

    //Setter
    public void setKoordinat(Koordinat[] lahan) {
        this.lahan = lahan;
    }
    public void setKoordinat(Koordinat lahan, int i){
		this.lahan[i] = lahan;
	}
    public void setStatus(boolean[] b){
		status = b;
	}
	public void setStatus(boolean b, int i){
		status[i] = b;
	}

    //Method
    public void tambahLahan(){
        int i;
        int j;
        Koordinat tempK;
        boolean tempS;
        int cacah = 0;
        
        for (i=0;i<=20;i++){
			for(j=1;j<=21;j++){
				tempK = new Koordinat (i,j,null);
				tempS = false;
				lahan[cacah] = tempK;
				status[cacah] = tempS;
				cacah++;
			}
		}
    }
}
