int maxSubArray(int* nums, int numsSize) {
    int currentSum = nums[0];
    int maxSum = nums[0];

    for (int i = 1; i < numsSize; i++) {
        // Either extend or start new subarray
        if (currentSum + nums[i] > nums[i]) {
            currentSum = currentSum + nums[i];
        } else {
            currentSum = nums[i];
        }

        // Update maximum
        if (currentSum > maxSum) {
            maxSum = currentSum;
        }
    }

    return maxSum;
}