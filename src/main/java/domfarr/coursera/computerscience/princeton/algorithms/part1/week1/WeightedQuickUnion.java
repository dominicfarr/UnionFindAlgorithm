package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;

public class WeightedQuickUnion {
    private final int[] arr;

    public WeightedQuickUnion(int n) {
        arr = InitialiseArray.initialiseArray(n);
    }

    public int[] getForest() {
        return arr;
    }
}
