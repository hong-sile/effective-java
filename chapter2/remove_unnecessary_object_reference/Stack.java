package chapter2.remove_unnecessary_object_reference;

import java.util.Arrays;
import java.util.EmptyStackException;

/** 쓸모 없는 객체 참조를 제거하자 <br>
 * 어떤 클래스에서 자신의 메모리를 자기가 관리한다면, 프로그래머는 항상 메모리 유출에 주의해야한다.
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    /**
     * POP에서 기존 객체에 대한 참조를 해제하지 않기 때문에,<br>
     * 불필요한 객체 임에도 GC 대상이 되지 않기에, 이부분이 많이 쌓이면 메모리 유출이 일어난다.
     */
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    /**
     * 쓸모없는 참조를 null로 바꿔서, 필요없는 객체가 GC에 포함될 수 있게 한다. <br>
     * 하지만 모든 객체 참조를 이런식으로 바꾸는 건 바람직 하지 않다. <br>
     * 꼭 필요할 때만 예외적으로 처리해야한다. <br>
     */
    public Object betterPop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
