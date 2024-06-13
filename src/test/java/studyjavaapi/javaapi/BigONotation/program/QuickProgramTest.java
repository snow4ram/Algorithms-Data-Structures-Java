package studyjavaapi.javaapi.BigONotation.program;

import org.junit.jupiter.api.Test;
import studyjavaapi.javaapi.BigONotation.quick.QuickProgram;
import studyjavaapi.javaapi.BigONotation.quick.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class QuickProgramTest {


    @Test
    public void quickProgram() {

        QuickProgram quickProgram = new QuickProgram();

        int[] array = {7, 2, 5, 1, 3, 8, 7, 4, 9, 6};

        quickProgram.quickSortRecursive(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));


    }

    @Test
    public void quickSortProgram() {

        QuickSort quickProgram = new QuickSort();

        List<Integer> list = List.of(7, 2, 5, 1, 3, 8, 7, 4, 9, 6);
        List<Integer> array = new ArrayList<>(list);
        quickProgram.quicksort(array, 0, array.size() -1);

        System.out.println(array);


    }

}