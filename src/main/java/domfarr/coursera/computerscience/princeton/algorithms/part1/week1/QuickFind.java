package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;

public class QuickFind {
    private final int[] arr;

    public QuickFind(final int n) {
        arr = InitialiseArray.initialiseArray(n);
    }

    public boolean connected(int p, int y) {
        return arr[p] == arr[y];
    }

    public void union(int p, int y) {
        int pId = arr[p];
        int yId = arr[y];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == pId) arr[i] = yId;
        }
    }
}
