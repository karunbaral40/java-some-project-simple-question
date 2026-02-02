import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + i + ":");
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        int[] result = sol.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("First index: " + result[0]);
            System.out.println("Second index: " + result[1]);
        } else {
            System.out.println("No pair found");
        }

        sc.close();
    }
}
