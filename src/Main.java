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

        s.toLowerCase();

        if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u')
        {
            System.out.println(s.concat("way"));
        }
        else
        {
            Character.toUpperCase(s.charAt(1));
            System.out.println(s.substring(1, s.length()) + s.charAt(0) + "ay");
        }


    }
}
