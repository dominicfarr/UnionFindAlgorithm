package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;

import java.util.Arrays;

public class WeightedQuickUnion extends QuickUnion {
    private final int[] treeSize;

    public WeightedQuickUnion(int n) {
        super(n);

        treeSize = new int[n];
        Arrays.fill(treeSize, 1);
    }

    @Override
    public void union(int p, int q) {
        int i = findRoot(p);
        int j = findRoot(q);

        if (i == j) {
            return;
        }

        if (treeSize[p] < treeSize[q]) {
            arr[i] = j;
            treeSize[j] += treeSize[i];
        } else {
            arr[j] = i;
            treeSize[i] += treeSize[j];
        }
    }
}
