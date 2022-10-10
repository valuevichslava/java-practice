import java.util.Scanner;  // Import the Scanner class

public class Seventh {

    public static int func(int c){
        int sum = 0;
        for(int i = 1; i <= c; i++){
            sum = sum + i;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int a = Integer.valueOf(obj.nextLine());  // Read user input

        System.out.print(func(a));
    }

}