package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;

public class WeightedQuickUnion extends QuickUnion {
    private final int[] treeSize;

    public WeightedQuickUnion(int n) {
        super(n);
        treeSize = new int[] {1,1,1,1,1,1,1,1,1,1};
    }

    @Override
    public void union(int p, int q) {
        int pSize = treeSize[p];
        int qSize = treeSize[q];
        if (pSize < qSize) {
            super.union(p, q);
        } else {
            super.union(q, p);
        }

        int updatedSize = pSize + qSize;
        treeSize[p] = updatedSize;
        treeSize[q] = updatedSize;
    }
}
