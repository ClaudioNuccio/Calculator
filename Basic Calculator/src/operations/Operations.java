package operations;

import java.util.Scanner;

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
        return divisione;
    }
    public static void checkSegno (char segno){
        float a = 0.0F;
        float b = 0.0F;
        Scanner scanner = new Scanner(System.in);
        if (segno == '%') {
            System.out.println("Inserire il numero di cui si vuole sapere se è pari o dispari");
            a = scanner.nextFloat();
        } else {
            System.out.println("Inserire il primo numero");
            a = scanner.nextFloat();
            System.out.println("Inserire il secondo numero");
            b = scanner.nextFloat();
        }
        switch (segno) {
            case '+': {
                System.out.println("Il risultato dell'addizione è" + Sum(a,b));
                break;
            }
            case '-': {
                System.out.println("Il risultato della sottrazione è" + Subtraction(a,b));
                break;
            }
            case '*': {
                System.out.println("Il risultato della moltiplicazione è " + moltiplicazione(a,b));
                break;
            }
            case '/': {
                System.out.println("Il risultato della divisione è " + divisione(a,b)[0] );
                System.out.println("Il resto della divisione è " + divisione(a,b)[1]);
                break;
            }
            case '^': {
                System.out.println("Il risultato della potenza è" + power((int)a,(int)b) );
                break;
            }
            default:{
                System.out.println("Errore");
            }
        }
    }
}

