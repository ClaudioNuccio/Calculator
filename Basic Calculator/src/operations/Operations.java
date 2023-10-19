package operations;

public class Operations {

    public static float Sum(float a, float b)
    {
        return a + b;
    }

    public static String isEvenOrUneven(int x){
        if( x%2 == 0){
            return "pari";
        } else {
            return "dispari";
        }
    }
}

