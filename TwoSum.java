import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};  // input array
        int target = 9;               // target sum

        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // what number do we need to reach target?

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };  // if found, return the indices
            }

            map.put(nums[i], i);  // store current number and its index
        }

        throw new IllegalArgumentException("No two numbers found");
    }
}
