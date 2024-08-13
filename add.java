import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter first number:");
        int num1= scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("enter second number:");
        int num2 = scanner2.nextInt();
        int sum= num1 + num2;
        System.out.println("output : " +sum);

    }
    
}
