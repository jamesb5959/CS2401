public class Exam2 {
    public static void printStuff(String stringSoFar, int maxLength) {
        if (stringSoFar.length() == maxLength) {
        System.out.println(stringSoFar + "!");
        return;
        }
       
        printStuff("L" + stringSoFar, maxLength);
        printStuff("R" + stringSoFar, maxLength);
       }
       public static void main(String[] args) {
printStuff("dog", 6);
       }
}
