import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    System.out.print(" enter temp in fahrenheit : ");

    double fahrenheit = scanner.nextDouble();

    double celcius = (fahrenheit -32)* (5.0 / 9.0);
    System.out.println("temp in celcius : "+celcius);
    }
    
}
