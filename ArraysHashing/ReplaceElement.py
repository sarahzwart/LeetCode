from typing import List
class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        n = len(arr)
        maxright = -1
        for i in range(n-1, -1, -1):
            curr = arr[i]
            arr[i] = maxright
            maxright = max(maxright,curr)
        return arr  
instance = Solution()
print(instance.replaceElements([17,18,5,4,6,1]))