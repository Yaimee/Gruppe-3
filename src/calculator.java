import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hello world");
division(scanner.nextInt(), scanner.nextInt());
plus(scanner.nextInt(), scanner.nextInt());



    }
    public static void hej() {
        System.out.println("hejmeddig");




    }

    public static void plus(int a, int b) {
        int result = a+b;
        System.out.println(result);


    }
    public static void division(int firstNumber, int secondNumber){
        double resultDivision = firstNumber/secondNumber;
        System.out.println(resultDivision);
    }

}
