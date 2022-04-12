public class CountString {
    public static int CountString(String str) {
        int count = 0;
        for(int i=0;i<str.length(); i++){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "0123456789";
        System.out.println(CountString(str));
    }
}
