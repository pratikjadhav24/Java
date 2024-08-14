import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("1.Add\n2.Sub\n3.Multi\n4.Div");
        

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your choice : ");
        int num= scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("enter first number : ");
        int num2= scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("enter second number: ");
        int num3= scanner.nextInt();

        switch (num) {
            case 1:
                int add=num2+num3;
                System.out.println(add);
                break;
                
            case 2:
                int sub=num2-num3;
                System.out.println(sub);
                break;

            case 3:
                int multi=num2*num3;
                System.out.println(multi);
                break;

            case 4:
                double div=num2%num3;
                System.out.println(div);
                break;
            default:
                System.out.println("wrong choice");
                break;
        }

    }
}
