package myjava.others;

import java.util.*;
public class IntegerToRoman
{
    static String integerConverter(int n)
    {
        switch (n)
        {
            case 1:
                return "I";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 40:
                return "XL";
            case 50:
                return "L";
            case 90:
                return "XC";
            case 100:
                return "C";
            case 400:
                return "CD";
            case 500:
                return "D";
            case 900:
                return "CM";
            case 1000:
                return "M";
            default:
                return "";
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String roman = ""; int number = 0;
        System.out.println("Enter a number:");

        try
        {
            number = in.nextInt();
            if (number >= 4000)
            {
                in.close();
                throw new Exception("Input Should not exceed 4000");
            }
            int denominations[] = {4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            for(int x = 0; x < denominations.length - 1; x++)
            {
                if (number >= denominations[x + 1] && number < denominations[x])
                {
                    for(int i = 1; i <= number / denominations[x + 1]; i++)
                        roman += integerConverter(denominations[x + 1]);
                    number %= denominations[x + 1];
                }
            }
            System.out.println(roman);
        }
        catch (Exception err)
        {
            String Error = err.toString();
            System.err.println("Error: " + Error.substring(Error.indexOf(" ") + 1));
        }
        in.close();
    }
}