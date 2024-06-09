package studyjavaapi.javaapi.BigONotation.program;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlignBubblesProgramTest {


    @Test
    public void test_1() {

        AlignBubblesProgram program = new AlignBubblesProgram();

        int[] array = {5 ,3, 1, 3, 4, 6, 2};

        program.solution(array);



    }

}