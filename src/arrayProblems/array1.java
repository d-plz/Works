package arrayProblems;

public class start1 {
    public int start1(int[] a, int[] b) {
        int count = 0;
        // iterate over 1st element separately
        // ensure no runtime error by checking if [] length > 0
        if (a.length > 0) {
            if (a[0] == 1) {
                count += 1;
            }
        }
        if (b.length > 0) {
            if (b[0] == 1) {
                count += 1;
            }
        }
        return count;
}
