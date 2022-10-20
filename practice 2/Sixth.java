import java.util.ArrayList;
import java.util.Scanner;
public class Sixth {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int a){
        ArrayList<Integer> list = new ArrayList<Integer>(a);
        list.add(1);
        list.add(2);
        int sum = 0;
        for(int i=2; i<a; i++){
            int sum1 = list.get(i-2) + list.get(i-1);
            list.add(sum1);
        }
        sum = list.get(a-1);
        return sum;
    }
}
