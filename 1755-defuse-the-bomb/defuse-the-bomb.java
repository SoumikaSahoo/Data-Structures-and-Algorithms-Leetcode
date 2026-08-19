class Solution {
    public int[] decrypt(int[] code, int k) {
       
        int n = code.length;
        int[] ans = new int[n];

        if (k == 0) {
            return ans;
        }

        if (k > 0) {
            int sum = 0;

            // First window: next k elements
            for (int i = 1; i <= k; i++) {
                sum += code[i % n];
            }

            for (int i = 0; i < n; i++) {
                ans[i] = sum;

                // Remove the old element
                sum -= code[(i + 1) % n];

                // Add the new element
                sum += code[(i + k + 1) % n];
            }

        } else {
            k = -k; // make k positive

            int sum = 0;

            // First window: previous k elements
            for (int i = n - k; i < n; i++) {
                sum += code[i];
            }

            for (int i = 0; i < n; i++) {
                ans[i] = sum;

                // Remove the oldest element
                sum -= code[(i - k + n) % n];

                // Add current element
                sum += code[i];
            }
        }

        return ans;
    }
}