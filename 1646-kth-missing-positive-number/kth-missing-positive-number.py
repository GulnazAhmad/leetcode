class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        missing = []
        current = 1
        index = 0

        while len(missing) < k:
            if index < len(arr) and arr[index] == current:
                index += 1  # current number exists in array, skip it
            else:
                missing.append(current)  # number is missing
            current += 1

        return missing[-1]
