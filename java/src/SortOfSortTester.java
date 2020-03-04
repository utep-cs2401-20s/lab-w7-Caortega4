import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class SortOfSortTester {
    @Test

    //Test case for an array of even size and already sorted on increasing order in order to test minimum requirements
    public void testSortOfSort1(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        SortOfSort.sortOfSort(arr);
        int[] expected = {8,7,4,3,1,2,5,6,9,10};
        Assert.assertArrayEquals(expected, arr);
    }

    @Test

    //Test case for an even size and unordered content
    public void testSortOfSort2(){
        int[] arr = {8,5,6,4,2,7,1,3};
        SortOfSort.sortOfSort(arr);
        int[] expected = {6,5,2,1,3,4,7,8};
        Assert.assertArrayEquals(expected, arr);
    }

    @Test

    //Test case for an empty array to test how the methods handles this particular input
    public void testSortOfSort3(){
        int[] arr = {};
        SortOfSort.sortOfSort(arr);
        int[] expected = {};
        Assert.assertArrayEquals(expected, arr);
    }

    @Test

    //Test case with an odd size where the lowest element sorted at the right half of the array
    public void testSortOfSort4(){
        int[] arr = {6,4,2,8,5};
        SortOfSort.sortOfSort(arr);
        int[] expected = {5,4,2,6,8};
        Assert.assertArrayEquals(expected, arr);
    }

    @Test

    //Test case with an odd size where the lowest element sorted at the left half of the array
    public void testSortOfSort5(){
        int[] arr = {5,3,7,55,88,9,66};
        SortOfSort.sortOfSort(arr);
        int[] expected = {55,9,3,5,7,66,88};
        Assert.assertArrayEquals(expected, arr);
    }
}
