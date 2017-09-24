package projektszkoleniowy;

import java.util.List;

public class NumberRepetitions {
    List<Integer> numbers;
    int repetitions;

    public NumberRepetitions(List<Integer> numbers, int repetitions) {
        this.numbers = numbers;
        this.repetitions = repetitions;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumberRepetitions that = (NumberRepetitions) o;

        if (repetitions != that.repetitions) return false;
        return numbers != null ? numbers.equals(that.numbers) : that.numbers == null;
    }

    @Override
    public int hashCode() {
        int result = numbers != null ? numbers.hashCode() : 0;
        result = 31 * result + repetitions;
        return result;
    }

    @Override
    public String toString() {
        return "NumberRepetitions{" +
                "numbers=" + numbers +
                ", repetitions=" + repetitions +
                '}';
    }
}


