import java.util.Scanner;

public class reverse_table {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num =scanner.nextInt();

        for(int i=10; i>0; i--){
            System.out.println(i* num);
        }
}
}
