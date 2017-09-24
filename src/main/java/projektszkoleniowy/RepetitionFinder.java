package projektszkoleniowy;
import java.util.*;

public class RepetitionFinder {

    public static NumberRepetitions findMostRepeatedNumber(List<Integer> numbers) {
        Map<Integer, Integer> numbersToReps = new HashMap<>();
        List<Integer> numWithMaxRep = new ArrayList<>();
        int maxRep = 0;

        if (numbers.isEmpty()) {
             return null;
         }
        for (Integer item: numbers) {
            if (numbersToReps.containsKey(item)) {
                int prevRep = numbersToReps.get(item);
                int rep = prevRep + 1;
                numbersToReps.put(item, rep);
                if (maxRep < rep) {
                    maxRep = rep;
                    numWithMaxRep.clear();
                    numWithMaxRep.add(item);
                }
                else if (maxRep == rep) {
                    numWithMaxRep.add(item);
                }
            }
            else {
                numbersToReps.put(item, 1);
                if (maxRep < 1) {
                    maxRep = 1;
                    numWithMaxRep.add(item);
                }
                else if (maxRep == 1) {
                    numWithMaxRep.add(item);
                }
            }
        }

        return new NumberRepetitions(numWithMaxRep, maxRep);
    }
}
