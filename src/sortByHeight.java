import java.util.Scanner;

/**
 * The program receives as input a non-increasing sequence of natural numbers (first the quantity is entered, then the numbers themselves),
 * meaning the growth of each person in the ranks. After that, the number X is entered - Petya's height.
 * All numbers in the input are natural and do not exceed 200.
 */
class sortByHeight{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Counter = 0;
        int[]Array = new int[n];
        for (int i = 0; i<n; i++)
            Array[i]=sc.nextInt();
        int Petya = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(Array[i] < Petya){
                System.out.println(i+1);
                break;
            }
        }
        for(int i = 0; i < n; i++){
            if(Petya < Array[i]){
                Counter += 1;
            }
        }
        if(Counter == n){
            System.out.println(n+1);
        }
    }
}