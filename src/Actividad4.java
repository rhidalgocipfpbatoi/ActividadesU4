import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        int maximo = mayor3Numeros(numero1, numero2, numero3);
        System.out.println("El máximo es " + maximo);
    }

    public static int mayor3Numeros(int num1, int num2, int num3) {

        int maximo1y2 = maximo(num1, num2);
        return maximo(maximo1y2, num3);
    }

    public static int maximo(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        }
        return num2;
     }

}
