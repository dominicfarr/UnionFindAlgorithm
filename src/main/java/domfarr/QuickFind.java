package domfarr;

public class QuickFind {
    public static int[] arr = new int[10];

    public QuickFind(final int n) {
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
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
