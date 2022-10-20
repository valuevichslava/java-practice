import java.util.Scanner;  // Import the Scanner class

public class First {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String chislo1 = obj.nextLine();  // Read user input
        String chislo2 = obj.nextLine();// Read user input
        String chislo3 = obj.nextLine();
        System.out.println("Ввод чисел для 9 задания:");
        int[] myArray = new int[10];
        for(int i =0; i<10; i++){
            String sc = obj.nextLine();
            if (sc.equals("/")){
                break;
            }
            myArray[i] = Integer.valueOf(sc);
        }
        System.out.println("1: " + remainder(Integer.valueOf(chislo1),Integer.valueOf(chislo2)));
        System.out.println("2: " + triArea(Integer.valueOf(chislo1),Integer.valueOf(chislo2)));
        System.out.println("3: " + animals(Integer.valueOf(chislo1),Integer.valueOf(chislo2),Integer.valueOf(chislo3)));
        System.out.println("4: " + profitable_gamble(Integer.valueOf(chislo1),Integer.valueOf(chislo2),Integer.valueOf(chislo3)));
        System.out.println("5: " + check(Integer.valueOf(chislo1),Integer.valueOf(chislo2),Integer.valueOf(chislo3)));
        System.out.println("6: " + ctoa(chislo1.charAt(0)));
        System.out.println("7: " + addUpTo(Integer.valueOf(chislo1)));
        System.out.println("8: " + nextEdge(Integer.valueOf(chislo1),Integer.valueOf(chislo2)));
        System.out.println("9: " + sumofCubes(myArray));
        System.out.println("10: " + abcmath(Integer.valueOf(chislo1),Integer.valueOf(chislo2),Integer.valueOf(chislo3)));

    }
    public static int remainder(int a, int b){
        return a%b;
    }

    public static int triArea(int a, int b){  //идентификатор доступа, функция статична, тип возвращаемого значения и имя функции без параметров

        return (a*b)/2;
    }

    public static int animals(int chislo1, int chislo2, int chislo3){

        int chickens = 2*chislo1;
        int cows = 4*chislo2;
        int pigs = 4*chislo3;

        return chickens + cows + pigs;

    }
    public static boolean profitable_gamble(float prob, int prize, int pay){
        if (prob * prize > pay){
            return true;
        }
        else{
            return false;
        }
    }

    public static String check(int N, int a, int b){
        int sum = a+b;
        int mul = a*b;
        int sub = a-b;
        int dev = a/b;
        int dev2 = b/a;
        int sub2 = b-a;
        if (N == sum){
            return "Суммирование";
        }
        if (N == mul){
            return "Умножение";
        }
        if (N == sub | N == sub2){
            return "Вычитание";
        }
        if (N == dev | N == dev2){
            return  "Деление";
        }
        return "None";
    }

    public static int ctoa(char ch){

        return (int) ch;

    }

    public static int addUpTo(int c){
        int sum = 0;
        for(int i = 1; i <= c; i++){
            sum = sum + i;
        }
        return sum;

    }

    public static int nextEdge(int c1, int c2){

        return c1+c2-1;

    }

    public static int sumofCubes(int[] array){
        int sum = 0;
        for(int j=0; j<10; j++){

            sum = sum + (int) Math.pow(array[j], 3);
        }
        return sum;

    }

    public static boolean abcmath(int c1, int c2, int c3) {
        int sum = 0;
        int r1 = c1 * 2;
        for (int i = 0; i < c2; i++) {
            sum = sum + r1;
            c1 = c1 * 2;
            r1 = c1;
        }
        //System.out.println(sum);
        boolean flag = true;
        if (sum % c3 != 0) {
            flag = false;
        }
        return flag;
    }
}