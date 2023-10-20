public class Practical3 {
    public static String swap(String Letters){
        String firstTwo = Letters.substring(0,2);
        String lastTwo = Letters.substring(2,4);
        return lastTwo+firstTwo;
    }
}
