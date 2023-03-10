package pk;
import java.util.*;
import java.util.logging.*;

public class App 
{
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    public static void main( String[] args )
    {
        String card = "Enter card number: ";
        Scanner sc = new Scanner(System.in);
        LOGGER.info("Enter Name: ");
        String holdername = sc.next();
        LOGGER.info(card);
        int number  = sc.nextInt();
        LOGGER.info("Enter Expiration: ");
        String date = sc.next();
        CREDIT c = new CREDIT(holdername, number, date);
        CREDIT c1 = new CREDIT(c);
        String s = "New Credit Card Details :\nHoldername: "+c1.holdername+"\nCard number : "+c1.number+"\nExpiration Date: "+c1.date;
        int n = 1;
        LOGGER.info(s);
        do{
            try{
                LOGGER.info("1.Edit new Card 2.Edit old Card 3.Check old vs new 4.Exit");
                int m = sc.nextInt();
                if(m == 1){
                    LOGGER.info(card);
                    c1.number  = sc.nextInt();
                    s = "Updated Credit Card Details :\nHoldername: "+c1.holdername+"\nCard number : "+c1.number+"\nExpiration Date: "+c1.date;
                    LOGGER.info(s);
                }
                else if(m == 2){
                    LOGGER.info(card);
                    c.number  = sc.nextInt();
                    s = "Updated Credit Card Details :\nHoldername: "+c.holdername+"\nCard number : "+c.number+"\nExpiration Date: "+c.date;
                    LOGGER.info(s);
                }
                else if(m == 3){
                    c.check(c1.number);
                }
                else{
                    n=0;
                }
            }catch(Exception e){
                s = ""+e;
                LOGGER.info(s);
            }
        }while(n == 1);

    }
}
