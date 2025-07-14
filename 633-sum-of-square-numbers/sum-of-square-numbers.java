class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            long bSquared = c - a * a;
            if (binarySearch(0, bSquared, bSquared)) {
                return true;
            }
        }
        return false;
    }

    private boolean binarySearch(long low, long high, long target) {
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long midSq = mid * mid;

            if (midSq == target) return true;
            else if (midSq < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}
