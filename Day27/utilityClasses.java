package Day27;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class utilityClasses {
    public static void main(String[] args) {
        // date class
        Date cd = new Date();
        System.out.println("the current date is "+cd);

        Date sd = new Date(123456789123456789);
        System.out.println("the date is "+sp);

        // Calendar
        Calendar c = Calendar.getInstance();
        System.out.println("the current Date and time is "+c.getTime());
        c.add(Calendar.DAY_OF_MONTH, 2);
        c.set(2023,Calendar.AUGUST,30);

        // Local Date
        LocalDate currD = LocalDate.now();
        System.out.println("currentDate is "+currD);
        LocalTime currT = LocalTime.now();
        System.out.println("current time is "+currT);
        LocalDateTime cDT = LocalDateTime.now()

        // date formatting
        SimpleDateFormat f =new SimpleDateFormat("dd-MM-yyy HH:mm:ss");
        String formattedD = f.format(cd);
        System.out.println(cd);
        Date nd = f.parse(formattedD);

    }
}
