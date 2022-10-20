import java.util.Scanner;
public class Eighth {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        String str2 = obj.nextLine();
        System.out.println(isStrangePair(str1,str2));
    }
    public static boolean isStrangePair(String s1, String s2){
        try {
            if (s1.charAt(0) == s2.charAt(s2.length() - 1) && s1.charAt(s1.length() - 1) == s2.charAt(0)){
                return true;
            }
            return false;
        }
        catch (StringIndexOutOfBoundsException e){
            return true;
        }
    }
}
