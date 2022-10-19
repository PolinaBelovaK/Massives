import java.util.Scanner;

/**
 * Create an array that will store cubes of numbers from 1 to 1000. Then 2 numbers from this range are entered. Using the data from the array, find their cubes.
 */
public class cubesInMassive {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr = new int[1001];
            for(int i = 0; i<arr.length; i++){
                arr[i] = i*i*i;
            }
            System.out.println(arr[a]);
            System.out.println(arr[b]);
        }
    }
