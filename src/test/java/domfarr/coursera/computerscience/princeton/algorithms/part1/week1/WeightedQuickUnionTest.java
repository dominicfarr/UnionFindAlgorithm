package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;

import org.junit.Before;
import org.junit.Test;

public class WeightedQuickUnionTest {
    private final int[] expected = new int[]{6, 2, 6, 4, 6, 6, 6, 2, 4, 4};
    private WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(expected.length);


    @Before
    public void initUnions() {
        weightedQuickUnion.union(4, 3);
        weightedQuickUnion.union(3, 8);
        weightedQuickUnion.union(6, 5);
        weightedQuickUnion.union(9, 4);
        weightedQuickUnion.union(2, 1);
        weightedQuickUnion.union(5, 0);
        weightedQuickUnion.union(7, 2);
        weightedQuickUnion.union(6, 1);
        weightedQuickUnion.union(7, 3);
    }

    @Test
    public void testFinalWeightedForest() {
        int[] actual = weightedQuickUnion.getForest();
        TestArray.testArrayContainsInOrder(expected, actual);
    }
}