import java.util.Scanner;
public class calculator {

    public static void main(String[] args) {
        System.out.println("Which operation would you like to perform?\n1. addition\n2. subtraction\n3. multiplication\n4. division");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();
            switch(option) {
                case 1:
                    System.out.print("Addition selected! Now enter 2 values: ");
                    plus(scanner.nextInt(), scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Subtraction selected! Now enter 2 values: ");
                    subtraction(scanner.nextInt(), scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Multiplication selected! Now enter 2 values: ");
                    multiplikation(scanner.nextInt(), scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Division selected! Now enter 2 values: ");
                    division(scanner.nextInt(), scanner.nextInt());
                    break;
                default:
                    System.out.println("Illegal value! rerun the program");
            }
    }

    public static void plus(int firstNumber, int secondNumber) {
        int resultPlus = firstNumber+secondNumber;
        System.out.println("The result of "+firstNumber+" + "+secondNumber+" is: "+resultPlus);

    }
    public static void division(int firstNumber, int secondNumber){
        double resultDivision = firstNumber/secondNumber;
        System.out.println("The result of "+firstNumber+" / "+ secondNumber + " is: " + resultDivision);
    }
    public static void subtraction(int firstNumber, int secondNumber) {
        double resultSubtraction = firstNumber - secondNumber;
        System.out.println("The result of "+firstNumber+" - "+ secondNumber + " is: " + resultSubtraction);
    }

    public static void multiplikation(int firstNumber, int secondNumber) {
        int resultMultiplikation = firstNumber*secondNumber;
        System.out.println("The result of "+firstNumber+ " * "+secondNumber+" is: "+resultMultiplikation);
    }

}
