public class frontback {
    public static void main (String [] args) {
        System.out.println(frontBack(""));
    }

    public static String frontBack(String str) {
        char front = str.charAt(0);
        if(str.length()<=1){
        String stringFront = Character.toString(front);
        return stringFront;
        }
        else{
        String middle = str.substring(1, str.length()-1);
        char back = str.charAt(str.length()-1);
        String frontback = back+middle+front;
      
        return frontback;
        }
      }
}
