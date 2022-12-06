package chapter2.avoid_create_unnecessary_object;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * PersonBadCase에서의 중복생성을 막기 위해 static initializer를 사용하여 비효율적인 객체 사용을 막는다.<br>
 * 이 방법도 완벽한 건 안디ㅏ 만약 isBabyBoomer 메소드를 사용하지 않는다면, 쓸데없는 초기화가 있는 것이다.
 */
public class PersonGoodCase {
    private final Date birthDate;

    public PersonGoodCase(Date birthDate) {
        this.birthDate = birthDate;
    }

    private static final Date BOOM_START;
    private static final Date BOOM_END;

    // static initailizer를 잘 활용하자.
    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = gmtCal.getTime();
    }

    private boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >= 0 &&
                birthDate.compareTo(BOOM_END) < 0;
    }
}
