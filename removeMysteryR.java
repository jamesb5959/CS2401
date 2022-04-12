public class removeMysteryR {
        static int count = 0;
        static int toBeRemovedPoints = 0;

    public static String removeMysteryR(String str) {
        if (str.length() == 0)
            return "";
        String results = "";
        int toBeRemoved = toBeRemovedPoints * (toBeRemovedPoints + 1) / 2;
    if(count==toBeRemoved){
        results="";
        count++;
        toBeRemovedPoints++;
    }
    else{
        results+=str.charAt(0);
        count++;
    }
    results+=removeMysteryR(str.substring(1));
    return results;
}
    public static void main(String[] args) {
        String str = "9919239456978";
        System.out.println(removeMysteryR(str));
    }
}