package studyjavaapi.javaapi.BigONotation.quick;

import java.util.Collections;
import java.util.List;

public class QuickSort {

    public void quicksort(List<Integer> list, int left, int right) {
        int q;
        if (right > left) {

            q = partition(list, left, right);

            quicksort(list, left, q - 1);
            quicksort(list, q + 1, right);
        }
    }

    private static int partition(List<Integer> list, int left, int right) {
        //왼쪽 첫번쨰
        int pivot = list.get(left);
        int leftIndex = left;
        int rightIndex = right + 1;

        for (; ; ) {
            while (true) {
                if (leftIndex >= right || list.get(++leftIndex) >= pivot) break;
            }
            while (true) {
                if (rightIndex <= left || list.get(--rightIndex) <= pivot) break;
            }
            if (leftIndex >= rightIndex) {
                break;
            }

//            Collections.swap(list, leftIndex, rightIndex);
            swap(list, leftIndex, rightIndex);
        }

//        Collections.swap(list, left, rightIndex);
        swap(list, left, rightIndex);
        return rightIndex;
    }

    private static void swap(List<Integer> nums, int a, int b) {
        int temp = nums.get(a);       // 리스트에서 a 위치의 요소를 가져옴
        nums.set(a, nums.get(b));     // a 위치에 b 위치의 요소를 저장
        nums.set(b, temp);            // b 위치에 temp(원래 a 위치의 요소)를 저장
    }
}
