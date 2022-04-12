public class quize14 {
    public static int sum(int num){
            if(num==0){
              return 0;
            }
            if ( num % 2 == 1 ){
                return num%10+sum(num/10);
            }
            else return sum(num/10);
    }
    public boolean strCopies(String str, String word, int count) {
        if(str.length() == 0 || word.length() == 0 || word.length() > str.length() && count == 0){
            return true;
        }
        if(str.length() == 0 || word.length() == 0 || word.length() > str.length() && count != 0){
            return false;
        }        
        int wordCount = 0;
        if(str.substring(0, word.length()).equals(word)){
            return strCopies(str.substring(word.length()), word, count-1);
        }
        return strCopies(str.substring(1), word, count);
      }
    public static void main(String[] args) {
        System.out.println(sum(125));
        //System.out.println(strCopies(“catcowcat”, “cat”, 2));
    }
}
