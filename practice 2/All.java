import java.util.ArrayList;
import java.util.Scanner;
public class All {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        boolean flag = true;
        int c = 0;
        while (true){
            String j = obj.nextLine();
            if (j.equals("/")){
                System.out.println("End of Input");
                break;
            }
            else {
                list.add(j);
                if (isValid(list.get(c)) && flag){
                  flag = true;
                }
                else{
                    flag = false;
                }
                c++;
            }
        }

        if (flag){
            System.out.println("2: " + differenceMaxMin(intMas(list)));
            System.out.println("3: " + isAvgWhole(intMas(list)));
            System.out.println("4: " + cumulativeSum(intList(list)));
            if (Integer.valueOf(list.get(0)) > 0){
                System.out.println("6: " + fibonacci(Integer.valueOf(list.get(0))));
                System.out.println("10: " + boxSeq(Integer.valueOf(list.get(0))));
            }
        }
        else{
            System.out.println("1: " + repeat(list.get(0), Integer.valueOf(list.get(1))));
            System.out.println("5: " + getDecimalPlaces(list.get(0)));
            System.out.println("7: " + isValid(list.get(0)));
            System.out.println("8: " + isStrangePair(list.get(0), list.get(1)));
            System.out.println("9: Суффикс?- " + isSuffix(list.get(0), list.get(1)) + "; Префикс?- " + isPrefix(list.get(0), list.get(1)));
        }

    }
    // First
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

    public static int differenceMaxMin(int[] tArray){
        int maxim = tArray[0];
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

    public static ArrayList<Integer> cumulativeSum(ArrayList<Integer> loclist){
        for(int i=1; i<loclist.size(); i++){
            int a = loclist.get(i);
            int b = a + loclist.get(i-1);
            loclist.set(i, b);
        }
        return loclist;
    }

    public static int getDecimalPlaces(String a){
        try{
            String[] s = String.valueOf(a).split("\\.");
            int k = s[1].length();
            return k;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public static int fibonacci(int a){
        ArrayList<Integer> list = new ArrayList<Integer>();
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

    public static boolean isValid(String s){
        char[] charArray = s.toCharArray();
        for (char c: charArray){
            if(Character.isLetter(c) || Character.isWhitespace(c)){
                return false;
            }
        }
        return true;
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

    public static boolean isSuffix(String w, String suf){
        if (suf.charAt(0) != '-'){
            System.out.println("Incorrect Suffix");
            return false;
        }
        int l = w.length() - suf.length() + 1;
        int k = 1;
        for(int i = l; i<w.length(); i++){
            if (w.charAt(i) != suf.charAt(k)){
                //System.out.println(w.charAt(i));
                //System.out.println(suf.charAt(k));
                return false;
            }
            k++;
        }
        return true;
    }

    public static boolean isPrefix(String w, String pref){
        int l = pref.length() - 1;
        if (pref.charAt(l) != '-'){
            System.out.println("Incorrect Prefix");
            return false;
        }
        for(int i=0; i<l; i++){
            if (w.charAt(i) != pref.charAt(i)){
                //System.out.println(w.charAt(i));
                //System.out.println(suf.charAt(k));
                return false;
            }
        }
        return true;
    }

    public static int boxSeq(int s){
        if (s == 0){
            return 0;
        }
        int count = 0;
        for(int i = 1; i<s+1; i++){
            if (i%2 != 0){
                count = count + 3;
            }
            else{
                count--;
            }
        }
        return count;
    }

    public static int[] intMas(ArrayList<String> mylist){
        int[] intArray = new int[mylist.size()];
        for(int i=0; i< mylist.size(); i++){
            intArray[i] = Integer.valueOf(mylist.get(i));
        }
        return intArray;
    }

    public static ArrayList<Integer> intList(ArrayList<String> mylist){
        ArrayList<Integer> intArray= new ArrayList<Integer>();
        for(int i=0; i< mylist.size(); i++){
            intArray.add(Integer.valueOf(mylist.get(i)));
        }
        return intArray;
    }
}
