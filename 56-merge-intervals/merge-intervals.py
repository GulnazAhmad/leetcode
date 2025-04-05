class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        i = 0
        #n = len(intervals)
        # while i < n - 1:
        #    ...
        #intervals.remove(...)  # or pop(...)
        #n -= 1

        #
        #
        while i < len(intervals) - 1:
            # If intervals overlap
            if intervals[i][1] >= intervals[i + 1][0]:
                intervals[i][1] = max(intervals[i][1], intervals[i + 1][1])
                intervals.pop(i + 1)  # Merge and remove next
            else:
                i += 1  # Only move forward if no merge

        return intervals
