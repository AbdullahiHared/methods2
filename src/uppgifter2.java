import java.util.Arrays;
import java.util.Scanner;

public class uppgifter2 {
    public static void main(String[] args) {
        caseConverter("I", "i");
        primeNumber(4);
        power(2,6);
        range();
    }

    static String caseConverter(String a, String b) {
     boolean checkCaseA = a == a.toLowerCase();
     boolean checkCaseB = b == b.toLowerCase();



     if(checkCaseA) {
         System.out.println(a.toUpperCase());
     } else {
         System.out.println(a.toLowerCase());
     }

     if(checkCaseB) {
         System.out.println(a.toUpperCase());
     } else {
         System.out.println(a.toLowerCase());
     }
     return "Case converting";
    }

    static boolean primeNumber(int number) {
        boolean primeChecker = number % 2 == 1;
        if(primeChecker) {
            System.out.println("The number is Prime Number");
        } else {
            System.out.println("The number is not Prime Number");
        }
        return true;
    }

    static double power(int base, int exponent) {
        double result = Math.pow(base, exponent);
        System.out.println(result);
        return result;
    }

    static double range() {

        int userArray[] = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in the Array (6)");

        for (int i = userArray.length-1; i >= 0; i--) {
            userArray[i] = sc.nextInt();
        }

        Arrays.sort(userArray);
        int result = userArray[5] - userArray[0];
        System.out.println();
        System.out.println("The range is " + result);
        return result;

    }

}
