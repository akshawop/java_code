import java.util.*;
public class DifferenceInDates extends ValidDate
{
    static boolean flag = true;
    static String check()
    {
        String date = DateValidation();
        if(date.equals("X"))
            flag = false;
        else
        {
            flag = true;
            return date;
        }

        return "";
    }
    static int daysDiff(int month1, int month2, int days[], int secondDate, int firstDate)
    {
        int sum = 0;
        for(int i = month1 - 1; i <= month2 - 1; i++)
        {
            if(i == month1 - 1)
                sum += (days[month1 - 1] - firstDate);
            else if(i == month2 - 1)
                sum += secondDate;
            else
                sum += days[i]; 
        }
        return sum;
    }
    static boolean isLeap(int year)
    {
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String date1 = "", date2 = "";
        
        do
        {
            date1 = check();
        }while(!flag);

        System.out.println("-----------------------------------");
        do
        {
            date2 = check();
        }while(!flag);
        System.out.println("-----------------------------------");

        System.out.println("Date 1 : " + date1);
        System.out.println("Date 2 : " + date2 + "\n");

        int a = Integer.parseInt(date1.substring(0, 2)); //1st Date
        int b = Integer.parseInt(date1.substring(3, 5)); //Month1
        int c = Integer.parseInt(date1.substring(6)); //Year1

        int a2 = Integer.parseInt(date2.substring(0, 2)); //2nd Date
        int b2 = Integer.parseInt(date2.substring(3, 5)); //Month2
        int c2 = Integer.parseInt(date2.substring(6)); //Year2

        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int leap = 0;
        for(int i = c; i <= c2; i++)
        {
            if(isLeap(i)) 
            leap++;
        }

        int result = 0;
        if(b < b2)
            result = (Math.abs(c2 - c) * 365) + daysDiff(b, b2, days, a2, a);   //DaysDiff(month1, month2, daysArray, secondDate, firstDate)
        else if(b > b2)
            result = (Math.abs(c2 - c) * 365) - daysDiff(b2, b, days, a, a2);
        
        if(b == b2 && a <= a2)
            result = (Math.abs(c2 - c) * 365) + (a2 - a);
        else if(b == b2 && a > a2)
            result = (Math.abs(c2 - c) * 365) - (a - a2);

        if(b > 2 && isLeap(c))
            leap--;
        if(b2 <= 2 && isLeap(c2))
            leap--;

        result += leap;
        System.out.println("Difference : " + result + " days");
        in.close();
    }
}