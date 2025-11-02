import java.util.Scanner;

public class IncreasingArray {
    public static long minMovesToMakeIncreasing(int[] nums){
        long moves = 0;
        for (int i=1; i<nums.length; i++){
            if (nums[i]<nums[i-1]){
                int diff = nums[i-1]-nums[i];
                moves += diff;
                nums[i] += diff;
            }
        }
        return moves;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        
        long res = minMovesToMakeIncreasing(nums);
        System.out.println(res);

        sc.close();
    }
}
