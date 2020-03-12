package domfarr.coursera.computerscience.princeton.algorithms.part1.week1;


public class Percolate extends WeightedCompressedQuickUnion {
    private int n;
    private boolean[] state;

    public Percolate(int n) {
        super(n*n+2);
        state = new boolean[n*n+2];
        state[0] = true;
        state[n*n+1] = true;
        this.n = n;

        for (int i = 1; i < n+1; i++) {
            union(0,i);
        }

        for (int i = n*n-n+1; i < n*n+1; i++) {
            union(i, n*n+1);
        }
    }

    public void openSite(int i) {
        state[i] = true;
        if(i > 0 && i < n+1) {// top row
            connectDown(i);
        } else if(i > n*n-n && i < n*n+1) { // bottom row
            connectUp(i);
        } else {
            connectUp(i);
            connectDown(i);
        }
        connectLeftRightBoundary(i);
    }

    private void connectLeftRightBoundary(int i) {
        if ((i - 1) % n == 0) { // left boundary
            connectRight(i);
        } else if (i % n == 0) { // right boundary
            connectLeft(i);
        } else {
            connectLeft(i);
            connectRight(i);
        }
    }

    private void connectDown(int i) {
        // connect down
//        System.out.println("Check connectivity downwards of " + i);
        if(state[i+n] && !connected(i, i+n)) {
//            System.out.println("connected " + i +" " + i+n);
            union(i, i+n);
        }
    }

    private void connectUp(int i) {
        // connect up
//        System.out.println("Check connectivity upwards of " + i);
        if(state[i-n] && !connected(i, i-n)) {
//            System.out.println("connected " + i + " " + (i-n));
            union(i, i-n);
        }
    }

    private void connectRight(int i) {
        // connect right
//        System.out.println("Check connectivity to the right of " + i);
        if(state[i+1] && !connected(i, i+1)){
//            System.out.println("connected " + i + " " + (i+1));

            union(i, i+1);
        }
    }

    private void connectLeft(int i) {
        // connect left
//        System.out.println("Check connectivity to the left of " + i);
        if(state[i-1] && !connected(i, i-1)){
//            System.out.println("connected " + i + " " + (i-1));

            union(i, i-1);
        }
    }

    public boolean isTrue() {
        return connected(0, n*n+1);
    }

    public boolean isOpen(int i) {
        return state[i];
    }
}
