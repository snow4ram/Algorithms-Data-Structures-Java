package studyjavaapi.javaapi.BigONotation.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AlignBubblesProgram {


    public int[] bubbles(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {

                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1]= temp;
                }
            }
        }

        int[] array = new int[nums.length];
        System.arraycopy(nums, 0, array, 0, nums.length);

        return array;

    }

    public void solution(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
        }
    }


}
