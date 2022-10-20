import java.util.Scanner;
public class Seventh {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        System.out.println(isValid(str));
    }
    public static boolean isValid(String s){
        char[] charArray = s.toCharArray();
        for (char c: charArray){
            if(Character.isLetter(c) || Character.isWhitespace(c)){
                return false;
            }
        }
        return true;
    }
}
