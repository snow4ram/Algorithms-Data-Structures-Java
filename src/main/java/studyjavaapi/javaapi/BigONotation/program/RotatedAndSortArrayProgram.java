package studyjavaapi.javaapi.BigONotation.program;

public class RotatedAndSortArrayProgram {
    public int index(int[] array, int start, int end, int num) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;
        System.out.println("중간값 : " + mid);

        if (array[mid] == num) {
            return mid;
        }

        // 회전 여부 확인: 배열이 정렬된 경우 이진 탐색 수행
        if (array[start] < array[end]) {
            if (num < array[mid]) {
                return index(array, start, mid - 1, num);
            } else {
                return index(array, mid + 1, end, num);
            }
        }

        // 회전된 배열에서 탐색 수행
        if (array[start] <= array[mid]) {
            if (num >= array[start] && num <= array[mid]) {
                return index(array, start, mid - 1, num);
            } else {
                return index(array, mid + 1, end, num);
            }
        }

        if (num >= array[mid] && num <= array[end]) {
            return index(array, mid + 1, end, num);
        } else {
            return index(array, start, mid - 1, num);
        }
    }
}
