package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;

public class QuickUnion {
    protected final int[] arr;

    public QuickUnion(final int n) {
        arr = InitialiseArray.initialiseArray(n);
    }

    public int findRoot(int i) {
        int id = i;
        while(id != arr[id]) {
            id = arr[id];
        }

        return id;
    }

    public boolean connected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    public void union(int p, int q) {
        arr[findRoot(p)] = findRoot(q);
    }

    public int[] getForest() {
        return arr;
    }
}
