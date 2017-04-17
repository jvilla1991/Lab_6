import java.util.Scanner;
import java.lang.Character;

public class Main {

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        String s = " ";
        boolean a = true;
        int x = 0;

        System.out.println("Please enter a word: ");
        s = scnr.next();

        /*s = s.toLowerCase();*/

        for (int i = 0; i < s.length(); i++)
        {
            if ( !((65 <= s.charAt(i) && s.charAt(i) <= 90) || (97 <= s.charAt(i) && s.charAt(i) <= 122)) )
            {
                System.out.println(s);
                return;
            }
        }

        if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u')
        {
            System.out.println(s.substring(1, 2).toUpperCase() + s.substring(2) + s.charAt(0) + "way");
        }
        else
        {
            System.out.println(s.substring(1, s.length()) + s.charAt(0) + "ay");
        }


    }
}
