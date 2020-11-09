/**
 * Número pentagonal
 */
public class Actividad5 {

    public static void main(String[] args) {
        Actividad5 programa = new Actividad5();
        programa.inicio();
    }

    public void inicio() {

        for (int i = 1; i <= 3; i++ ) {
            System.out.printf(
                    "Para n=%2d -> %7d",
                    i, numeroPentagonal(i)+'\n');
        }
    }

    public int numeroPentagonal(int n) {
        return n*(3*n-1)/2;
    }

}
