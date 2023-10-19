package operations;

public class Operations {
    public static float moltiplicazione (float a , float b){
        float risultato = a * b;
        return risultato;

    }

    public static float Sum(float a, float b)
    {
        return a + b;
    }

    public static float Subtraction(float a, float b)
    {
        return a - b;
    }

    public static String isEvenOrUneven(int x){
        if( x%2 == 0){
            return "pari";
        } else {
            return "dispari";
        }
    }
    public static int power(int a, int b){
        int base=1;
        for(int i=0; i<b; i++){
            base=base*a;
        }
        return base;
    }
    public static float [] divisione(float a, float b){

        float[] divisione = new float[2];
        divisione[0] = a/b;
        divisione[1] = a%b;
        System.out.println("il risultato é "+divisione[0]);
        System.out.println("il resto é "+divisione[1]);
        return divisione;
    }
    public static void checkSegno (float a, float b,char segno){
        switch (segno) {
            case '+': {
                System.out.println("Il risultato dell'addizione è" );
                break;
            }
            case '-': {
                System.out.println("Il risultato della sottrazione è" );
                break;
            }
            case '*': {
                System.out.println("Il risultato della moltiplicazione è ");
                break;
            }
            case '/': {
                System.out.println("Il risultato della divisione è" );
                break;
            }
            case '^': {
                System.out.println("Il risultato della potenza è" );
                break;
            }
            default:{
                System.out.println("Errore");
            }
        }
    }
}

