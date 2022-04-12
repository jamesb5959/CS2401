public class removeMysteryITests {
    public static String removeMysteryITests(String str) {
        String result = "";
        int toBeRemoved = 0;
        int count = 1;
        for(int i=0;i<str.length();i++){
            if(i != toBeRemoved){
                result += str.charAt(i);
            }
            else{
                toBeRemoved = toBeRemoved+count;
                count++;
            }
    }
    return result;
    }
    public static void main(String[] args) {
        String str = "0123456789";
        System.out.println(removeMysteryITests(str));
    }
}