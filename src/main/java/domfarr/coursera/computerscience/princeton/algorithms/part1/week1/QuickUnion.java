package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;

public class QuickUnion {
    private final int[] arr;

    public QuickUnion(final int n) {
        arr = InitialiseArray.initialiseArray(n);
    }

    /*
        To merge components containing p and q,set the id of p's root to the id of q's root.
     */
    public void union(int p, int q) {
        arr[findRoot(p)] = findRoot(q);
    }

    public int findRoot(int i) {
        int id = arr[i];
        while(id != arr[id]) {
            id = arr[id];
        }

        return id;
    }

    public boolean connected(int p, int q) {
        return arr[p] == arr[q];
    }

    public int[] getForest() {
        return arr;
    }
}
