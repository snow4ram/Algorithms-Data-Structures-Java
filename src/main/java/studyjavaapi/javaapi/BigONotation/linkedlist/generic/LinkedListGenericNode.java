package studyjavaapi.javaapi.BigONotation.linkedlist.generic;


import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class LinkedListGenericNode<E> {

    private GenericNode<E> head;
    private GenericNode<E> tail;

    public void add(E element) {
        GenericNode<E> node = new GenericNode<>(element);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
    }

    public GenericNode<E> get(int index) {
        GenericNode<E> current = head;
        Integer currentIndex = 0;
        for (; current != null; current = current.getNext()) {
            if (Objects.equals(currentIndex, index)) {
                return current;
            }
            currentIndex++;
        }
        throw new IllegalArgumentException("해당 인덱스에 대한 정보는 없습니다.");
    }

    public void update(int find, E updateValue) {
        GenericNode<E> findNode = get(find);
        findNode.update(updateValue);
    }

    public GenericNode<E> last() {
        GenericNode<E> node = head;
        while (node != null && node.getNext() != null) {
            node = node.getNext();
        }
        return node;
    }

    public void delete(GenericNode<E> nodeToDelete) {
        GenericNode<E> previousNode = nodeToDelete.getPrevious();
        GenericNode<E> nextNode = nodeToDelete.getNext();

        if (previousNode != null) {
            previousNode.setNext(nextNode);
        }

        if (nextNode != null) {
            nextNode.setPrevious(previousNode);
        }

        nodeToDelete.setPrevious(null);
        nodeToDelete.setNext(null);
    }

    public void insert(GenericNode<E> referenceNode, E newNode) {
        // 이전 노드를 가져옴
        var previousNode = referenceNode.getPrevious();
        // 새 노드 생성
        var node = new GenericNode<>(newNode);

        node.setNext(referenceNode);

        if (previousNode == null) {
            // head 업데이트
            head = node;
        }

        if (previousNode != null){
            previousNode.setNext(node);
        }

        node.setPrevious(previousNode);

        referenceNode.setPrevious(node);
    }

    public int size() {
        GenericNode<E> next = head;
        int size = 0;
        while (next != null) {
            next = next.getNext();
            size++;
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        GenericNode<E> current = head;
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
