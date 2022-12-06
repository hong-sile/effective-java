package chapter2.avoid_create_unnecessary_object;

/**
 * 불변 객체에서의 객체 중복 생성
 */
public class CreateStringObject {
    private void avoidLiteralCase(){
        /**
         * 이 방법으로 하면 안 된다. 실행 시 매번 새로운 String instance가 생성되므로 불필요한 객체가 만들어진다.
         */
        String wrongCase = new String("avoid case");

        /**
         * 실행될 떄마다 새로운 instance를 생성하지 않고 하나의 string instance를 생성하며,<br>
         * jvm에서 같은 리터럴을 갖도록 재사용된다. (리터럴 풀)
         */
        String correctCase = "avoid case";
    }
}
