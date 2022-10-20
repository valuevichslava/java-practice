import java.util.Scanner;
public class Fifth {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String j = obj.nextLine();
        getDecimalPlaces(j);
    }
    public static void getDecimalPlaces(String a){
        try{
            String[] s = String.valueOf(a).split("\\.");
            int k = s[1].length();
            System.out.println(k);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("0");
        }
    }
}
