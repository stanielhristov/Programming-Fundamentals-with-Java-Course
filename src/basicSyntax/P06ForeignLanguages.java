package basicSyntax;

import java.util.Scanner;

public class P06ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String language = "";

        if (country.equals("England") || country.equals("USA")) {
            language = "English";
        } else if (country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")) {
            language = "Spanish";
        } else {
            System.out.println("unknown");
        }
        System.out.println(language);
    }
}
