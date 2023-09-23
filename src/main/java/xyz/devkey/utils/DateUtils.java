package xyz.devkey.utils;


import java.util.Calendar;
import java.util.Locale;

public class DateUtils {

    private static ThreadSafeSimpleDateFormat df = new ThreadSafeSimpleDateFormat("yyyyMMdd");
    private static ThreadSafeSimpleDateFormat tf = new ThreadSafeSimpleDateFormat("HHmmss");
    private static ThreadSafeSimpleDateFormat dtf = new ThreadSafeSimpleDateFormat("yyyyMMddHHmmss");

    public static String getCurrentDate()
    {
        Calendar cal = Calendar.getInstance(Locale.KOREA);

        return dtf.format(cal.getTime());
    }

    public static String getCurrentDay()
    {
        Calendar cal = Calendar.getInstance(Locale.KOREA);

        return df.format(cal.getTime());
    }

    public static String getCurrentTime()
    {
        Calendar cal = Calendar.getInstance(Locale.KOREA);

        return tf.format(cal.getTime());
    }

    public static String getAddDays(String yyyyMMdd, int days)
            throws Exception
    {
        Calendar cal = Calendar.getInstance(Locale.KOREA);
        cal.setTime(df.parse(yyyyMMdd));

        cal.add(5, days);

        return df.format(cal.getTime());
    }
}
