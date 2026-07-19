public class MultipleMissingNumbers {

    public static void multiplenums(int[] nums, int k) {

        int n = nums.length + k;

        int[] hash = new int[n + 1];

        for(int i = 0; i < nums.length; i++) {
            hash[nums[i]] = 1;
        }

        for(int i = 1; i <= n; i++) {
            if(hash[i] == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,6};

        System.out.print("The missing numbers are: ");

        multiplenums(nums, 2);
    }
}