import java.util.Scanner;

public class Actividad6 {

    public static void main(String[] args) {

    }

    public void sumaDigitos() {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int suma = 0;

        do {
            suma += numero % 10;
            numero /= 10;
        }while (numero != 0);

        System.out.println("La suma de los dígitos es " + suma);
    }

}
