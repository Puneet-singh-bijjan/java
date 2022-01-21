import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class HelloWorld {
    public static String engTime(String input)
        throws ParseException
    {
 
        // Format of the date defined in the input String
        DateFormat dateFormat
            = new SimpleDateFormat("hh:mm:ssaa");

        // Change the pattern into 24 hour formate
        DateFormat formate
            = new SimpleDateFormat("HH:mm:ss");
        Date time = null;
        String output = "";

        // Converting the input String to Date
        time = dateFormat.parse(input);

        // Changing the format of date
        // and storing it in
        // String
        output = formate.format(time);
        return output;
    }
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(engTime(str));
    }
}