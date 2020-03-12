package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;

import static java.lang.String.format;

public class WeightedQuickUnion extends QuickUnion {
    private final int[] treeSize;

    public WeightedQuickUnion(int n) {
        super(n);

        treeSize = new int[n];
        for (int i = 0; i < treeSize.length; i++) {
            treeSize[i] = 1;
        }
    }

    @Override
    public void union(int p, int q) {
//        System.out.println(format("Union %d, %d", p, q));
        int i = findRoot(p);
        int j = findRoot(q);

        if(i==j) {
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
