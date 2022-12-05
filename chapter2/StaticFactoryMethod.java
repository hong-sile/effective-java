package chapter2;

/**
 * 정적 팩토리 메소드 예시입니다.<br>
 * 정적 팩토리 메소드는 생성자와 달리 자기 이름을 가질 수 있다.<br>
 * 생성자와 달리 호출될 때마다 매번 새로운 객체를 생성할 필요가 없다.(캐싱과 연관되어 있음)<br>
 * 반환타입을 지정할 수 있기 떄문에, 서브타입을 반환하는 등, 반환타입의 유연성을 제공합니다.<br><br>
 *
 * 인스턴스 생성을 위해 static 메소드만을 들고 있기에 생성자를 protected 또는 public으로 바꾸지 않는 한 서브 클래스를 가지지 못한다<br>
 * Static 팩토리 메소드는 다른 static 메소드와 쉽게 구별할 수 없다.
 */
public class StaticFactoryMethod {
    private final int value;

    private StaticFactoryMethod(int value) {
        this.value = value;
    }

    public static StaticFactoryMethod valueOf(String value) {
        return new StaticFactoryMethod(Integer.parseInt(value));
    }

    public static StaticFactoryMethod valueOf(int value) {
        return new StaticFactoryMethod(value);
    }
}
