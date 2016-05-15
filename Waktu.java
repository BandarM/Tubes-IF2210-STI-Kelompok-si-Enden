public class Waktu implements Runnable, Printable {
	//Atribut
	private static int jam;
	private static int menit;
	
	//Konstruktor
	
	//Getter
	
	//Setter
	
	//Method
	public void run() {
		newDay();
		advWaktu();
	}
	public String toString() {
		if(jam<10) {
			if(menit<10) {
				return "0" + jam + ":0" + menit;
			} else {
				return "0" + jam + ":" + menit;
			}
		} else {
			return jam + ":" + menit;
		}
	}
	public void newDay() {
		jam = 6;
		menit = 0;
	}
	public void advWaktu() {
		int i, j;

		try{
			for(i=jam; i<24; i++) {
				for(j=menit; j<6; j++) {
					Thread.sleep(10000);
					menit+=10;
				}
				jam++;
				menit = 0;
			}
			jam = 0;
			for(i=jam; i<3; i++) {
				for(j=menit; j<6; j++) {
					Thread.sleep(10000);
					menit+=10;
				}
				jam++;
				menit = 0;
			}
		} catch(InterruptedException e) {
			prtln("Thread is interrupted");
		}
	}
}
