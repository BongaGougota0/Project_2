package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class TransactionData
{
    public TransactionData(){};
    private String dataType;
    private String systemName;
    private String eventDate;
    private String transactionNumber;
    private String customerID;
    private String customerName;
    private String transactionDate;
    private String productCode;
    private String amount;

    public void set(String fieldName, String value)
    {
        System.out.println("F: "+fieldName+" Va: "+value);
        if(fieldName.equalsIgnoreCase(dataType))
        {
            this.dataType = value;
        }
        if(fieldName.equalsIgnoreCase(systemName))
        {
            this.systemName = value;
        }
        if(fieldName.equalsIgnoreCase(eventDate))
        {
            this.eventDate = value;
        }
        if(fieldName.equalsIgnoreCase(transactionNumber))
        {
            this.transactionNumber = value;
        }
        if(fieldName.equalsIgnoreCase(customerID))
        {
            this.customerID = value;
        }
        if(fieldName.equalsIgnoreCase(customerName))
        {
            this.customerName = value;
        }
        if(fieldName.equalsIgnoreCase(transactionDate))
        {
            this.transactionDate = value;
        }
        if(fieldName.equalsIgnoreCase(productCode))
        {
            this.productCode = value;
        }
        if(fieldName.equalsIgnoreCase(amount))
        {
            this.amount = value;
        }
    }
}
