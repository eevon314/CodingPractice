// import the list so the program can use it
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { 
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n + 1; j++){
                if (nums[i] + nums[j] == target);
                return new int[]{i,j};
            }
        }
        
    }
}
}