//Masih belum, dibuat cuma untuk membantu instansiasi inventori pemain
public class Inventory<T>{
   
   private T[] bag;
   private String nama;
   
   public Inventory (String nama, T isi){
      int i = 0;
      
      this.nama = nama;
      if (nama="Item"){
         while (i<=11){
            T[i] bag = isi;
         }
      }else{
         T[i] bag = isi;
      }
   }
}
