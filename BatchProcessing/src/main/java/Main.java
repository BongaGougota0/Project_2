import model.TransactionData;
import utils.Helper;

import java.io.IOException;
import java.lang.reflect.Field;

public class Main
{
    public static void main(String[] args)
    {
        TransactionData transactionData = new TransactionData();
        try
        {
            Helper.readFile("TRANSACTION_003.csv");
            for(TransactionData obj : Helper.getTransactionObjects())
            {
                System.out.println("Obj : "+ obj.getSystemName().);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}