public class Actividad8 {
    public static void main(String[] args) {

        imprimeCabecera();

        for (int i =1,j=20; i<=10; i++,j+=5) {
            imprimeFila(i, j);
        }
    }


    public static void imprimeCabecera() {
        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
        System.out.println("_______________________________________");
    }


    public static void imprimeFila(double millas, double kms) {
        System.out.println(
                    millas +
                        "\t" + millasAKms(millas) +
                        "\t|\t"+ kms + "\t" + kmsAMillas(kms));
    }

    // Falta implementar
    public static double kmsAMillas(double kilometros) {
        return 0.;
    }

    // Falta implementar
    public static double millasAKms(double millas) {
        return 0.;
    }

}
