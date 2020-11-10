public class Actividad9 {
    public static void main(String[] args) {

        for (int i = 2014; i<=2034; i++) {
            System.out.println(
                    "Días de año " + i + ": "
                            + numeroDias(i) + " días");
        }
    }

    public static int numeroDias(int anyo) {

        if (esBisiesto(anyo)) {
            return 366;
        }

        return 365;
    }

    // Falta implementar
    public static boolean esBisiesto(int anyo) {
        return true;
    }

}
