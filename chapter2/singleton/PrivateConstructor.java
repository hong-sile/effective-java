package chapter2.singleton;

/**
 * Effective java 항목 3 private 생성자나 enum 타입을 사용해서 싱글톤의 특성을 유지하라 <br>
 * private 생성자로 싱글톤을 보장하는 방법 <br>
 * 생성자는 private이고 인스턴스는 static이므로 해당 클래스의 객체는 무조건 하나임을 보장한다.<br>
 * 해당 객체를 접근할 수 있는 방법은 오로지 getInstacne 뿐이기에, 약한 불변성 또한 보장한다. <br>
 * 또한 이 방식은 정적팩토리 메소드의 방법을 채용한 것이기에, 인스턴스의 형태를 바꿀 수 있는 유연성을 제공한다. <br>
 */
public class PrivateConstructor {
    private static final PrivateConstructor INSTANCE = new PrivateConstructor();

    private PrivateConstructor() {
    }

    public static PrivateConstructor getInstance() {
        return INSTANCE;
    }
}
