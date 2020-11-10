import java.util.Scanner;

public class Actividad6 {

    public static void main(String[] args) {
        Actividad6 programa = new Actividad6();
        programa.sumaDigitos();
    }

    public void sumaDigitos() {
        Scanner scanner = new Scanner(System.in);
        long numero = scanner.nextLong();
        System.out.println("La suma de los dígitos es " + sumaDigitos(numero));
    }

    public int sumaDigitos(long numero) {
        int suma = 0;

        do {
            suma += numero % 10;
            numero /= 10;
        }while (numero != 0);

        return suma;
    }

}
