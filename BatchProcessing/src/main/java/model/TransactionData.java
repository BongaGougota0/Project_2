package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
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
        if(fieldName.equalsIgnoreCase("dataType"))
        {
            setDataType(value);
        }
        if(fieldName.equalsIgnoreCase("systemName"))
        {
            setSystemName(value);
        }
        if(fieldName.equalsIgnoreCase("eventDate"))
        {
            setEventDate(value);
        }
        if(fieldName.equalsIgnoreCase("transactionNumber"))
        {
            setTransactionNumber(value);
        }
        if(fieldName.equalsIgnoreCase("customerID"))
        {
            setCustomerID(value);
        }
        if(fieldName.equalsIgnoreCase("customerName"))
        {
            setCustomerName(value);
        }
        if(fieldName.equalsIgnoreCase("transactionDate"))
        {
            setTransactionDate(value);
        }
        if(fieldName.equalsIgnoreCase("productCode"))
        {
            setProductCode(value);
        }
        if(fieldName.equalsIgnoreCase("amount"))
        {
           setAmount(value);
        }
    }
}
