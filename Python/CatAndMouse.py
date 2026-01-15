# https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=true

class solution:
    def catAndMouse(x, y, z):
        catAdiff = abs(z - x)
        catBdiff = abs(z - y)
        
        if(catAdiff < catBdiff):
            return "Cat A"
        elif(catBdiff < catAdiff):
            return "Cat B"
        else:
            return "Mouse C"
        
    if __name__ == "__main__":
        x = 1
        y = 2
        z = 3
        print(catAndMouse(x, y, z))
