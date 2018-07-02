package level_three;

public class ArrayTest {

    public int countClumps(int[] nums) {
        int counter = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                counter++;
                while(nums[i]==nums[i+1]){
                    i++;
                    if(i==nums.length-1)
                        break;
                }
            }
        }
        return counter;
    }

}
