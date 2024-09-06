import java.util.Random;
import java.util.Scanner;

public class Main {
    static int[][] matriz00;

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        while (true){
        System.out.println("----- Menú -----");
        System.out.println("1. Crear matriz");
        System.out.println("2. Llenar matriz");
        System.out.println("3. Mostrar fila");
        System.out.println("4. Matriz cero");
        System.out.println("5. salir");
        System.out.print("Seleccione una opción: ");
        int opcion = leerOpcion();
        ejecucion(opcion);}


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
                System.out.println(fila00);
                break;
            case 4:
                matrizCero(matriz00);
            case 5:
                break;
        }
    }

    public static boolean matrizCero(int[][] matriz) {

        int contadorDeCeros = 0;
        int totalElementos = matriz.length * matriz[0].length;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    contadorDeCeros += 1;
                }
            }
        }

        int porcentaje = (contadorDeCeros * 100) / totalElementos;
        if(porcentaje>50){
            return true;
        } else {return false;}
    }

    public static int leerUnicaFila() {
        Scanner sc = new Scanner(System.in);
        int filaUnica = sc.nextInt();
        return filaUnica;
    }

    public static int leerFilas() {
        Scanner cs = new Scanner(System.in);
        System.out.println("ingrese numero de filas");
        int filas = cs.nextInt();
        return filas;
    }

    public static int leerColumnas() {
        Scanner cs = new Scanner(System.in);
        System.out.println("ingrese numero de columnas");
        int columnas = cs.nextInt();
        return columnas;
    }

    public static boolean validarValores(int filas, int columnas) {
        if (filas > 0 && columnas > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int[][] crearMatriz(int filas, int columnas, boolean estado) {
        if (estado == true) {
            int[][] matriz = new int[filas][columnas];
            return matriz;
        } else {
            return null;
        }
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        Random rnum = new Random();
        int[] valores = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int nroRandom = rnum.nextInt(valores.length);
                matriz[i][j] = valores[nroRandom];
            }
        }
        return matriz;
    }

    public static int leerOpcion() {
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        return opcion;
    }

    public static int[] mostrarFila(int fila, int[][] matriz) {
        int f = fila - 1;
        int[] filaMostrar = new int[matriz[f].length];

        for (int j = 0; j < matriz[f].length; j++) {
            filaMostrar[j] = matriz[f][j];
        }
        return filaMostrar;
    }


}//class