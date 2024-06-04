package studyjavaapi.javaapi.BigONotation.link;


import java.util.Objects;

public class LinkedListNode {

    private LinkedNode head;

    private LinkedNode tail;

    public void add(Integer element) {
        LinkedNode node = new LinkedNode(element);
        if (head == null) {
            head = node;
        }else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
    }

    public LinkedNode get(Integer index) {
        LinkedNode current = head;
        Integer currentIndex = 0;
        while (current != null) {
            if (Objects.equals(currentIndex, index)) {
                return current;
            }
            current = current.getNext();
            currentIndex++;
        }
        throw new IllegalArgumentException("해당 인덱스에 대한 정보는 없습니다.");
    }

    public void delete(LinkedNode nodeToDelete) {
        //이전(previous)값
        LinkedNode previousNode = nodeToDelete.getPrevious();
        //다음(next) 값
        LinkedNode nextNode = nodeToDelete.getNext();

        if (previousNode != null) {
            previousNode.setNext(nextNode);
        }

        if (nextNode != null) {
            nextNode.setPrevious(previousNode);
        }
        nodeToDelete.setPrevious(null);
        nodeToDelete.setNext(null);
    }

    public Integer size() {
        LinkedNode next = head;
        Integer size = 0;
        while (next != null) {
            next = next.getNext();
            size ++;
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LinkedNode current = head;
        while (current != null) {
            sb.append(current.getElement());
            if (current.getNext() != null) {
                sb.append(" -> ");
            }
            current = current.getNext();
        }
        return sb.toString();
    }
}
