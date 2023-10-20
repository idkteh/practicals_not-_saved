public class Practical4 {
    public static float tempConverter(String tempType, float temp){
        if (tempType == "C"){
           temp = (temp*9/5)+32;
           return temp;
        } else{
            temp = (temp - 32) * 5/9;
            return temp;
        }
    }
}
