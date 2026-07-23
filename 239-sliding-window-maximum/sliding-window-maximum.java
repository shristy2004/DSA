import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        // Stores indices, not values
        Deque<Integer> dq = new ArrayDeque<>();

        int j = 0;

        for (int i = 0; i < n; i++) {

            // 1. Remove indices that are outside the window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // 2. Remove smaller elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            // 3. Add current index
            dq.offerLast(i);

            // 4. Once first window is formed, store maximum
            if (i >= k - 1) {
                ans[j++] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}