package projektszkoleniowy;

import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RepetitionFinderTest {
    @Test
    public void nullOnEmptyNumberList() throws Exception {
        //given
        List<Integer> numbers = Collections.emptyList();
        NumberRepetitions expected = null;

        //when
        NumberRepetitions actual = RepetitionFinder.findMostRepeatedNumber(numbers);

        //then
        assertThat(actual, is(expected));
    }

    @Test
    public void oneNumber() throws Exception {

        //given
        List<Integer> numbers = Arrays.asList(5);
        NumberRepetitions expected = new NumberRepetitions(Arrays.asList(5),1);

        //when
        NumberRepetitions actual = RepetitionFinder.findMostRepeatedNumber(numbers);

        //then
        assertThat(actual, is(expected));
    }

    @Test
    public void TwoNumbersNoRepetitions() throws Exception {

        //given
        List<Integer> numbers = Arrays.asList(1,2);
        NumberRepetitions expected = new NumberRepetitions(Arrays.asList(1,2),1);

        //when
        NumberRepetitions actual = RepetitionFinder.findMostRepeatedNumber(numbers);

        //then
        assertThat(actual, is(expected));
    }

    @Test
    public void ThreeNumberOneRepeats() throws Exception {

        //given
        List<Integer> numbers = Arrays.asList(2,3,3);
        NumberRepetitions expected = new NumberRepetitions(Arrays.asList(3),2);

        //when
        NumberRepetitions actual = RepetitionFinder.findMostRepeatedNumber(numbers);

        //then
        assertThat(actual, is(expected));
    }


    @Test

    public void FiveNumbersTwoRepeat() throws Exception {

        //given
        List<Integer> numbers = Arrays.asList(1,1,2,3,3);
        NumberRepetitions expected = new NumberRepetitions(Arrays.asList(1,3), 2);

        //when
        NumberRepetitions actual = RepetitionFinder.findMostRepeatedNumber(numbers);

        //then
        assertThat(actual, is(expected));
    }
}
