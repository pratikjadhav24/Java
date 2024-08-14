import java.util.Scanner;

public class max_three {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
         @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number:");
        int num1 = scanner.nextInt();

        @SuppressWarnings("resource")
        Scanner scanner2 =  new Scanner(System.in);
        System.out.print("enter second number:");
        int num2 = scanner2.nextInt();

        
        @SuppressWarnings("resource")
        Scanner scanner3 =  new Scanner(System.in);
        System.out.print("enter third number:");
        int num3 = scanner2.nextInt();
        if ((num1 > num2)&& (num1>num2)){
            System.out.println("first number is greater");
        }
        else if ((num2>num1)&& (num2>num3)){
            System.out.println("second number is greater");
        
        }
        else if ((num3>num1)&&(num3>num2)) {
            System.out.println("third number is greater");
        }
        else{
            System.out.println("all number are equal");    
        }
    }
    
}
