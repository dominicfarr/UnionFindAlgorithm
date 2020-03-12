package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;


public class Percolate extends WeightedCompressedQuickUnion {
    private final int n;
    private final boolean[] state;

    public Percolate(int n) {
        super(n*n+2);
        state = new boolean[n*n+2];
        state[0] = true;
        state[n*n+1] = true;
        connectTopRowToVirtualTop(n);
        connectBottomRowToVirtualBottom(n);
        this.n = n;
    }

    public void openSite(int i) {
        state[i] = true;
        if(i > 0 && i < n+1) {
            connectDown(i);
        } else if(i > n*n-n && i < n*n+1) {
            connectUp(i);
        } else {
            connectUp(i);
            connectDown(i);
        }
        connectLeftRightBoundary(i);
    }

    public boolean isTrue() {
        return connected(0, n*n+1);
    }

    public boolean isOpen(int i) {
        return state[i];
    }

    private void connectBottomRowToVirtualBottom(int n) {
        for (int i = n*n-n+1; i < n*n+1; i++) {
            union(i, n*n+1);
        }
    }

    private void connectTopRowToVirtualTop(int n) {
        for (int i = 1; i < n+1; i++) {
            union(0,i);
        }
    }

    private void connectLeftRightBoundary(int i) {
        if ((i - 1) % n == 0) {
            connectRight(i);
        } else if (i % n == 0) {
            connectLeft(i);
        } else {
            connectLeft(i);
            connectRight(i);
        }
    }

    private void connectDown(int i) {
        if(state[i+n] && !connected(i, i+n)) {
            union(i, i+n);
        }
    }

    private void connectUp(int i) {
        if(state[i-n] && !connected(i, i-n)) {
            union(i, i-n);
        }
    }

    private void connectRight(int i) {
        if(state[i+1] && !connected(i, i+1)){
            union(i, i+1);
        }
    }

    private void connectLeft(int i) {
        if(state[i-1] && !connected(i, i-1)){
            union(i, i-1);
        }
    }
}
