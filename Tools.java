public class Tools extends Inventori{
	//Atribut
	private String nama;
	private boolean statusPakai;
	
	//Konstruktor
	public Tools(String s){
		super(s);
		statusPakai = false;
	}

	//Getter
	public String getNama(){
		return nama;
	}	
	public boolean getStatusPakai(){
		return statusPakai;
	}
	
	//Setter
	public void setNama(String s){
		nama = s;
	}
	public void setStatusPakai(boolean b) {
		statusPakai = b;
	}
	
	//Method
	public void ubahStatusPakai(){
		if(!statusPakai){
			statusPakai = true;
		}else{
			statusPakai = false;
		}
	}
}
