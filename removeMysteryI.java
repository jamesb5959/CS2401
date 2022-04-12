public class removeMysteryI {
    public static String removeMysteryI(String str) {
        String result = "";
        int toBeRemoved;
        int count = 0;
        for(int i=0;i<str.length();i++){    
            toBeRemoved = count*(count+1)/2;
            if(i!=toBeRemoved){
                result+=str.charAt(i); 
            }
            else{
                count++;
            }
        }
        return result;
    }  
    public static void main(String[] args) {
        String str = "9919239456978";
        System.out.println(removeMysteryI(str));
    }
}