package domfarr;

public class InitialiseArray {
    private InitialiseArray() {}

    public static int[] initialiseArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
