package studyjavaapi.javaapi.BigONotation.program;


import java.util.Arrays;

public class RotatedArrayProgram {


    public int index(int[] array, int start, int end, int num) {

        if (start > end) {
            return -1;
        }

        //중간값을 찾고
        int mid = (start + end) / 2;
        System.out.println("중간값 : " + mid);

        //중간값이 찾으려는 값 이랑 똑같은지 확인
        //YES
        if (array[mid] == num) {
            return mid;
        }

        /*
         * 2가지 조건
         * 기준점으로 부터 왼쪽이 클 경우
         *   기준점으로 부터 왼쪽에서
         * 기준점으로 부터 오른쪽이 클 경우
         * */

        //mid 가 start 보다 작거나 같을 경우
        if (array[start] <= array[mid]) {
            if (num >= array[start] && num <= array[mid]) {
                return index(array, mid - 1, end, num);
            }
            return index(array, mid + 1, end, num);
        }

        //mid 가 end 보다 작거나 같을 경우
        if (num >= array[mid] && num <= array[end]) {
            return index(array, mid + 1, end, num);
        }
        return index(array, start, mid, num);
    }
}
