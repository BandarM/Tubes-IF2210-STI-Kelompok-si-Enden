public interface Moveable { //Menggunakan generic rencananya
	default void moveChar(char input, Pemain p) {
		Koordinat pos = p.getPosisi();

		if(input == 'w') {
			if(pos.getArah() == Orientasi.ATAS) {
				if(pos.getY() != 0) {
					pos.setY(pos.getY() - 1);
				} else {
					//Throw outofbound exception
				}
			} else {
				pos.setArah(Orientasi.ATAS);
			}
		} else if(input == 'd') {
			if(pos.getArah() == Orientasi.KANAN) {
				if(pos.getX() != 30) {
					pos.setX(pos.getX() + 1);
				} else {
					//Throw outofbound exception
				}
			} else {
				pos.setArah(Orientasi.KANAN);
			}
		} else if(input == 's') {
			if(pos.getArah() == Orientasi.BAWAH) {
				if(pos.getY() != 31) {
					pos.setY(pos.getY() + 1);
				} else {
					//Throw outofbound exception
				}
			} else {
				pos.setArah(Orientasi.BAWAH);
			}
		} else if(input == 'a') {
			if(pos.getArah() == Orientasi.KIRI) {
				if(pos.getX() != 0) {
					pos.setX(pos.getX() - 1);
				} else {
					//Throw outofbound exception
				}
			} else {
				pos.setArah(Orientasi.KIRI);
			}
		} else {
			//invalid input exception
		}
	}
}
