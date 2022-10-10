import java.util.Scanner;  // Import the Scanner class

public class Eighth {

    public static int func(int c1, int c2){
        int maximum = c1+c2-1;
        return maximum;

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int a = Integer.valueOf(obj.nextLine());  // Read user input
        int b = Integer.valueOf(obj.nextLine());

        System.out.print(func(a,b));
    }

}
