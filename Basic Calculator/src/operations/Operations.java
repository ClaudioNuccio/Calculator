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
    public static void Eval(char op, float a, float b)
    {
        switch (op)
        {
            case '+':
            {
                System.out.println("Il risultato dell'addizione tra " + a + " e " + b +" è " + Sum(a,b));
            }break;
            case '-':
            {
                System.out.println("Il risultato della sottrazione tra " + a + " e " + b +" è " + Subtraction(a,b));
            }break;
            case '*':
            {
                System.out.println("Il risultato della moltiplicazione tra " + a + " e " + b +" è " + moltiplicazione(a,b));

            }break;
            case '/':
            {
                System.out.println("Il risultato della divisione tra " + a + " e " + b +" è " + divisione(a,b)[0] );
                System.out.println("Il resto della divisione è " + divisione(a,b)[1]);
            }break;
            case '^':
            {
                int newa = (int)a;
                int newb = (int)b;
                System.out.println("Il risultato della potenza tra " + newa + " e " + newb +" è " + power(newa,newb));
            }break;
            case '%':
            {
                System.out.println("Il numero " + (int)a + " è " + isEvenOrUneven((int)a));
            }break;
            default:
            {
                System.out.println("Errore");
            }break;
        }
    }
    public static Boolean IsOpValid(char op)
    {
        switch(op)
        {
            case '+':
            case '*':
            case '/':
            case '-':
            case '^':
            case '%':
                return true;
            default:
                return false;
        }
    }
}

