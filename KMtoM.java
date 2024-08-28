import java.util.Scanner;

public class KMtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print(" enter the distance in KM : ");
        double a=scanner.nextDouble();
        
        double b=a*1000;
        System.out.println("distance in M : " + b);

    }

    
}
