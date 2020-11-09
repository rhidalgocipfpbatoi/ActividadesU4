public class Actividad1 {

    public static void main(String[] args) {
        Actividad1 programa = new Actividad1();
        programa.inicio();
    }

    public void inicio() {
        tablasMultiplicar();
    }

    public void tablasMultiplicar() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            System.out.println("-------------------");
            tablaMultiplicar(i);
        }
    }

    public void tablaMultiplicar(int multiplicando) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplicando + " X " + i + " = " + (multiplicando * i));
        }
    }

}
