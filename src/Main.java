import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int arreglo[]= new int[3];

        System.out.println("Ingrese 3 numeros");
        Scanner scanner= new Scanner(System.in);
        arreglo[0]= scanner.nextInt();
        arreglo[1]= scanner.nextInt();
        arreglo[2]= scanner.nextInt();

        Arrays.sort(arreglo);

        System.out.println(Arrays.toString(arreglo));
    }

}

