package xyz.devkey.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSafeSimpleDateFormat {

    private DateFormat df;

    public ThreadSafeSimpleDateFormat(String format)
    {
        this.df = new SimpleDateFormat(format);
    }

    public synchronized String format(Date date) {
        return this.df.format(date);
    }

    public synchronized Date parse(String string) throws ParseException {
        return this.df.parse(string);
    }

}
