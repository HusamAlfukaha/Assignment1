package Assignemnt1.Type1;

public class Application {

    public static int summation (int n1 ,int n2){
        return n1+n2;
    }
    public static int summation (int n1 ,int n2,int n3){
        return n1+n2+n3;
    }
    public static double summation (double n1 ,double n2){
        return n1+n2;
    }

    public static void main(String[] args) {
        System.out.println("summation(10,20) = " + summation(10, 20));
        System.out.println("summation(15.3 ,16) = " + summation(15.3, 16));

    }

}
