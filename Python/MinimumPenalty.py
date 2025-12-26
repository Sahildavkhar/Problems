# https://leetcode.com/problems/minimum-penalty-for-a-shop/description/?envType=daily-question&envId=2025-12-26

class solution:
    def bestClosingTime(self, customers: str) -> int:
        minPenalty = 0
        curPenalty = 0
        earliestHour = 0

        for i in range(len(customers)):
            ch = customers[i]

            if ch == "Y":
                curPenalty -= 1
            else:
                curPenalty += 1
            
            if curPenalty < minPenalty:
                earliestHour = i + 1
                minPenalty = curPenalty

        return earliestHour
    
if __name__ == "__main__":
    customers = "YYNY"
    sol = solution()
    result = sol.bestClosingTime(customers)
    print("Best Closing Time:", result)