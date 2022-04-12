public class Quiz2 {
    public static String intertwine(String str, char c){
        if(str.length() <= 1)
        return str;
          String ctoString = "" + c;
    return str.charAt(0) + ctoString + intertwine(str.substring(1), c);
    }
    public static void main(String[] args) {
        System.out.println(intertwine("xyz", 'd'));
    }
}
