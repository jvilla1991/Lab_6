import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        String s = " ";
        boolean a = true;
        int i = 0;


        System.out.println("Please enter a sentence without punctuation: ");
        s = scnr.nextLine();

        s = s.toLowerCase()

        String[] z = s.split(" ");


        /*for (i = 0; i < s.length(); i++)
        {
            if ( !((65 <= s.charAt(i) && s.charAt(i) <= 90) || (97 <= s.charAt(i) && s.charAt(i) <= 122)) )
            {
                System.out.println(s);
                return;
            }
        }*/


        for (i = 0; i < z.length; ++i)
        {
            if (z[i].charAt(0) == 'a' || z[i].charAt(i) == 'e' || z[i].charAt(0) == 'i' || z[i].charAt(0) == 'o' || z[i].charAt(0) == 'u')
            {
                if (!(z[i].length() < 2))
                System.out.print(z[i].substring(1, 2) + z[i].substring(2) + z[i].substring(0, 1) + "way ");
                else
                {
                    System.out.print(z[i].charAt(0) + "way ");
                }
            }
            else
            {
                if (!(z[i].length() < 2))
                System.out.print(z[i].substring(1, 2) + z[i].substring(2) +  z[i].substring(0, 1) + "ay ");
                else
                {
                    System.out.println(z[i].charAt(0) + "ay ");
                }
            }
        }


    }
}
