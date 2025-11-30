public class MinBouquet {

    public static boolean isPossible(int[] nums, int m, int k, int day) {
        int bouquet = 0;
        int count = 0;

        for (int bloom : nums) {
            if (bloom <= day) {
                count++;
                if (count == k) {
                    bouquet++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return bouquet >= m;
    }

    public static int roseGarden(int[] nums, int k, int m) {
        long req = (long) m * k;
        if (req > nums.length) return -1;

        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        for (int bloom : nums) {
            minDay = Math.min(minDay, bloom);
            maxDay = Math.max(maxDay, bloom);
        }

        int low = minDay, high = maxDay, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(nums,m,k,mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2;
        int k = 3;
        int result = roseGarden(nums, k, m);

        if (result == -1) {
            System.out.println("No bouquets...");
        } else {
            System.out.println(result);
        }
    }
}
