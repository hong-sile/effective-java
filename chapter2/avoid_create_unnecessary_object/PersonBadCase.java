package chapter2.avoid_create_unnecessary_object;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 가변 객체에서의 객체 중복 생성
 */
public class PersonBadCase {
    private final Date birthDate;

    public PersonBadCase(Date birthDate) {
        this.birthDate = birthDate;
    }

    //이렇게 하지 말자
    private boolean isBabyBoomer() {
        //무의미한 객체가 계속 생성된다.
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();

        return birthDate.compareTo(boomStart) >= 0 &&
                birthDate.compareTo(boomEnd) < 0;
    }
}
