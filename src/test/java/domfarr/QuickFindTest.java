package domfarr;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QuickFindTest {
    private final QuickFind quickFind = new QuickFind(10);

    @Before
    public void initUnions() {
        quickFind.union(4, 3);
        quickFind.union(3, 8);
        quickFind.union(6, 5);
        quickFind.union(9, 4);
        quickFind.union(2, 1);
    }

    private void secondSetOfUnions() {
        quickFind.union(5, 0);
        quickFind.union(7, 2);
        quickFind.union(6, 1);
        quickFind.union(1, 0);
    }

    @Test
    public void testInitialUnionsHaveZeroConnectedToSeven() {
        boolean c1 = quickFind.connected(0, 7);
        assertThat(c1, is(false));
    }

    @Test
    public void testInitialUnionsHaveEightConnectedToNine() {
        boolean c2 = quickFind.connected(8, 9);
        assertThat(c2, is(true));
    }

    @Test
    public void testSecondUnionsHaveZeroConnectedToSeven() {
        secondSetOfUnions();
        boolean c3 = quickFind.connected(0, 7);
        assertThat(c3, is(true));
    }
}