import java.util.Random;

public class OrderIDGenerator{
    public static void main(String[] args){

        Random randie= new Random();
        String[] OrderIDs = new String[5];


        for (int i=0; i < OrderIDs.length; i++){
            char prefix = (char) (randie.nextInt(5) + 'A');

            int number = randie.nextInt(999) + 1;
            String suffix = String.format("%03d", number);

            OrderIDs[i] = prefix + suffix;

        }

        for (String orderIDs : OrderIDs){
            System.out.println(orderIDs);
        }
    }
}