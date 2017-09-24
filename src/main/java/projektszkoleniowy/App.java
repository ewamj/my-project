package projektszkoleniowy;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        UserInteraction userInteraction = new UserInteraction();
        List<Integer> integers = userInteraction.takeUserNumber();
        NumberRepetitions mostRepeatedNumber = RepetitionFinder.findMostRepeatedNumber(integers);
        System.out.println(mostRepeatedNumber);
    }
}
