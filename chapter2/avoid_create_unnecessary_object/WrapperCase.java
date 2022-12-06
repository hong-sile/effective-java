package chapter2.avoid_create_unnecessary_object;

/**
 * Wrapper 클래스를 사용할 때 오토박싱을 유의해야 한다.
 */
public class WrapperCase {
    public static void main(String[] args) {
        //무지하게 느리다.
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            //무의미한 Long instance를 Integer.Max_Value만큼 생성해 낸다. Long 대신 long를 사용하자.
            sum += i;
        }
        System.out.println(sum);
    }
}
