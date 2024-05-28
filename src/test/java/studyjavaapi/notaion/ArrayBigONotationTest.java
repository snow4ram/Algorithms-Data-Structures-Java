package studyjavaapi.notaion;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


@Slf4j
public class ArrayBigONotationTest {

    int[] arr = new int[5];

    @BeforeEach
    public void before() {
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
    }

    @Test
    @DisplayName("O(n)")
    public void 배열의_첫번쨰_위치에_3_추가() {
        log.info("배열의_첫번쨰_위치에_3_추가");
        addFirst(arr,0,2);
    }

    public void addFirst(int[] arr, int index, int addValue) {
        for (int i = arr.length - 1; i > 0; i--) {
            //4 3 2: 30 1: 20 0: 10 
            arr[i] = arr[i - 1];
        }
        arr[0] = addValue;
        log.info("On = {}", Arrays.toString(arr));
    }

    @Test
    @DisplayName("")
    public void 배열의_인덱스_두번쨰_위치에_40_추가() {
        addAtIndex(arr,30);
    }

    public void addAtIndex(int[] arr, int addValue) {

        for (int i = arr.length - 1; i > 2; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = addValue;
        log.info("큰 수 부터 비교후 특정 인덱스 위치 값 변경 = {}", Arrays.toString(arr));
    }
}
