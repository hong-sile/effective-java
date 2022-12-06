package chapter2.singleton;

/**
 * Effective java 항목 3 private 생성자나 enum 타입을 사용해서 싱글톤의 특성을 유지하라 <br>
 * 이 방법은 싱글톤에서 public 필드 방법과 기능적으로 동일하지만 더 간단하다 <br>
 * 직렬화 또는 리플렉션도 자동으로 지원해주고, 인스턴스가 여러 개 생기지 않도록 보장해준다. <br>
 * 일반적으로 가장 좋은 싱글톤 방법이다. <br>
 * @see <a href="URL"> <주의사항> 열거형을 직렬화할 때 필드 변수는 소실된다.</a>
 */
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
    }
}
