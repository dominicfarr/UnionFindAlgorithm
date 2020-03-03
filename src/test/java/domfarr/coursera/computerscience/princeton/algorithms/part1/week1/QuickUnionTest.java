package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QuickUnionTest {
    private final QuickUnion quickUnion = new QuickUnion(10);

    @Before
    public void initUnions() {
        quickUnion.union(4, 3);
        quickUnion.union(3, 8);
        quickUnion.union(6, 5);
        quickUnion.union(9, 4);
        quickUnion.union(2, 1);
    }

    private void secondSetOfUnions() {
        quickUnion.union(5, 0);
        quickUnion.union(7, 2);
        quickUnion.union(6, 1);
        quickUnion.union(7, 3);
    }

    @Test
    public void testInitialUnions() {
        final int[] expected = new int[]{0, 1, 1, 8, 3, 5, 5, 7, 8, 8};
        testArrayContainsInOrder(expected, quickUnion.getForest());
    }

    @Test
    public void testSecondaryUnions() {
        secondSetOfUnions();
        final int[] expected = new int[]{1, 8, 1, 8, 3, 0, 5, 1, 8, 8};
        testArrayContainsInOrder(expected, quickUnion.getForest());
    }

    @Test
    public void testInitialUnionsHaveZeroConnectedToSeven() {
        assertThat(quickUnion.connected(0, 7), is(false));
    }

    @Test
    public void testInitialUnionsHaveEightConnectedToNine() {
        assertThat(quickUnion.connected(8, 9), is(true));
    }

    private void testArrayContainsInOrder(int[] expected, int[] actual) {
        for (int i = 0; i < expected.length; i++) {
            assertThat(actual[i], equalTo(expected[i]));
        }
    }
}