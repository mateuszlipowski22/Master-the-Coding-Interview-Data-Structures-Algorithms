package section6;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

public class MainTwoSum {

//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSumMap(nums, target)));

    }


    public static int[] twoSum(int[] nums, int target) {

        int[] original = Arrays.copyOf(nums, nums.length);

        int low=0;
        int high=nums.length-1;

        while(nums[low]+nums[high]!=target){
            if(nums[low]+nums[high]>target){
                high--;
            }else {
                low++;
            }
        }

        int i = 0;
        while(original[i]!=nums[low]){
            i++;
        }

        int j = nums.length-1;
        while(original[j]!=nums[high]){
            j--;
        }

        return new int[]{i, j};
    }

    public static int[] twoSumMap(int[] nums, int target) {

        Map<Integer, Integer> calculation = new IdentityHashMap<>();

        for (int i=0; i<nums.length; i++){
            if(calculation.containsKey(target-nums[i])){
                return new int[]{calculation.get(target-nums[i]), i};
            }
            calculation.put(nums[i],i);
        }
        return new int[]{};
    }
}
