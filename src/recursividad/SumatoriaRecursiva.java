package recursividad;

public class SumatoriaRecursiva {
    public static int add(int num){
        if(num==0){
            return 0;
        }else{
            return num+ add(num-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(add(5));
        System.out.println(add(10));
    }
}


