import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("introdusca el primer numero ");
        double firstNumber = sc.nextDouble();

        System.out.println("introdusca el segundo numero ");
        double secondNumber = sc.nextDouble();

        System.out.println("introdusca la operación");
        String operation = sc.next();

        double result = doCalculation(firstNumber, secondNumber, operation);

        System.out.println("El resultado de la " +operation+ " es: " + result);

        System.out.println("¿quieres realizar otra operación?");
        String otherOperation = sc.next();
    }

    private static double doCalculation(double firstNumber, double secondNumber, String operation) {
        switch (operation) {
            case "+" -> {
                return sum(firstNumber, secondNumber);
            }
            case "-" -> {
                return minus(firstNumber, secondNumber);
            }
            case "*" -> {
                return multiply(firstNumber, secondNumber);
            }
            case "/" -> {
                return division(firstNumber, secondNumber);
            }
            default ->
            throw new IllegalArgumentException("operacion desconocida");
        }
    }

    private static double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
    private static double minus(double firstNuamber, double secondNumber){
        return firstNuamber - secondNumber;
    }
    private static double multiply(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }
    private static double division(double firstNumber, double secondNumber){
        return firstNumber / secondNumber;

    }
}
