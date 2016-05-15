public class Pemain implements Moveable, Printable{
    //Atribut
    private static String nama;
    private static int gold;
    private static Koordinat posisi;
    private static Inventori tas;

    //Konstruktor
    public Pemain(String nama) {
        this.nama = nama;
        gold = 500;
        posisi = new Koordinat();
        posisi.setArah(Orientasi.BAWAH);
        tas = new Inventori();
    }
    public Pemain(String nama, int gold, Koordinat posisi, Inventori tas) {
        this.nama = nama;
        this.gold = gold;
        this.posisi = posisi;
        this.tas = tas;
    }

    //Getter
    public String getNama() {
        return nama;
    }
    public int getGold() {
        return gold;
    }
    public Koordinat getPosisi() {
        return posisi;
    }
    public Inventori getTas() {
        return tas;
    }

    //Setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public void setPosisi(Koordinat posisi) {
        this.posisi = posisi;
    }
    public void setTas(Inventori tas) {
        this.tas = tas;
    }

    //Method
    public void cetakPosisi() {
        prtln("Posisi pemain adalah " + posisi);
    }
    public String toString() {
        String r1 = new String("[" + nama + "]\n");
        String r2 = new String("  Uang " + gold + " G\n");
        String r3 = new String("  Lokasi " + posisi + "\n");
        String r4 = new String(tas.toString());
        
        return (r1 + r2 + r3 + r4);
    }
    public boolean isCollide() {
    //Fungsi untuk mengecek apakah posisi player berhimpitan dengan objek lain
        return false;
    }
	
    //Nested Class
    public class Interaksi {
        //Atribut

        //Konstruktor

        //Getter

        //Setter

        //Method
        public void bukaPintu() {
            if(posisi.getArah() == Orientasi.ATAS) {
                posisi.setY(posisi.getY() - 2);
            }
            if(posisi.getArah() == Orientasi.KANAN) {
                posisi.setX(posisi.getX() + 2);
            }
            if(posisi.getArah() == Orientasi.BAWAH) {
                posisi.setY(posisi.getY() + 2);
            }
            if(posisi.getArah() == Orientasi.KIRI) {
                posisi.setX(posisi.getX() - 2);
            }
        }
        public void dropItem() {
            //Prosedur untuk menjatuhkan item. Menjatuhkan item selain ke bin akan sama efeknya dengan menghapus item tersebut.
        }
        public void isiMakanan() {
            //Prosedur untuk mengisi makanan di kotak makanan hewan
        }
        public void panen() {
            //Prosedur untuk memanen tanaman, telor ayam, susu sapi, dan bulu domba
        }
        public void tidur() {
            //Prosedur untuk melanjutkan ke hari selanjutnya
        }
        public void save() {
            //Prosedur untuk mengesave keadaan permainan. Bisa jadi pindah ke kelas lain
        }
        public void beliBarang() {
            //Prosedur untuk membeli barang dari rumah
        }
        public void cangkul() {
            //Prosedur untuk mengubah lahan menjadi lahan siap tanam
        }
        public void siram() {
            //Prosedur untuk menyiram tanaman
        }
        public void tanam() {
            //Prosedur untuk menanam tanaman
        }
    }
}
