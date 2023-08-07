package utils;

import model.TransactionData;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Helper
{
    public static ArrayList<TransactionData> TRANSACTION_DATA_LIST = new ArrayList<TransactionData>();
    public static void readFile(String filename) throws IOException
    {
        Reader reader = null;
        String[] headers = setHeaders(TransactionData.class.getDeclaredFields());
        reader = new FileReader("src/main/resources/" + filename);

        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader(headers)
                .setSkipHeaderRecord(true).build();

        Iterable<CSVRecord> csvRecordIterable = csvFormat.parse(reader);
        setTransactionObjects(csvRecordIterable);
    }

    private static String[] setHeaders(Field[] fields)
    {
        List<String> headers = new ArrayList<>();
        for(Field field : fields)
        {
            headers.add(field.getName());
        }
         headers.stream().toArray(String[]::new);
        return headers.stream().toArray(String[]::new);
    }

    public static List<TransactionData> getTransactionObjects()
    {
        return TRANSACTION_DATA_LIST;
    }

    private static void setTransactionObjects(Iterable<CSVRecord> rawCSVData)
    {
        for(CSVRecord record : rawCSVData)
        {
            TRANSACTION_DATA_LIST.add(createObject(record, TransactionData.class.getDeclaredFields()));
        }
    }

    private static TransactionData createObject(CSVRecord csvRecord, Field[] fields)
    {
        TransactionData transactionData = new TransactionData();
        for(int i = 0; i < fields.length; i++)
        {
            Field field = fields[i];
            String value = csvRecord.get(i);
            transactionData.set(field.getName(), value);
        }
        return transactionData;
    }
}
