package Utils;

import java.util.Date;

public class Utils {

    public static long generateRandomNumber(){
        Date date=new Date();
        return date.hashCode();
    }
}
