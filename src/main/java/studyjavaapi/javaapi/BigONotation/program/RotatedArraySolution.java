package studyjavaapi.javaapi.BigONotation.program;

public class RotatedArraySolution {

    public int solution(int[] array, int num) {
        int answer = 0;
        int start = 0;
        int end = array.length - 1;

        for (; start <= end;) {  // while 문을 for 문으로 변경
            int mid = start + (end - start) / 2;

            if (array[mid] == num) {
                return mid;  // 타겟을 찾았을 때
            }

            // 정렬된 왼쪽 부분 확인
            if (array[start] <= array[mid]) {
                if (num >= array[start] && num <= array[mid]) {
                    end = mid - 1;  // 타겟이 정렬된 왼쪽 부분에 있을 때
                } else {
                    start = mid + 1;  // 타겟이 오른쪽 부분에 있을 때
                }
            } else {  // 오른쪽 부분이 정렬된 경우
                if (num >= array[mid] && num <= array[end]) {
                    start = mid + 1;  // 타겟이 정렬된 오른쪽 부분에 있을 때
                } else {
                    end = mid - 1;  // 타겟이 왼쪽 부분에 있을 때
                }
            }
        }
        return -1;  // 타겟이 배열에 없을 경우

    }
}
