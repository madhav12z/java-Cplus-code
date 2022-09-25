import java.util.Scanner;
public class take_value {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("you are welcome here");
            int a = sc.nextInt();
            int b= sc.nextInt();
            int c;
            c=a+b;
            System.out.println("answer to your sum is :  ");
            System.out.println(c);
        }

    }
}
