public class Tanaman {
    //Atribut
    private String nama;
    private String jenis;
    private boolean status;
    private Koordinat posisi;
    private Fase fase;
    private int hBeli;
    private int hJual;
    private int fBibit;
    private int fKecambah;
    private int fTumbuhan;
    private int fPanen;
    private int umur;
    
    //Konstruktor
    public Tanaman(String nama,String jenis, Koordinat posisi, int hB, int hJ, int fB, int fK, int fT, int fP){
        this.nama = nama;
        this.jenis = jenis;
        posisi = new Koordinat (posisi);
        this.fase = Fase.BIBIT;
        status = false;
        hBeli = hB;
        hJual = hJ;
        fBibit = fB;
        fKecambah = fK;
        fTumbuhan = fT;
        fPanen = fP;
        umur = 0;
    }

    //Getter
    public int getHBeli (){
        return hBeli;
    }
    public int getHJual (){
        return hJual;
    }
    public Koordinat getPosisi(){
        return posisi;
    }
    public boolean getStatus(){
        return status;
    }
    public String getNama (){
        return nama;
    }
    public String getJenis(){
        return jenis;
    }
    public Fase getFase(){
        return fase;
    }
    public int getUmur() {
        return umur;
    }

    //Setter
    public void setHBeli(int hBeli){
        this.hBeli = hBeli;
    }
    public void setHJual(int hJual){
        this.hJual = hJual;
    }
    public void setPosisi(Koordinat posisi){
        this.posisi = posisi;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setFBibit(){
        this.fase = Fase.BIBIT;
    }
    public void setFKecambah(){
        this.fase = Fase.KECAMBAH;
    }
    public void setFTumbuhan(){
        this.fase = Fase.TUMBUHAN;
    }
    public void setFPanen(){
        this.fase = Fase.PANEN;
    }
    
    //Method
    public void ubahFase(){
        if(fase == Fase.BIBIT){
            if(umur==fBibit){
                fase=Fase.KECAMBAH;
                umur = 0;
            }
        }
        if(fase == Fase.KECAMBAH){
            if(umur==fKecambah){
                fase=Fase.TUMBUHAN;
                umur =0 ;
            }
        }
        if(fase == Fase.TUMBUHAN){
            if(umur==fTumbuhan){
                fase=Fase.PANEN;
                umur =0;
            }
        }
    }
    public void tambahUmur() {
        umur++;
    }
    public void layu() {
        int waktuAwal = 0;
        if(!status) {
            waktuAwal = umur;
        }
        if(umur-waktuAwal == 4) {
            fase = Fase.LAYU;
        }
    }
}
