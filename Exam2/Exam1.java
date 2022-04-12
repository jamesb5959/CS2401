public class Exam1 {
    public static String removePattern(String str, String pattern){
        if(str.length()==0 || pattern.length() == 0 || pattern.length() > str.length())
        return "";
        String results = "";
        if(str.substring(0, pattern.length()).equals(pattern)){
            results="*"; 
            results+=removePattern(str.substring(pattern.length()), pattern);
        }
        else{
            results+=str.charAt(0);
            results+=removePattern(str.substring(1), pattern);
        }
        return results;
    }
    public static void main(String[] args) {
        String str = "Hello";
        String pattern = "llo";
        System.out.print(removePattern(str, pattern));
    }
}