import java.util.Scanner;

/**
 * Script for pairwise swapping
 */
public class Encrypt
{
    public static String encrypt(String str) {
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = 1; i <str.length(); i+=2) {
            String res = chars[i]+String.valueOf(chars[i-1]);
            result += res;
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(encrypt(sc.nextLine()));
    }
}
