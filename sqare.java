import java.util.Scanner;

public class sqare {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = scanner.nextInt();

        int Square = num * num;
        int cube = num * num * num;
        System.out.println("Square : "+Square+"\nCube : "+cube);
    }
}
