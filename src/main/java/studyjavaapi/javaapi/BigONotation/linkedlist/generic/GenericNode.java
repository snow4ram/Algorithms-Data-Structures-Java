package studyjavaapi.javaapi.BigONotation.linkedlist.generic;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericNode <E>{
    private E element; // 속성을 제네릭 타입으로 변경
    private GenericNode<E> next; // 다음 노드도 동일한 제네릭 타입
    private GenericNode<E> previous; // 이전 노드도 동일한 제네릭 타입

    public GenericNode(E element) {
        this.element = element;
    }

    public void update(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Element: " + element ;
    }
}
