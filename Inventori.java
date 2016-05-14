public class Inventori implements Printable{
   //Atribut
   private String nama;
   
   //Konstruktor
   public Inventori (String nama){
        this.nama = nama;
   }
   
   //Getter
   public String getNama(){
       return nama;
   }
   
   //Setter
   public void setNama(String nama){
       this.nama=nama;
   }
   
   //Method
   public void cetakInventori(){          //Belum diperlukan
       System.out.println("Yang ada di dalam Inventory " + nama);
   }
}
