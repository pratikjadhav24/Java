import java.util.Scanner;
public class week {
    public static void main(String[] args) {
       Scanner  scanner = new Scanner(System.in);
       System.out.println("enter day number :");
       int num= scanner.nextInt();

       if (num == 1) {
        System.out.println("Monday");
       }
       else if (num== 2) {
        System.out.println("Tuesday");
       }
       else if (num== 3) {
        System.out.println("wednesday");
       }
       else if (num== 4) {
        System.out.println("Thursday");
       }
       else if (num== 5) {
        System.out.println("Friday");
       }
       else if (num== 6) {
        System.out.println("Saturday");
       }
       else if (num== 7) {
        System.out.println("Sunday");
       }
       else{
        System.out.println("wrong input");
       }
    }
    
}
