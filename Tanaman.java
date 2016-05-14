public class Tanaman {
    private String nama;
    private String jenis;
    private boolean statussiram;
    private Koordinat posisi;
    private FaseTumbuhan fase;
    private int hargaBeli;
    private int hargaJual;
    private int faseBibit;
    private int faseKecambah;
    private int faseTumbuhan;
    private int fasePanen;
    private int waktuHidup;
    
    public Tanaman(String nama,String jenis, Koordinat posisi){
        this.nama = nama;
        this.jenis = jenis;
        posisi = new Koordinat (posisi);
        this.fase = FaseTumbuhan.BIBIT;
        statussiram = false;
        hargaBeli = 0;
        hargaJual = 0;
    }
    
    public void setHargaBeli(int hargaBeli){
        this.hargaBeli = hargaBeli;
    }
    
    public int getHargaBeli (){
        return hargaBeli;
    }
    
    public void setHargaJual(int hargaJual){
        this.hargaJual = hargaJual;
    }
    
    public int getHargaJual (){
        return hargaJual;
    }
    
    public void setPosisi(Koordinat posisi){
        this.posisi = posisi;
    }
    
    public Koordinat getPosisi(){
        return posisi;
    }
    
    public void setStatus(boolean status){
        this.statussiram = status;
    }
    
    public boolean getStatus(){
        return statussiram;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getNama (){
        return nama;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public void setFaseBibit(FaseTumbuhan fase){
        this.fase = FaseTumbuhan.BIBIT;
    }
    
    public void setFaseKecambah(FaseTumbuhan fase){
        this.fase = FaseTumbuhan.KECAMBAH;
    }
    
    public void setFaseTumbuhan(FaseTumbuhan fase){
        this.fase = FaseTumbuhan.TUMBUHAN;
    }
    
    public void setFasePanen(FaseTumbuhan fase){
        this.fase = FaseTumbuhan.PANEN;
    }
    
    public FaseTumbuhan getFase(){
        return fase;
    }
    
    public void ubahFase(){
        if(fase == FaseTumbuhan.BIBIT){
            if(waktuHidup==faseBibit){
                fase=FaseTumbuhan.KECAMBAH;
                waktuHidup = 0;
            }
        }
        if(fase == FaseTumbuhan.KECAMBAH){
            if(waktuHidup==faseKecambah){
                fase=FaseTumbuhan.TUMBUHAN;
                waktuHidup = 0 ;
            }
        }
        if(fase == FaseTumbuhan.TUMBUHAN){
            if(waktuHidup==faseTumbuhan){
                fase=FaseTumbuhan.PANEN;
                waktuHidup =0;
            }
        }
    }
}
