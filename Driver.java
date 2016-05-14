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
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;int neffTas = 0;
		
		Pemain utama = new Pemain("Bona");
		
		Waktu waktu = new Waktu();
		Thread t = new Thread(waktu);
		t.start();
		
		for(i=0; i<10; i++) {
			utama.cetakPosisi();
			utama.prtln("Waktu sekarang " + waktu.toString());
			utama.moveChar(input.next().charAt(0), utama);
                        
                Inventori[] tasTools = new Inventori[20];
                tasTools[0] = new Arit ("Arit");
                tasTools[1] = new Pacul ("Pacul");
                tasTools[2] = new Penyiram ("Penyiram Air");
                tasTools[3] = new Biji ("Biji", "Jagung");
                
                System.out.print("Isi dalam inventory :");
                for (Inventori bag: tasTools){
                    utama.prtln(bag.getNama());
                }
                }
        }
}
