import java.util.Scanner;  // Import the Scanner class

public class Second {

    public static int func(int chislo1, int chislo2){  //идентификатор доступа, функция статична, тип возвращаемого значения и имя функции без параметров

        int s = (chislo1*chislo2)/2;

        return s;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int a = Integer.valueOf(obj.nextLine());  // Read user input
        int b = Integer.valueOf(obj.nextLine());  // Read user input

        System.out.print(func(a,b));
    }

}
