import java.util.Scanner;

public class HomeWork6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter three numbers");
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int num3 =sc.nextInt();
        if(num1>num2) {
            if (num1 > num3)
                System.out.println("First number is the largest");
            else
                System.out.println("Third number is the largest");
        }
        else if(num2 >num3)
            System.out.println("second number is the largest");
        else
            System.out.println("Third number is the largest");



    }
}
