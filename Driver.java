import java.util.Scanner;

public class Driver implements Printable {
    //Atribut
    private static Scanner input = new Scanner(System.in);
    
    //Konstruktor
    
    //Getter
    
    //Setter
    
    //Method
    public void menu() {
        prtln("1. New Game");
        prtln("2. Load Game");
        prtln("3. Exit Game");
        prtln();
        prt();
    }
    
    public void newGame() {
        prtln("Masukkan nama karakter Anda");
        prt();
        Pemain utama = new Pemain(input.next());
	Waktu waktu = new Waktu();
	Thread t = new Thread(waktu);
	t.start();
        
        prt(utama);
    }
    
    public void loadGame() {
        
    }
    
    public static void main(String[] args) {
        Driver game = new Driver();
        int i;
        
        do {
            game.menu();
            i = input.nextInt();
            game.prtln();
        } while (i<1 || i>3);
        
        switch(i) {
            case 1  : game.newGame();
                    break;
            case 2  : game.loadGame();
                    break;
            case 3  : System.exit(0);
                    break;
        }
    }
}
