public class Test {
    public static void name() {
        String str = "apple";
        String p = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)!='a')
              p+=str.charAt(i);
        }
        System.out.print(p);
    }  
    public static void main(String[] args) {
        name();
    }
}
