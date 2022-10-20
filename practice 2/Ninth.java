import java.util.Scanner;
public class Ninth {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String word = obj.nextLine();
        String suffix = obj.nextLine();
        String prefix = obj.nextLine();
        System.out.println();
    }
    public static boolean isSuffix(String w, String suf){
        int l = w.length() - suf.length();
        int k = 0;
        boolean flag = true;
        for(int i = l+1; i<w.length(); i++){
            if (w.charAt(i) != suf.charAt(k)){
                flag = false;
                break;
            }
            k++;
        }
        return flag;
    }
}
