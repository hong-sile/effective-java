package chapter2;

/** 항목 4 private 생성자를 사용해서 인스턴스 생성을 못하게 하자. <br>
 * 이 방법은 util 클래스와 같이 인스턴스가 생성될 필요는 없으나 메소드 정의는 필요할 때 사용된다. <br>
 * abstract 클래스르 사용하여 인스턴스를 막는 방법을 생각할 수 있으나, <br>
 * abstract 클래스는 상속이 가능하기에 이 방법은 잘못 된 방법이다. <br>
 * 아래 방법은 서브 클래스를 만들 수 없다는 단점이 있다.
 */
public class PrivateConstructorUtility {
    //디폴트 생성자가 생기는 것을 방지한다.
    private PrivateConstructorUtility(){
        throw new RuntimeException("이 클래스는 객체를 생성할 수 없습니다.");
    }
}
