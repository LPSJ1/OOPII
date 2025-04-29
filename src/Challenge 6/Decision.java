import java.util.Scanner;

public class Decision {
    Scanner scanner = new Scanner(System.in);
    //input value
    public int getNumber(){
        System.out.println("Enter a number between 1 and 4: ");	
  int number=scanner.nextInt();
  return number;
      }
    
    //outputting 
    public void checkNumber(int number){
        if (number == 1) {
            System.out.println("You entered 1.");
        } else if (number == 2) {
            System.out.println("You entered 2.");
        } else if (number == 3) {
            System.out.println("You entered 3.");
        } else if (number == 4) {
            System.out.println("You entered 4.");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 4.");
        }
    }
   
public static void main(String[] args) {
    Decision decision = new Decision();
   int number= decision.getNumber();
    decision.checkNumber(number);
}
}