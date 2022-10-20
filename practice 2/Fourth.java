import java.util.ArrayList;
import java.util.Scanner;
public class Fourth {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean flag = true;
        while (flag){
            try {
                int j = obj.nextInt();
                list.add(j);
            }
            catch (java.util.InputMismatchException e){
                System.out.println("End of Input");
                break;
            }
        }
        cumulativeSum(list);
    }
    public static void cumulativeSum(ArrayList<Integer> loclist){
        int first = loclist.get(0);
        String p1 = String.valueOf(first);
        System.out.print(p1 + " ");
        for(int i=1; i<loclist.size(); i++){
            int a = loclist.get(i);
            int b = a + loclist.get(i-1);
            loclist.set(i, b);
            String p2 = String.valueOf(loclist.get(i));
            System.out.print(p2 + " ");
        }
    }
}
