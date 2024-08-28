import java.util.Scanner;

public class digitsum {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        
        int sum = 0;
        for (char digit : input.toCharArray()) {
            if (Character.isDigit(digit)) {
                sum += Character.getNumericValue(digit);
            }
        }
        
        System.out.println("Sum of the digits: " + sum);
        
        scanner.close();
    }

}
