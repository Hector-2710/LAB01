import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        System.out.println("----- Menú -----");
        System.out.println("1. Crear matriz");
        System.out.println("2. Llenar matriz");
        System.out.println("3. Mostrar fila");
        System.out.println("3. Matriz cero");
        System.out.print("Seleccione una opción: ");
        int opcion = leerOpcion();
        ejecucion(opcion);
    }

    public static void ejecucion(int opcion) {
        int filas = leerFilas();
        int columnas = leerColumnas();
        boolean verificacion = validarValores(filas, columnas);
        int[][] matriz00 = crearMatriz(filas, columnas, verificacion);

        switch (opcion) {
            case 1:


                break;
            case 2:
                llenarMatriz(matriz00);
        }

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
        return null; }
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        Random rnum = new Random();
        int [] valores = {0,1,2,3,4,5,6,7,8,9};
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
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

    public static int [] mostrarFila(int fila, int [][]matriz){
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                matriz[n]
            }
        }
    }


}//class