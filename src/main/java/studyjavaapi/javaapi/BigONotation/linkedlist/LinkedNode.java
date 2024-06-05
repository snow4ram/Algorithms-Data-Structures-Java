package studyjavaapi.javaapi.BigONotation.linkedlist;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LinkedNode {

    private Integer element; //속성

    private LinkedNode next; // 다음

    private LinkedNode previous; //이전의

    public LinkedNode(Integer element) {
        this.element = element;
    }

    public void update(Integer element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Element: " + element ;
    }

}
