package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;

import org.junit.Test;

public class WeightedQuickUnionTest {
    private final int[] expected = new int[] {6,2,6,4,6,6,6,2,4,4};


    @Test
    public void testFinalWeightedForest() {
        int[] actual = new WeightedQuickUnion(10).getForest();

        TestArray.testArrayContainsInOrder(expected, actual);
    }
}