package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;

import org.junit.Before;
import org.junit.Test;

public class WeightedCompressedQuickUnionTest {
    private final int[] expected = new int[]{6, 2, 6, 4, 6, 6, 6, 6, 4, 4};
    private final WeightedCompressedQuickUnion weightedCompressedQuickUnion = new WeightedCompressedQuickUnion(expected.length);


    @Before
    public void initUnions() {
        weightedCompressedQuickUnion.union(4, 3);
        weightedCompressedQuickUnion.union(3, 8);
        weightedCompressedQuickUnion.union(6, 5);
        weightedCompressedQuickUnion.union(9, 4);
        weightedCompressedQuickUnion.union(2, 1);
        weightedCompressedQuickUnion.union(5, 0);
        weightedCompressedQuickUnion.union(7, 2);
        weightedCompressedQuickUnion.union(6, 1);
        weightedCompressedQuickUnion.union(7, 3);
    }

    @Test
    public void testFinalWeightedForest() {
        int[] actual = weightedCompressedQuickUnion.getForest();
        TestArray.testArrayContainsInOrder(expected, actual);
    }
}