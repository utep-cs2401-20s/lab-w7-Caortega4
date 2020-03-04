public class SortOfSort {
    public static void sortOfSort(int[] nums){

        if(nums.length < 2)
            return ;

        int highestIndex = 0;
        int temp = Integer.MIN_VALUE;
        int leftOffset = 0;
        int rightOffset = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            highestIndex = leftOffset;
            for (int j = leftOffset; j < nums.length - rightOffset; j++) {
                if(nums[j] > nums[highestIndex]) {
                    highestIndex = j;
                }
            }
            if (count1 < 2 ) {
                count2 = 0;
                temp = nums[nums.length - 1 - rightOffset] ;
                nums[nums.length - 1 - rightOffset] = nums[highestIndex];
                nums[highestIndex] = temp;
                rightOffset++;
                count1++;
            }else {

                temp = nums[leftOffset];
                nums[leftOffset] = nums[highestIndex];
                nums[highestIndex] = temp;
                leftOffset++;
                count2++;
                if (count2 == 2){
                    count1 = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        sortOfSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

}
