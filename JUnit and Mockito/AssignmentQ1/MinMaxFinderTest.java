package AssignmentQ1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxFinderTest {

    private MinMaxFinder minMaxFinder;
    private int[] expected;
    private int[] actual;

    @BeforeEach
    public void init(){
        minMaxFinder = new MinMaxFinder();
        expected = new int[]{3, 56};
    }

    @Test
    public void MinMaxFinderTest (){
        actual = minMaxFinder.findMinMax(new int[]{56, 34, 7,3, 54, 3, 34, 34, 53});
        Assertions.assertArrayEquals(expected,actual);
    }

    @AfterEach
    public void Clean(){
        minMaxFinder = null;
        expected = actual = null;
    }


}