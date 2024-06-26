package studyjavaapi.javaapi.BigONotation.linkedlist;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


//@Slf4j
class LinkedListNodeTest {

    private final LinkedListNode list = new LinkedListNode();

    @BeforeEach
    public void init() {
        list.add(7);
        list.add(10);
        list.add(17);
        list.add(20);
        list.add(25);

    }

    @Test
    @DisplayName("LinkedList에 새로운 요소 추가 시 크기 확인")
    public void add() {
        // Given
        int expectedSize = 6;

        // When
        list.add(30);

        // Then
        assertThat(list.size()).isEqualTo(expectedSize);
    }

    @Test
    @DisplayName("LinkedList에서 특정 인덱스로 요소 접근 시 올바른 값 반환")
    public void get() {
        //Give
        int targetIndex = 2;
        int expectedValue = 17;

        // When
        LinkedNode resultNode = list.get(targetIndex);

        // Then
        assertThat(resultNode.getElement()).isEqualTo(expectedValue);
    }


    @Test
    @DisplayName("LinkedList에서 요소 삭제 후 크기 감소 확인")
    public void delete() {
        //Given
        int targetIndex = 2;
        int expectedSizeAfterDeletion = 4;
        LinkedNode nodeToDelete = list.get(targetIndex);

        // When
        list.delete(nodeToDelete);

        // Then
        assertThat(list.size()).isEqualTo(expectedSizeAfterDeletion);

    }

    @Test
    @DisplayName("LinkedList에 마지막 인덱스 값 찾기")
    public void last() {
        //Give
        Integer lastIndex = 25;

        // When
        LinkedNode last = list.last();

        //Then
        assertThat(last.getElement()).isEqualTo(lastIndex);

    }

    @Test
    @DisplayName("LinkedList에 값 업데이트")
    public void update() {
        //Give
        Integer find = 2;
        Integer updateValue = 50;

        //When
        list.update(find, updateValue);

        //Then
        assertThat(list.get(find).getElement()).isEqualTo(updateValue);


    }

}