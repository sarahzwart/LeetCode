# This is a test to see of git works now
class Solution:
    def winnerOfGame(colors: str) -> bool:
        n =len(colors)
        aCount = 0
        bCount = 0
        if n  < 3:
            return False
        for i in range(1,n-1):
            if colors[i]==colors[i-1]==colors[i+1]:
                if colors[i]=='A':
                    aCount+=1
                else:
                    bCount+=1
        if aCount > bCount:
            return True
        return False

    print(winnerOfGame(colors = "AAABABB"))