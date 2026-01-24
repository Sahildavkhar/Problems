# https://www.hackerrank.com/challenges/electronics-shop/problem?isFullScreen=true

class ElectronicsShop:
    def getMoneySpent(self, keyboards, drives, b):
        max_spent = -1
        for keyboard_price in keyboards:
            for drive_price in drives:
                total_price = keyboard_price + drive_price
                if total_price <= b and total_price > max_spent:
                    max_spent = total_price
        return max_spent

if __name__ == "__main__":
    shop = ElectronicsShop()
    keyboards = [40, 50, 60]
    drives = [5, 8, 12]
    b = 60
    result = shop.getMoneySpent(keyboards, drives, b)
    print(f"Maximum money spent: {result}")