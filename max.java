import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = scanner.nextInt();

        Scanner scanner2 =  new Scanner(System.in);
        System.out.println("enter second number:");
        int num2 = scanner2.nextInt();
        if (num1 > num2){
            System.out.println("first number is greater");
        }
        else if (num1<num2){
            System.out.println("second number is greater");
        
        } else{
            System.out.println("both number are equal");
        }

    }
    
}
