package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;

public class WeightedCompressedQuickUnion extends WeightedQuickUnion {
    public WeightedCompressedQuickUnion(int n) {
        super(n);
    }

    public int findRoot(int i) {
        int id = i;
        while(id != arr[id]) {
            arr[i] = arr[arr[i]];
            id = arr[id];
        }

        return id;
    }
}
