package practice;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @Author by xiongYiMing on 2019/3/7 17:25
 */
public class LocalDateDemo {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2019,3,8));
        System.out.println(new Date(118,0,1).toString());
        Instant instant = new Date(118,0,1).toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate.compareTo(LocalDate.now()));
    }
}
