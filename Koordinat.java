public class Koordinat {
    //Atribut
    private int x;
    private int y;
    private Orientasi arah;

    //Konstruktor
    public Koordinat() {
            x = 0;
            y = 0;
            this.arah = Orientasi.BAWAH;
    }
    public Koordinat(int x, int y, Orientasi arah) {
            this.x = x;
            this.y = y;
            this.arah = arah;
    }
    public Koordinat(Koordinat k) {
            x = k.x;
            y = k.y;
            arah = k.arah;
    }

    //Getter
    public int getX() {
            return x;
    }
    public int getY() {
            return y;
    }
    public Orientasi getArah() {
            return arah;
    }

    //Setter
    public void setX(int x) {
            this.x = x;
    }
    public void setY(int y) {
            this.y = y;
    }
    public void setArah(Orientasi arah) {
            this.arah = arah;
    }

    //Method
    public String toString() {
            if(arah == Orientasi.ATAS) {
                    return (x + ", " + y + " dan menghadap ke arah atas");
            } else if(arah == Orientasi.KANAN) {
                    return (x + ", " + y + " dan menghadap ke arah kanan");
            } else if(arah == Orientasi.BAWAH) {
                    return (x + ", " + y + " dan menghadap ke arah bawah");
            } else {
                    return (x + ", " + y + " dan menghadap ke arah kiri");
            }
    }
}
