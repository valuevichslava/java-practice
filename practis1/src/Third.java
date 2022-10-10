import java.util.Scanner;  // Import the Scanner class

public class Third {

    public static int func(int chislo1, int chislo2, int chislo3){

        int chickens = 2*chislo1;
        int cows = 4*chislo2;
        int pigs = 4*chislo3;

        int animals = chickens + cows + pigs;
        return animals;

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int a = Integer.valueOf(obj.nextLine());  // Read user input
        int b = Integer.valueOf(obj.nextLine());
        int c = Integer.valueOf(obj.nextLine());

        System.out.print(func(a,b,c));
    }

}
