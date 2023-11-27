public class uppgifter2 {
    public static void main(String[] args) {
        caseConverter("b", "c");

        primeNumber(4);
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
}
