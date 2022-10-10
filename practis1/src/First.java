import java.util.Scanner;  // Import the Scanner class

public class First {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int chislo1 = Integer.valueOf(obj.nextLine());  // Read user input
        int chislo2 = Integer.valueOf(obj.nextLine());  // Read user input

        System.out.print(chislo1 % chislo2);

    }


}