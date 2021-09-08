import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hello world");


        plus(scanner.nextInt(), scanner.nextInt());
        multiplikation(scanner.nextInt(), scanner.nextInt());
        division(scanner.nextInt(), scanner.nextInt());



    }
    public static void hej() {
        System.out.println("hejmeddig");




    }

    public static void plus(int firstNumber, int secondNumber) {
        int resultPlus = firstNumber+secondNumber;
        System.out.println("The result of "+firstNumber+" + "+secondNumber+" is: "+resultPlus);


    }
    public static void division(int firstNumber, int secondNumber){
        double resultDivision = firstNumber/secondNumber;
        System.out.println(resultDivision);
    }

    public static void multiplikation(int firstNumber, int secondNumber) {
        int resultMultiplikation = firstNumber*secondNumber;
        System.out.println("The result of "+firstNumber+ " * "+secondNumber+" is: "+resultMultiplikation);
    }

}
