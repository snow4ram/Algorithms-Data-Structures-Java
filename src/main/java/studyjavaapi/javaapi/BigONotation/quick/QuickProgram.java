package studyjavaapi.javaapi.BigONotation.quick;

public class QuickProgram {

    public void quickSortRecursive(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        //공식
        int pivot = partition(nums, left, right);

        quickSortRecursive(nums, left, pivot - 1);

        quickSortRecursive(nums, pivot + 1, right);

    }

    private static int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        System.out.println(left);
        int i = left - 1;
        System.out.println(i);

        for (int j = left; j < right; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums,i + 1, right);


        return i + 1;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


}
