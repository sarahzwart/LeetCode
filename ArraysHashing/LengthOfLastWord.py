class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        split = s.split(" ")
        n = len(split)
        print(split)
        for i in range(n-1, -1, -1):
            if(split[i] != ''):
                return (len(split[i]))
            
instance = Solution()
print(instance.lengthOfLastWord("   fly me   to   the moon  "))