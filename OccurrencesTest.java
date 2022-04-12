public class OccurrencesTest {
    static int count = 0;
    static int position = 0;

    public static int OccurrencesTest(String S1, String S2) {
        if (S1.length() == 0 || S2.length() == 0)
            return 0;
        if(S1.length()<S2.length())
            return 0;
        String removeSpace = "";
        if(S1.substring(position, S2.length()).equals(S2)){
            count++;
            position++;
        }
        else{
            position++;
        }
        if(S1.substring(position, S2.length()+position)== S2){
            removeSpace+= OccurrencesTest(S1.substring(S2.length(), S1.length()), S2);
        }
        return count;
    }
    public static void main(String[] args) {
        String S1 = "word This word should appear two time.";
        String S2 = "word";
        System.out.print(OccurrencesTest(S1, S2));
    }
}