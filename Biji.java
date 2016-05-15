public class Biji extends Tools {
	//Atribut
	private int jumlah;
	private String jenis;
	
	//Konstruktor
	public Biji(String s, String jenis) {
		super(s);
		this.jenis = jenis;
		this.jumlah = 5;
	}
	
	//Getter
	public int getJumlah() {
		return jumlah;
	}
	
	//Setter
	
	//Method
	public void pakai() {
		jumlah--;
	}
}
