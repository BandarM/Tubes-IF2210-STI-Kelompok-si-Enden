public interface Printable {
    //Atribut

    //Konstruktor

    //Getter

    //Setter

    //Method
    default void prt(String s) {
        System.out.print(s);
    }
    default void prt(Object o) {
        System.out.print(o);
    }
    default void prt(boolean b) {
        System.out.print(b);
    }
    default void prt(char c) {
        System.out.print(c);
    }
    default void prt(char[] c) {
        System.out.print(c);
    }
    default void prt(double d) {
        System.out.print(d);
    }
    default void prt(float f) {
        System.out.print(f);
    }
    default void prt(int i) {
        System.out.print(i);
    }
    default void prt(long l) {
        System.out.print(l);
    }
    default void prt() {
        System.out.print("> ");
    }
    default void prtln(String s) {
        System.out.println(s);
    }
    default void prtln(Object o) {
        System.out.println(o);
    }
    default void prtln(boolean b) {
        System.out.println(b);
    }
    default void prtln(char c) {
        System.out.println(c);
    }
    default void prtln(char[] c) {
        System.out.println(c);
    }
    default void prtln(double d) {
        System.out.println(d);
    }
    default void prtln(float f) {
        System.out.println(f);
    }
    default void prtln(int i) {
        System.out.println(i);
    }
    default void prtln(long l) {
        System.out.println(l);
    }
    default void prtln() {
        System.out.println();
    }
}
