public class Actividad7 {

    public static void main(String[] args) {

        esCaracterMayuscula('z');
        esCaracterMayuscula('A');
        esCaracterMayuscula('p');

        esCaracterBlanco('a');
        esCaracterBlanco(' ');

    }

    public static void esCaracterMayuscula(char caracter) {

        System.out.print("¿Es " + caracter +
                " mayúscula? :" + Character.isUpperCase(caracter) + "\n");

    }

    public static void esCaracterBlanco(char caracter) {

        System.out.print("¿Es " + caracter +
                " blanco? :" + Character.isWhitespace(caracter) + "\n");

    }

}
