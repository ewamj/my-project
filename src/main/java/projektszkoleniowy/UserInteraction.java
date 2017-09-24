package projektszkoleniowy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInteraction {
    public static List<Integer> takeUserNumber() {
        List<Integer> userNumbers = new ArrayList<>();
        System.out.println("podaj liczby");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strArray = input.split(" ");
        for (String numString : strArray) {
            userNumbers.add(Integer.parseInt(numString));
        }
        System.out.println(userNumbers);
        return userNumbers;
    }
}