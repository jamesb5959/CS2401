public class numDigits {

    public static int numDigits(int num) {
        if (num == 0)
            return 0;
        return 1+numDigits(num/10);
}

    public static void main(String[] args) {
        int num = 299;
        System.out.println(numDigits(num));
    }
}