import java.util.Scanner;

public class MissingNumber {
    public static int missingNumber(int[] nums, int n){
        for (int i=0; i<n-1; i++){
            int temp = Math.abs(nums[i]);
            if (temp<n) nums[temp-1] = -nums[temp-1];
        }

        for (int i=0; i<n-1; i++){
            if (nums[i]>0) return i+1;
        }
        
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n-1];
        for (int i=0; i<n-1; i++){
            nums[i] = sc.nextInt();
        }
        
        int res = missingNumber(nums, n);

        System.out.println(res);
        
        sc.close();
    }
}
