package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class WeightedCompressedQuickUnionTest {
    private final int[] expected = new int[]{6, 2, 6, 4, 6, 6, 6, 6, 4, 4};
    private WeightedCompressedQuickUnion weightedCompressedQuickUnion = new WeightedCompressedQuickUnion(expected.length);


    @Before
    public void initUnions() {
        weightedCompressedQuickUnion.union(4, 3);
        System.out.println(Arrays.toString(weightedCompressedQuickUnion.getForest()));
        weightedCompressedQuickUnion.union(3, 8);
        System.out.println(Arrays.toString(weightedCompressedQuickUnion.getForest()));
        weightedCompressedQuickUnion.union(6, 5);
        System.out.println(Arrays.toString(weightedCompressedQuickUnion.getForest()));
        weightedCompressedQuickUnion.union(9, 4);
        System.out.println(Arrays.toString(weightedCompressedQuickUnion.getForest()));
        weightedCompressedQuickUnion.union(2, 1);
        System.out.println(Arrays.toString(weightedCompressedQuickUnion.getForest()));
        weightedCompressedQuickUnion.union(5, 0);
        System.out.println(Arrays.toString(weightedCompressedQuickUnion.getForest()));
        weightedCompressedQuickUnion.union(7, 2);
        System.out.println(Arrays.toString(weightedCompressedQuickUnion.getForest()));
        weightedCompressedQuickUnion.union(6, 1);
        System.out.println(Arrays.toString(weightedCompressedQuickUnion.getForest()));
        weightedCompressedQuickUnion.union(7, 3);
        System.out.println(Arrays.toString(weightedCompressedQuickUnion.getForest()));
    }

    @Test
    public void testFinalWeightedForest() {
        int[] actual = weightedCompressedQuickUnion.getForest();
        System.out.println(Arrays.toString(actual));
        TestArray.testArrayContainsInOrder(expected, actual);
    }
}