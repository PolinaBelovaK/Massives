import java.util.Scanner;

/**
 * The number n is entered, then n integers, one on each line. Then enter the number by which you want to multiply all the numbers entered above. Display the result of the multiplication line by line.
 */
class simpleMassiveTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas [i] = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < n; i++)
            System.out.println(mas[i] * b);

    }
}
