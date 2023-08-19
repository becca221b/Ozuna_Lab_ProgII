package recursividad;

import java.util.Scanner;

public class FactorialConSobrecarga {

    //Función iterativa para encontrar el factorial de un número
    public static long factorial(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Insert a number: ");
        int num= scanner.nextInt();
        long fact= 1;
        //ciclo para calcular el producto de todos los enteros positivos menores o iguales a n
        for(int i=1;i<=num;i++){
            fact= fact*i;
        }
        System.out.print("The Factorial of " + num + " is: ");
        return fact;
    }

    //Función recursiva para calcular el factorial de un número
    public static long factorial(int num){
        long result;

        if(num<1){
            result= 1;
        }else{
            //se llama a la función hasta que el
            result= num*factorial(num-1);
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Insert a number: ");
        int num= scanner.nextInt();
        //Se imprime resultado de función recursiva
        System.out.println("The Factorial of " + num + " is "+factorial(num)+"\n");

        //Se imprime Resultado de la función iterativa
        System.out.println(factorial());
    }
}
