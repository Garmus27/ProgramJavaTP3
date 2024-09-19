import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funciones fun = new Funciones();

        System.out.println("Indique el ejercicio a revisar");
        int ejercicio = sc.nextInt();

        if (ejercicio == 1) {

            System.out.println(" que sucede si intentamos acceder a un elemento que se encuentra fuera del tamaño el Array?");

            System.out.println(" Nos arroja el error INDEX OUT OF RANGE");

        }
        else if (ejercicio == 3) {

            System.out.println("Porfavor ingrese el tamaño del arreglo");
            int arraylng = sc.nextInt();
            System.out.println(" El arreglo se llenara con multiplos de un numero, ingrese el numero que desea");
            int num = sc.nextInt();

            int[] array = new int[arraylng];

            fun.rellenarArray(array, num);
            fun.mostrarArray(array);

        }
        else if (ejercicio == 2) {

            int[] array = new int[5];
            fun.rellenarArrayPorConsola(array);
            fun.mostrarArray(array);
        }
        else if (ejercicio == 4) {

            double[] array = new double[5];
            fun.rellenarArrayPorConsola(array);
            System.out.println("En el arreglo :");
            fun.mostrarArray(array);
            System.out.println("El elemento de mayor denominacion es: ");
            System.out.println(fun.determinarMeyorInArray(array));
            System.out.println("Y el elemento de menor denominacion es: ");
            System.out.println(fun.determinarMenorInArray(array));
            System.out.println(" y el rango entre ellos dos es:" + (fun.determinarMeyorInArray(array) - fun.determinarMenorInArray(array)));

        }
        else if (ejercicio == 5) {

            int[] array = new int[100];
            fun.rellenarArregloParOImpar(array, 2);
            double prom = 0;
            int mayores = 0;
            int iguales = 0;
            int menores = 0;

            for (int j : array) {
                prom += j;
            }
            prom = prom / array.length;

            for (int i = 0; i < array.length; i++) {
                if (i > prom) {
                    mayores++;
                } else if (i < prom) {
                    menores++;
                } else {
                    iguales++;
                }
            }

            System.out.println("El promedio de los elementos del arreglo es de: " + prom);
            System.out.println("Existen " + mayores + " elementos mayores al promedio");
            System.out.println("Existen " + iguales + " elementos iguales al promedio");
            System.out.println("Existen " + menores + " elementos menores al promedio");

        }
        else if (ejercicio == 6) {

            int[] array = new int[50];
            fun.rellenarArrayRandom(array);
            int posicion = 0;

            System.out.println("Ingrese un numero a buscar dentro del arreglo");
            int num = sc.nextInt();
            boolean found = false;

            for (int i = 0; i < array.length; i++) {

                if (num == array[i]) {
                    found = true;
                    posicion = i;
                    break;
                }
            }

            if (!found) {
                System.out.println("El elemento no se encuentra en el arreglo");

            } else {
                System.out.println("El elemento " + array[posicion] + " se encuentra dentro del arreglo en la posicion " + posicion);

            }


        }
        else if (ejercicio == 7) {

            System.out.println("Ingrese el tamaño del arreglo que desea llenar con numeros enteros aleatorios");
            int longitud = sc.nextInt();
            int[] array = new int[longitud];
            fun.rellenarArrayRandom(array);
            int sumaPar = 0;
            int sumaImpar = 0;
            for (int j : array) {

                if (j % 2 == 0) {
                    sumaPar += j;
                } else {
                    sumaImpar += j;
                }

            }
            System.out.println("En el arreglo: ");
            fun.mostrarArray(array);
            System.out.println("La suma de numeros pares es de: " + sumaPar);
            System.out.println("y la suma de numeros impares es de: " + sumaImpar);

        }
        else if (ejercicio == 8) {


            int[]array = new int[]{1, 2, 3, 4, 5, 69, 78, 12, 36,21};
            //fun.rellenarArrayPorConsola(array);
            int x = array.length;

            int[] array2 = new int[10];

            fun.ordenarArregloMenorMayor(array);

            for (int i = 0; i<array.length; i++) {
                array2[i] = array[x-1];
                x=x-1;
            }

            fun.mostrarArray(array);
            System.out.println("");
            fun.mostrarArray(array2);

        }
        else if (ejercicio == 9) {
            System.out.println("Ingrese una cadena de 5 numeros separados por un guion medio");
            String cadena = sc.next();

            String[] cadenaSpliteada = cadena.split("-");

            System.out.println("Para el arreglo :");
            int totalSuma=0;
            for (String s : cadenaSpliteada) {
                totalSuma += Integer.parseInt(s);
                System.out.print(s);
            }
            System.out.println("La suma de los 5 numeros es: "+totalSuma);


        }
        else if (ejercicio == 10) {

            String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

            System.out.println("Ingrese se numero de Documento");
            int dni = sc.nextInt();
            System.out.println("Tu Dni completo es: "+dni+"-"+letras[(dni%23)]);

        }
        else if (ejercicio == 11) {
            int[] array = new int [5];
            int[] array2 = new int [10];
            int[] array3= new int[5];
            int sumatoria=0;

            fun.rellenarArrayPorConsola(array);
            fun.rellenarArrayPorConsola(array2);

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    sumatoria = sumatoria + (array[i] * array2[j]);
                }
                array3[i] = sumatoria;
            }
            System.out.println("Arreglo 1 :");
            fun.mostrarArray(array);
            System.out.println("Arreglo 2 :");
            fun.mostrarArray(array2);
            System.out.println("Arreglo 3 :");
            fun.mostrarArray(array3);

        }
        else if (ejercicio == 12) {
            int[] array = new int [5];
            int nuevoArrayLong = array.length;
            fun.rellenarArrayPorConsola(array);
            System.out.println("Ingrese un numero para buscar dentro del arreglo");
            int num = sc.nextInt();
            int x = 0;

            for (int j : array) {
                if (num == j) {
                    nuevoArrayLong = nuevoArrayLong - 1;
                }
            }

            int[] array2 = new int[nuevoArrayLong];

            for (int i = 0; i < nuevoArrayLong; i++) {
                if(array[i]!=num){
                    array2[x] = array[i];
                    x++;
                }
            }
            fun.mostrarArray(array2);

        }
    }
}