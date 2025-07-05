import java.util.Scanner ;

public class Club {
    
public static void main(String[] args)

    {
        Scanner age_input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int user_age = age_input.nextInt();

        if (user_age >= 18) 

        {System.out.println("You are old enough to enter the club");}
        else 
        {System.out.println("You are not old enough to enter the club");}

        age_input.close();
    }

    
        
}
