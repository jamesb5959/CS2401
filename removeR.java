public class removeR {
   public static String removeRs(String str) {
        if(str.length()==0)
        return"";
        String results = "";
        if(str.charAt(0)=='R'||str.charAt(0)=='r'){
            results="";
        }
        else{
            results+=str.charAt(0);
        }
        results+=removeRs(str.substring(1));
        return results;
   }
   public static void main(String[] args) {
       String str = "Renter a string for testing here";
       System.out.println(removeRs(str));
   }
}