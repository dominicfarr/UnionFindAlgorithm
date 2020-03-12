package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PercolateTest {
    private final int n = 5;
    private final Percolate percolate = new Percolate(n);

    @Test
    public void testWithOpeningSiteTopRowLeftBoundary() {
        int i = 1;
        percolate.openSite(i);
        assertThat(percolate.connected(i, 0), equalTo(true));
        assertThat(percolate.connected(i, i + 1), equalTo(true));
        assertThat(percolate.connected(i, i + n), equalTo(false));
    }

    @Test
    public void testWithOpeningSiteTopRowRightBoundary() {
        int i = 5;
        percolate.openSite(i);
        assertThat(percolate.connected(i, 0), equalTo(true));
        assertThat(percolate.connected(i, i + n), equalTo(false));
        assertThat(percolate.connected(i, i - 1), equalTo(true));
    }

    @Test
    public void testWithOpeningSiteMidRowLeftBoundary() {
        int i1 = 6;
        percolate.openSite(i1);
        assertThat(percolate.connected(i1, i1 - n), equalTo(false));
        assertThat(percolate.connected(i1, i1 + 1), equalTo(false));
        assertThat(percolate.connected(i1, i1 + n), equalTo(false));
        int i2 = 11;
        percolate.openSite(i2);
        assertThat(percolate.connected(i2, i2 - n), equalTo(true));
        assertThat(percolate.connected(i2, i2 + 1), equalTo(false));
        assertThat(percolate.connected(i2, i2 + n), equalTo(false));
    }

    @Test
    public void testWithOpeningSiteMidRowRightBoundary() {
        int i = 10;
        percolate.openSite(i);
        assertThat(percolate.connected(i, i - n), equalTo(false));
        assertThat(percolate.connected(i, i + n), equalTo(false));
        assertThat(percolate.connected(i, i - 1), equalTo(false));
    }

    @Test
    public void testWithOpeningSiteMidRowNotBoundary() {
        int i1 = 19;
        percolate.openSite(i1);
        assertThat(percolate.connected(i1, i1 - n), equalTo(false));
        assertThat(percolate.connected(i1, i1 + 1), equalTo(false));
        assertThat(percolate.connected(i1, i1 + n), equalTo(false));
        assertThat(percolate.connected(i1, i1 - 1), equalTo(false));
        int i2 = 14;
        percolate.openSite(i2);
        assertThat(percolate.connected(i2, i2 - n), equalTo(false));
        assertThat(percolate.connected(i2, i2 + 1), equalTo(false));
        assertThat(percolate.connected(i2, i2 + n), equalTo(true));
        assertThat(percolate.connected(i2, i2 - 1), equalTo(false));
    }


    @Test
    public void testWithOpeningSiteBottomRowLeftBoundary() {
        int i = 21;
        percolate.openSite(i);
        assertThat(percolate.connected(i, i - n), equalTo(false));
        assertThat(percolate.connected(i, i + 1), equalTo(true));
        assertThat(percolate.connected(i, 26), equalTo(true));
    }

    @Test
    public void testWithOpeningSiteBottomRowRightBoundary() {
        int i = 25;
        percolate.openSite(i);
        assertThat(percolate.connected(i, i - n), equalTo(false));
        assertThat(percolate.connected(i, 26), equalTo(true));
        assertThat(percolate.connected(i, i - 1), equalTo(true));
    }
}