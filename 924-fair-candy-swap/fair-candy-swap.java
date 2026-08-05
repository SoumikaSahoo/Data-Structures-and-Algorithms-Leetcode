class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);

        int sumA = 0;
        int sumB = 0;

        for (int x : aliceSizes) sumA += x;
        for (int x : bobSizes) sumB += x;

        int diff = (sumB - sumA) / 2;

        int a = 0;
        int b = 0;

        while (a < aliceSizes.length && b < bobSizes.length) {

            int curr = bobSizes[b] - aliceSizes[a];

            if (curr == diff) {
                return new int[]{aliceSizes[a], bobSizes[b]};
            } else if (curr < diff) {
                b++;   // move Bob pointer
            } else {
                a++;   // move Alice pointer
            }
        }

        return new int[0];
    }
}