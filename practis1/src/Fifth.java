import java.util.Scanner;  // Import the Scanner class

public class Fifth {

    public static String check(int N, int a, int b){
        int sum = a+b;
        int mul = a*b;
        int sub = a-b;
        int dev = a/b;
        int dev2 = b/a;
        int sub2 = b-a;
        if (N == sum){
            return "Суммирование";
        }
        if (N == mul){
            return "Умножение";
        }
        if (N == sub | N == sub2){
            return "Вычитание";
        }
        if (N == dev | N == dev2){
            return  "Деление";
        }
        return "None";
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int c1 = Integer.valueOf(obj.nextLine());  // Read user input
        int c2 = Integer.valueOf(obj.nextLine());
        int c3 = Integer.valueOf(obj.nextLine());
        System.out.print(check(c1,c2,c3));
    }

}