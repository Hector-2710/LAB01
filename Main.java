import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int[][] matriz00;

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        while (true) {
            System.out.println("----- Menu -----");
            System.out.println("1. Crear matriz");
            System.out.println("2. Llenar matriz");
            System.out.println("3. Mostrar fila");
            System.out.println("4. Matriz cero");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = leerOpcion();
            ejecucion(opcion);
        }
    }

    public static void ejecucion(int opcion) {
        switch (opcion) {
            case 1:
                int filas = leerFilas();
                int columnas = leerColumnas();
                boolean verificacion = validarValores(filas, columnas);
                matriz00 = crearMatriz(filas, columnas, verificacion);
                break;
            case 2:
                llenarMatriz(matriz00);
                break;
            case 3:
                int fila = leerUnicaFila();
                int[] fila00 = mostrarFila(fila, matriz00);
                System.out.println(Arrays.toString(fila00));
                break;
            case 4:
                if (matrizCero(matriz00)) {
                    System.out.println("La matriz es nula");
                } else {
                    System.out.println("La matriz no es nula");
                }
                break;
            case 5:
                System.out.println("Saliendo..");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida.");
        }
    }

    public static boolean matrizCero(int[][] matriz) {
        int contadorDeCeros = 0;
        int totalElementos = matriz.length * matriz[0].length;

        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento == 0) {
                    contadorDeCeros++;
                }
            }
        }

        int porcentaje = (contadorDeCeros * 100) / totalElementos;
        return porcentaje > 50;
    }

    public static int leerUnicaFila() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de fila a mostrar:");
        return sc.nextInt();
    }

    public static int leerFilas() {
        Scanner cs = new Scanner(System.in);
        System.out.println("Ingrese numero de filas:");
        return cs.nextInt();
    }

    public static int leerColumnas() {
        Scanner cs = new Scanner(System.in);
        System.out.println("Ingrese numero de columnas:");
        return cs.nextInt();
    }

    public static boolean validarValores(int filas, int columnas) {
        return filas > 0 && columnas > 0;
    }

    public static int[][] crearMatriz(int filas, int columnas, boolean estado) {
        if (estado) {
            return new int[filas][columnas];
        } else {
            System.out.println("Filas y columnas deben ser mayores que cero.");
            return null;
        }
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        Random rnum = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnum.nextInt(10);
            }
        }
        return matriz;
    }

    public static int leerOpcion() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int[] mostrarFila(int fila, int[][] matriz) {
        return matriz[fila - 1];
    }

}//class
