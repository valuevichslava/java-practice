import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] Array = new int[8];
        for (int i = 0; i<9; i++) {
            int j = obj.nextInt();
            Array[i] = j;
        }
        System.out.println(differenceMaxMin(Array));
    }
    public static int differenceMaxMin(int[] tArray){
        int maxim = tArray[1];
        int minim = 32000000;
        for(int q: tArray){
            if (maxim <= q){
                maxim = q;
            }
            if (minim >= q){
                minim = q;
            }
        }
        return maxim-minim;
    }

}