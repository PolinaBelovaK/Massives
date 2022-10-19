
import java.util.Scanner;

/**
 * Given a list. Output those elements that appear in the list only once. The elements must be displayed in the order in which they appear in the list.
 */
public class uniqueElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++) array[i] = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) if(array[i] == array[j]) count++;
            if (count == 1) System.out.println(array[i]);
        }

    }
}