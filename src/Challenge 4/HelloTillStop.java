import java.util. *;

public class HelloTillStop {
    Scanner sc = new Scanner(System.in);

    void showHello() 
        {
            String choice;

            System.out.println("For hello type 'h', otherwise program stops.");
            choice =sc.next();


                while (choice.equals("h"))
                {
                  System.out.println("Hello!");
                  choice =sc.next();
                }
            

        }

    public static void main (String[] args)
    {
        HelloTillStop hello_object = new HelloTillStop();
        hello_object.showHello();
    }    


}
