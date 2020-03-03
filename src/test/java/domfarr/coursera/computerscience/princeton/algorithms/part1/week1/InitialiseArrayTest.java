package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class InitialiseArrayTest {
    @Test
    public void testInitialiseArray() {
        int[] underTest = InitialiseArray.initialiseArray(3);
        assertThat(underTest[0], CoreMatchers.is(0));
    }
}