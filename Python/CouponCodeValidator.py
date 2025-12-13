# https://leetcode.com/problems/coupon-code-validator/?envType=daily-question&envId=2025-12-13

class Solution:
    def validateCoupons(self, c: List[str], b: List[str], a: List[bool]) -> List[str]:
        return [c for b,c,a in sorted(zip(b,c,a)) 
            if match('\w+$',c) and b in 'electronicsgrocerypharmacyrestaurant' and a]