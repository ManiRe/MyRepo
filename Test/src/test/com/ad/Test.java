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
	
	 public static boolean hasValidValue(Object field) {
	        return field != null && !field.toString().trim().isEmpty() && !field.toString().trim().equals("null");
	    }
	 public static boolean isListEmpty(List<?> dataList) {
	        return null == dataList || dataList.isEmpty();
	    }
	 public static boolean isNull(String checkString) {
	        return null == checkString || checkString.trim().length() == 0 || checkString.trim().equalsIgnoreCase("null");
	    }
	 
	 public static boolean isNotNull(String checkString) {
	        return null != checkString && checkString.trim().length() != 0 && !checkString.trim().equalsIgnoreCase("null");
	    }
	 
	 public static boolean isValidString(String checkString) {
	        return null != checkString && checkString.trim().length() != 0;
	    }
}
