package mapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> companies = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String [] inputData = input.split(" -> ");
            String companyName = inputData[0];
            String employeeID = inputData[1];
            if(companies.containsKey(companyName)) {
                List<String> employees = companies.get(companyName);
                if (!employees.contains(employeeID))
                    employees.add(employeeID);
            } else  {
                List<String> employees = new ArrayList<>();
                employees.add(employeeID);
                companies.put(companyName, employees);
            }
            input = scanner.nextLine();
        }

        for (String s : companies.keySet()) {
            System.out.printf("%s\n", s);
            for (int i = 0; i < companies.get(s).size(); i++) {
                System.out.printf("-- %s\n", companies.get(s).get(i));
            }
        }
    }
}