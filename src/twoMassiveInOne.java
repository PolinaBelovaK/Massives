import java.util.Arrays;

/**
 * Merges two given sorted arrays into one
 *
 * a1 first sorted array
 * a2 second sorted array
 * @return new array containing all elements from a1 and a2, sorted
 */
public class twoMassiveInOne {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int [] result = new int[a1.length + a2.length];
        int pos1 = 0;
        int pos2 = 0;
        while(pos1<a1.length || pos2<a2.length) {
            result[pos1+pos2] = (pos1<a1.length && (pos2 == a2.length || a1[pos1]<a2[pos2]) ?
                    a1[pos1++] : a2[pos2++]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {0, 1};
        int[] test2 = {1, 2, 3};
        System.out.println(Arrays.toString(mergeArrays(test1, test2)));
    }
}
