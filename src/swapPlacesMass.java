import java.util.Scanner;

/**
 * Given a list (first the number of elements, then the elements themselves). Then there are two numbers: a and b.
 * Swap the values of the a-th and b-th elements of the array and display it line by line.
 * It is guaranteed that a and b do not go beyond the limits of the array size.
 */
class swapPlacesMass{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sizeMas = scan.nextInt();

        int [] mas = new int[sizeMas];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = scan.nextInt();
        }
        int a = scan.nextInt();
        int b = scan.nextInt();
        int temp = mas[a];
        mas[a]= mas[b];
        mas[b]= temp;
        for (int i = 0; i < mas.length; i++) {

            System.out.println(mas[i]);
        }

    }
}