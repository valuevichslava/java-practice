import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] Array = new int[4];
        for (int i = 0; i<4; i++) {
            int j = obj.nextInt();
            if (j!=0){
                Array[i] = j;
            }
            else{
                break;
            }
        }
        System.out.println(isAvgWhole(Array));
    }
    public static boolean isAvgWhole(int[] tArray){
        int sum = 0;
        for(int q: tArray){
            sum = sum + q;
        }
        if (sum % tArray.length !=0){
            return false;
        }
        return true;
    }

}