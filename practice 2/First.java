import java.util.Scanner;
public class First {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int j = obj.nextInt();
        System.out.println(repeat(str, j));
    }
    public static String repeat(String s, int k){
        String ns = "";
        for(int i = 0; i < s.length(); i++){
            char sym = s.charAt(i);
            int r = k;
            while (r!=0){
                ns = ns + sym;
                r--;
            }
        }
        return ns;
    }
}
