import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		
		Pemain utama = new Pemain("Bandar");
		
		Waktu waktu = new Waktu();
		Thread t = new Thread(waktu);
		t.start();
		
		for(i=0; i<10; i++) {
			utama.cetakPosisi();
			utama.prtln("Waktu sekarang " + waktu.toString());
			utama.prt("> ");
			utama.moveChar(input.next().charAt(0), utama);
			utama.prt("\n");
		}
	}
}
