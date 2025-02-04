import java.util.Scanner;

public class averageCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("introduce el numero " + (i + 1));
            numbers[i] = sc.nextDouble();
        }
        System.out.println("el resultado de la media es :"+ calculateAverage(numbers));
    }
    //la media (5,3,2) 5+3+2 ----- 10/3= 3.333
    private static double calculateAverage(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
        }
        return sumNumbers(numbers) / numbers.length;
    }
private static double sumNumbers(double[] numbers) {
    double sum = 0;
    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }
    return sum;
    }
}
