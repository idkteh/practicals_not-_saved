import java.util.*;

public class Practical2 {
    public static int checkLargest(int NumA,int NumB, int NumC){
        int[] everyNum = {NumA,NumB,NumC};
        Arrays.sort(everyNum);
        return everyNum[2];
    }
}
