public class Hewan {
    //Atribut
    private String nama;
    private boolean isHungry;			//Maksudnya kalau true: belum dikasih makan, kalau false: sudah dikasih makan
    private Koordinat lokasi;
    private String jenis;
    private int umur;
    private String fase;
    private int fKecil;
    private int fBesar;
    private int fPanen;
    private int hBeli; 
    private int hJual;
    private boolean isAlive;

    //Konstruktor 
    public Hewan(String nama, String jenis, Koordinat lokasi, int hB, int hJ, int fK, int fB, int fP){
        this.nama = nama;
        this.jenis = jenis;
        lokasi = new Koordinat (lokasi);
        this.fase = "Kecil";
        isHungry = true;
        hBeli = hB;
        hJual = hJ;
        fKecil = fK;
        fBesar = fB;
        fPanen = fP;
        umur = 0;
    }
    
    //Getter
    public String getNama() {
        return this.nama;
    }
    public Koordinat getLokasi() {
        return this.lokasi;
    }
    public String getJenis() {
        return this.jenis;
    }
    public String getIsAlive() {
        if (isAlive) {
            return "hidup";
        }
        else {
            return "mati";
        }
    }
    public String getStatus() {
        if (isHungry) {
            return "Kenyang";
        }
        else {
            return "Lapar";
        }
    }
    public String getFase() {
        return fase;
    }
    public int getHBeli() {
        return hBeli;
    }
    public int getHJual() {
        return hJual;
    }
    public boolean getIsHungry() {
		return isHungry;
	}
	public int getUmur() {
		return umur;
	}
    //Setter
	public void setUmur(int umur) {
		this.umur = umur;
	}
    public void setIsHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setLokasi(Koordinat lokasi) {
        this.lokasi = lokasi;
    }
    public void setStatus(boolean status) {
        this.isHungry = status;
    }
    public void setIsAlive(boolean status) {
        this.isAlive = isAlive;
    }    
    public void setJenis(String jenis) {
		this.jenis = jenis;
	}
	public void setFase(String fase) {
		this.fase = fase;
	}
	public void setHBeli(int hBeli) {
		this.hBeli = hBeli;
	}
	public void setHJual(int hJual) {
		this.hJual = hJual;
	}
	
    //Method
    public void tambahUmur() {
		umur++;
	}
    public void ubahFase(){
        if(fase == "Kecil"){
            if(umur==fKecil){
                fase="Besar";
                umur = 0;
            }
        } else if(fase == "Besar"){
            if(umur==fBesar){
                fase="Panen";
                umur = 0 ;
            }
        } else {
            tambahUmur();
        }
    }
}
