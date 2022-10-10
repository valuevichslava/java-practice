import java.util.Scanner;  // Import the Scanner class

public class Tenth {

    public static boolean func(int c1, int c2, int c3){
        int sum = 0;
        int r1 = c1*2;
        for(int i=0; i<c2; i++){
           sum = sum + r1;
           c1 = c1*2;
           r1 = c1;
        }
        //System.out.println(sum);
        boolean flag = true;
        if (sum % c3 != 0){
            flag = false;
        }
        return flag;

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int a = Integer.valueOf(obj.nextLine());  // Read user input
        int b = Integer.valueOf(obj.nextLine());
        int c = Integer.valueOf(obj.nextLine());

        System.out.print(func(a,b,c));
    }

}
