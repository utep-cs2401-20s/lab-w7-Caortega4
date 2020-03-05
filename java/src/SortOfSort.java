public class SortOfSort {
    public static void sortOfSort(int[] nums){

        //If the input array is size 1 or 0 that means it is already sorted so it does not changes anything
        if(nums.length < 2)return ;
        int highestIndex = 0;
        int temp = Integer.MIN_VALUE;
        int leftOffset = 0;
        int rightOffset = 0;
        int countRight = 0;
        int countLeft = 0;
        //There will be n swaps therefore a loop to execute the inner loop that amount of times
        for (int i = 0; i < nums.length - 1; i++) {
            //It will not check a number that is already sorted so it will start checking after that
            highestIndex = leftOffset;
            //In order to not check indices that are already sorted it will start after and end before the corresponding offsets
            for (int j = leftOffset; j < nums.length - rightOffset; j++) {
                //Checks for the highest unsorted value in the array
                if(nums[j] > nums[highestIndex]) {
                    highestIndex = j;
                }
            }
            //When it has sorted two elements at the right it will switch to add at the left
            //Each branch swaps the highest unsorted element with the one on its corresponding position
            if (countRight < 2 ) {
                countLeft = 0;
                temp = nums[nums.length - 1 - rightOffset] ;
                nums[nums.length - 1 - rightOffset] = nums[highestIndex];
                nums[highestIndex] = temp;
                rightOffset++;
                countRight++;
            }else {
                temp = nums[leftOffset];
                nums[leftOffset] = nums[highestIndex];
                nums[highestIndex] = temp;
                leftOffset++;
                countLeft++;
                //If it has sorted two elements at the left it rests the count of the right to start adding there again
                if (countLeft == 2){
                    countRight = 0;
                }
                //

            }
        }
    }



}
