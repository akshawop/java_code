import java.util.Scanner;
public class ValidDate
{ 
    static String DateValidation()
    {
        Scanner in = new Scanner(System.in);
        String date; 
        boolean flag;
        int f1 = 0, f3 = 0, f5 = 0, f6 = 0, f4 = 0;
        do
        {
            flag = true;
            System.out.println("Enter the Date as DD/MM/YYYY"); 
            date = in.nextLine();

            if(date.length() == 10)
            {
                if(date.charAt(2) != '/' && date.charAt(5) != '/')
                    flag = false;
            }
            else
                flag = false;
            for(int j = 0; j < date.length(); j++) 
            {
                char ch = date.charAt(j);
                if(j == 2 || j == 5)
                    continue;
                    
                if(!(Character.isDigit(ch)))
                {
                    flag = false;
                    break;
                }
            }
            if(flag == false) 
                System.out.println("Not allowed!");
        }while(flag == false);
        in.close();
        
        int a = Integer.parseInt(date.substring(0, 2)); //Date
        int b = Integer.parseInt(date.substring(3, 5)); //Month
        int c = Integer.parseInt(date.substring(6)); //Year

        if (((c % 4 == 0) && (c % 100 != 0)) || (c % 400 == 0)) 
            f4 = 1;
        if(b > 0 && b < 13 && a > 0 && c > 1000)
        {
            if(b == 2 && f4 == 1)
            {
                if(a < 30)
                    f1 = 1;
            }
            else if(b == 2 && f4 != 1)
            {
                if(a < 29)
                    f3 = 1;
            }
            if(b == 4 || b == 6 || b == 9 || b == 11)
            {
                if(a < 31 && b < 13)
                    f5 = 1;
        
            }
            else if(b != 2)
            {
                if(a < 32 && b < 13)
                    f6 = 1;
            }
        }

        if(f1 == 1 && f4 == 1 || f3 == 1 || f5 == 1 || f6 == 1)
            return date;
        else
            return "X";
        
    }
}