/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author feisal
 */
//Masih belum, dibuat cuma untuk membantu instansiasi inventori pemain
public class Inventori implements Printable{
   
   private String nama;
   
   public Inventori (String nama){
        this.nama = nama;
   }
   
   public void setNama(String nama){
       this.nama=nama;
   }
   
   public String getNama(){
       return nama;
   }
   
   public void cetakInventori(){
       System.out.println("Yang ada di dalam Inventory " + nama);
   }
}
