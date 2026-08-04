package entities;


import java.time.format.DateTimeParseException;

public class DataDeValidadeInvalida extends DateTimeParseException {


    public DataDeValidadeInvalida(String message, CharSequence parsedData, int errorIndex) {
        super(message, parsedData, errorIndex);
    }
}
