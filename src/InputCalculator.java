import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        int average = 0;
        int counter = 0;
        int falseSum = 0;
        int falseAvg = 0;

        while(true) {

            boolean isAnInt = scanner.hasNextInt();


            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;

                sum += number;
                average = sum / counter;

                falseAvg = average;
                falseSum = sum;

                System.out.println("Sum = " + sum + " Average = " + average);
            } else {
                System.out.println("Sum = " + sum + " Average = " + average);
                break;
            }

        }

        scanner.close();
    }
}
