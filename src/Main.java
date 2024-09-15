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

        } else if (ejercicio == 3) {

            System.out.println("Porfavor ingrese el tamaño del arreglo");
            int arraylng = sc.nextInt();
            System.out.println(" El arreglo se llenara con multiplos de un numero, ingrese el numero que desea");
            int num = sc.nextInt();

            int[] array = new int[arraylng];

            fun.rellenarArray(array, num);
            fun.mostrarArray(array);

        } else if (ejercicio == 2) {

            int[] array = new int[5];
            fun.rellarArrayPorConsola(array);
            fun.mostrarArray(array);
        } else if (ejercicio == 4) {

            double[] array = new double[5];
            fun.rellarArrayPorConsola(array);
            System.out.println("En el arreglo :");
            fun.mostrarArray(array);
            System.out.println("El elemento de mayor denominacion es: ");
            System.out.println(fun.determinarMeyorInArray(array));
            System.out.println("Y el elemento de menor denominacion es: ");
            System.out.println(fun.determinarMenorInArray(array));
            System.out.println(" y el rango entre ellos dos es:" + (fun.determinarMeyorInArray(array) - fun.determinarMenorInArray(array)));

        } else if (ejercicio == 5) {

            int[] array = new int[100];
            fun.rellenarArregloParOImpar(array, 2);
            double prom = 0;
            int mayores = 0;
            int iguales = 0;
            int menores = 0;

            for (int i = 0; i < array.length; i++) {
                prom += array[i];
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

        } else if (ejercicio == 6) {

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

            }else{
                System.out.println("El elemento "+array[posicion]+" se encuentra dentro del arreglo en la posicion "+posicion);

        }


    }

}
}