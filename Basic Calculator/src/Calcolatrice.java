
import operations.Operations;

import java.util.Scanner;
public class Calcolatrice {
    private float a = 0.0F;
    private float b = 0.0F;
    private char op = ' ';

    private String scannerString = "";
    private Scanner scanner;

    private Boolean toClose = false;
    public Calcolatrice() {
    }

    public Boolean toClose() {
        return toClose;
    }

    private static boolean isNumeric(char str) {
        try {
            Float.parseFloat(String.valueOf(str));
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    private static boolean dotCheck(char c)
    {
        Boolean stringCheck = (c == '.' || c == ',');
        if(stringCheck) {
            return true;
        }
        return false;
    }
    public void run () {
        scanner = new Scanner(System.in);
        System.out.print("Che operazione vuoi eseguire?\n-> ");
        scannerString = scanner.nextLine().toString();
        Boolean dotFound = false;
        for(int i = 0; i < scannerString.length(); ++i)
        {

            if(!isNumeric(scannerString.charAt(i)))
            {
                if(dotFound){
                    System.out.println("Input error\n\n\n");
                    return;
                }
                if(dotCheck(scannerString.charAt(i))){
                    dotFound = true;
                    continue;
                }
                this.op = scannerString.charAt(i);
                if(!Operations.IsOpValid(this.op)){
                    System.out.println("Input error\n\n\n\n");
                    return;
                }
                this.a = Float.valueOf(scannerString.substring(0,i));
                if(scannerString.charAt(i) != '%') {
                    dotFound = false;
                    for(int j = i +1; j < scannerString.length(); ++j)
                    {
                        if (dotCheck(scannerString.charAt(j)) && dotFound) {
                            System.out.println("Input error\n\n\n");
                            return;
                        }
                        if (dotCheck(scannerString.charAt(j)))
                        {
                            dotFound = true;
                            continue;
                        }
                    }
                    this.b = Float.valueOf(scannerString.substring(i+1, scannerString.length()));
                }
                break;
            }
        }
        Operations.Eval(op,a,b);
        System.out.println("Vuoi eseguire un'altra operazione?");
        System.out.print("'y' per continuare - 'n' per chiudere: ");
        scannerString = scanner.nextLine().toString();
        if(scannerString.toLowerCase().equals("n")){
            this.toClose = true;
            System.out.println("Byeeeee!");
        }
    }

    public static void main(String[] args)
    {
        var Calculator = new Calcolatrice();
        for(;;)
        {
            Calculator.run();
            if(Calculator.toClose() == true){
                break;
            }
        }


    }
}
