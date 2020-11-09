import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        mayor3Numeros();
    }

    public static void mayor3Numeros() {
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int maximo1y2 = maximo(numero1, numero2);

        int numero3 = scanner.nextInt();
        int max = maximo(maximo1y2, numero3);

        System.out.println("El máximo es " + max);
    }

    public static int maximo(int num1, int num2) {
        // Opción 1
       /* if (num1 > num2) {
            return num1;
        }else {
            return num2;
        }*/
        // Opción 2
        /*
        int mayor;
        if (num1 > num2) {
            mayor = num1;
        }else {
            mayor = num2;
        }
        return mayor;
         */
        //Opción 3
        /*if (num1 > num2) {
            return num1;
        }
        return num2;*/

        //Opción 4
        return (num1 > num2) ? num1 : num2;
     }

}
