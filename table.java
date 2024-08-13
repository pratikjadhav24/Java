import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num =scanner.nextInt();

        for(int i=1; i<11; i++){
            System.out.println(num *i );
        }
    }
    
}
