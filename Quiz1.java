public class Quiz1 {
    public static boolean signs (int a, int b, boolean both){
        if(a<=0&&b>0&& both == false || a>0&&b<=0&& both == false || b>0&&a>0 || a<=0&&b<=0){
            return true;
            }
            else{
            return false;
            }
        }
            public static boolean included (int a, int b){
                if(a>=15&&b<=25||a>=35&&b<=45){
                    return true;
                    }
                    else{
                    return false;
                    }
            }
            public static void main(String[] args) {
                System.out.print(included(16, 14));
            }
}
