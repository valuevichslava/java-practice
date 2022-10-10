import java.util.Scanner;  // Import the Scanner class

public class Fourth {

    public static boolean profitable_gamble(float prob, int prize, int pay){
        boolean T = true;
        boolean F = false;
        if (prob * prize > pay){
            return T;
        }
        else{
            return F;
        }

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        float a = Float.valueOf(obj.nextLine());  // Read user input
        int b = Integer.valueOf(obj.nextLine());
        int c = Integer.valueOf(obj.nextLine());
        System.out.print(profitable_gamble(a,b,c));
    }

}