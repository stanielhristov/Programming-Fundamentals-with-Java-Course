package methods;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width  = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int result = getRectangleArea(width, height);
        System.out.println(result);
    }

    public static int getRectangleArea (int width, int height) {
        return  width * height;
    }
}
