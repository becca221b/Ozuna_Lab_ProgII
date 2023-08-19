package recursividad;

import java.util.Scanner;
public class DivisionConRestas{

    //División con recursividad
    public static int division(int dividend,int divider){
        int result;
        //Cuando el dividendo sea menor que el divisor
        //El resultado es 0
        if(dividend<divider){
            result=0;
        }else{
            //Se resta dividendo-divisor, el resultado será el nuevo valor del dividendo
            dividend= dividend - divider;
            //Se suma +1 al contador por cada vez que resta
            //y se llama de vuelta a la función hasta que ésta 0
            result= 1+division(dividend,divider);
        }
        return result;
    }

    //Division con iteración
    public static int division(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Insert the dividend: ");
        int dividend= scanner.nextInt();
        System.out.println("Insert the divider: ");
        int divider= scanner.nextInt();
        int result=0;
        while(dividend>=divider){
            dividend= dividend-divider;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(division(12, 4));

        System.out.println(division());
    }
}
