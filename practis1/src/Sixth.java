import java.util.Scanner;  // Import the Scanner class

public class Sixth {

    public static int func(char ch){

        int data = (int) ch;
        return data;

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String a = obj.nextLine();  // Read user input

        char dd= a.charAt(0);
        System.out.print(func(dd));
    }

}