import java.util.Scanner;  // Import the Scanner class

public class Ninth {

    public static int func(int array[]){
        int sum = 0;
        for(int j=0; j<10; j++){
            sum = sum + (int) Math.pow(array[j], 3);
        }
        return sum;

    }
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int MyArray[];
        MyArray = new int[10];
        for(int i=0; i<10; i++){
            int sc = obj.nextInt();
            if (sc <= 0){
                break;
            }
            else{
                MyArray[i] = sc;
            }
        }

        System.out.print(func(MyArray));
    }

}