package test.com.ad;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Test {

	public static void main(String[] args) {
		System.out.println("fd : "+getIsoFormattedStringFromDateTime(new Date()));
		getIsoFormattedStringFromDateTime(new Date());

	}
	public static String getIsoFormattedStringFromDateTime(Date date) {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        df.setTimeZone(tz);
        return df.format(date);
    }
}
