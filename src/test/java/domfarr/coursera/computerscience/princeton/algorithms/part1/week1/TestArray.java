package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestArray {
    private TestArray() {
    }

    public static void testArrayContainsInOrder(int[] expected, int[] actual) {
        for (int i = 0; i < expected.length; i++) {
            assertThat(actual[i], equalTo(expected[i]));
        }
    }
}
