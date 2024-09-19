import java.util.Random;
import java.util.Scanner;

public class Funciones {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void rellenarArrayRandom(int[]array){

        for (int i = 0; i < array.length; i++){
            int num = rd.nextInt(50)+1;
            array[i] = num;

        }
    }

    public void rellenarArray(int[]array, int num){
        int x = num;
        for (int i = 0; i < array.length; i++){

            array[i] = x + num;
            x=x+num;

        }
    }

    public void rellenarArrayPorConsola(int[]array){

        for(int i = 0; i < array.length; i++){
            System.out.println("ingrese el elemento");
            array[i]=sc.nextInt();
        }
    }

    public void rellenarArrayPorConsola(double[]array){

        for(int i = 0; i < array.length; i++){
            System.out.println("ingrese el elemento un elmento");
            array[i]=sc.nextDouble();
        }
    }

    public void mostrarArray(int[] array){

        for (int i : array) System.out.print(i + " ; ");

    }

    public void mostrarArray(double[] array){

        for (double i : array) System.out.print(i + " ; ");

    }

    public double determinarMeyorInArray(double[] array){

        double numeroMayor = 0;
        for (double j : array) {
            if (j > numeroMayor) numeroMayor = j;
        }
        return numeroMayor;

    }

    public double determinarMenorInArray(double[] array){

        double numeroMenor = array[0];
        for (double j : array) {
            if (j < numeroMenor) numeroMenor = j;
        }
        return numeroMenor;

    }

    public void rellenarArregloParOImpar(int[]array,int num){

        for (int i = 0; i < array.length; i++){
            Random rd = new Random();
            int n=rd.nextInt(100)+1;
            if(num==2){
                if (n%2==0)
                    array[i]=n;
            }else{
                if(n%2!=0){
                    array[i]=n;
                }
            }
        }
    }

    public void ordenarArregloMenorMayor(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}


