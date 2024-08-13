import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("enter a number:");
    int num = scanner.nextInt();
    if(num % 2 == 0){
        System.out.println("even");
    }else {
        System.out.println("odd");
    }
    }
    
}
