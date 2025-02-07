package problem_1;

import org.example.problem_1.CompareLinearAndBinarySearch;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    private static CompareLinearAndBinarySearch binarySearch;

    @BeforeAll
    static void initializeObject(){
        binarySearch = new CompareLinearAndBinarySearch();
    }

    @Test
    void testWithNegativeId(){
        assertThrows(IllegalArgumentException.class, () -> binarySearch.getDataByBinarySearch(-1L));
    }

    @Test
    void testWithPositiveId(){
        binarySearch.getDataByBinarySearch(100L)
                .ifPresent(expectedData -> assertEquals(100L, expectedData.id));
    }

    @Test
    void exceedIntegerLimit(){
        assertThrows(IllegalArgumentException.class, () -> binarySearch
                .getDataByBinarySearch((long)Integer.MAX_VALUE+1));
    }

    @AfterAll
    static void destroyObject(){
        binarySearch = null;
    }
}
