package methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberInput = Double.parseDouble(scanner.nextLine());
        double powerInput = Double.parseDouble(scanner.nextLine());
        double result = mathPowerMethod(numberInput, powerInput);

        DecimalFormat decimalFormat = new DecimalFormat("0.####");
        System.out.println(decimalFormat.format(result));
    }
    public static double mathPowerMethod (double number, double power) {
        Double result = Math.pow(number, power);
        return result;
    }
}
