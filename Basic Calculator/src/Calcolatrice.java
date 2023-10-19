
import java.util.Scanner;

public class Calcolatrice {
    public static int moltiplicazione (int a , int b){
        int risultato = a * b;
        return risultato;

    }
    Scanner scanner = new Scanner(System.in);
    public static void calcolatrice () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un carattere per l'operazione corrispondente :\n" +
                "+ per addizione\n" +
                "- per sottrazione\n" +
                "* per moltiplicazione\n" +
                "/ per divisione\n" +
                "^ per potenza\n" +
                "% per sapere se è pari o dispari");

        char segno = scanner.next().charAt(0);
        if (segno == '%') {
            System.out.println("Inserire il numero di cui si vuole sapere se è pari o dispari");
            int a = scanner.nextInt();

        } else {
            System.out.println("Inserire il primo numero");
            int a = scanner.nextInt();
            System.out.println("Inserire il secondo numero");
            int b = scanner.nextInt();
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
                    System.out.println("Il risultato della moltiplicazione è " + moltiplicazione(a,b));
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
    public static void main(String[] args) {
        calcolatrice();

    }
}