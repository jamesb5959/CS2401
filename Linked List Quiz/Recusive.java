public class Recusive {
    public static String intertwine(String s1, String s2){
        if(s1.length() < 1){
            return s1 + s2;
        }
        System.out.println(x);
        return 1+s1.substring(0, 1) + s2.substring(0, 1) + intertwine(s1.substring(1), s2.substring(1));
    }
     public static void main(String[] args) {
         System.out.print(intertwine("1", "2"));
    }
}
