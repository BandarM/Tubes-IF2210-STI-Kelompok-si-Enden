public class Items {
    //Atribut
    private String nama;
    private int jumlah;

    //Konstruktor
    public Items(String s){
        nama = s;
        jumlah = 0;
    }

    //Getter
    public String getNama(){
        return nama;
    }
    public int getJumlah(){
        return jumlah;
    }

    //Setter
    public void setNama(String s){
        nama = s;
    }
    public void setJumlah(int j) {
        jumlah = j;
    }
}
