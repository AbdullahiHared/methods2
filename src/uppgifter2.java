public class uppgifter2 {
    public static void main(String[] args) {
        caseConverter("b", "c");
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
}
