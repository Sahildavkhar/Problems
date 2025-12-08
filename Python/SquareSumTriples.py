# Count the number of square sum triples (a, b, c) such that a^2 + b^2 = c^2 and 1 <= a, b, c <= n
# A square sum triple consists of three integers (a, b, c) where the sum of the squares of a and b equals the square of c.
# This program counts all such triples for a given n.
# For example, for n = 5, the valid triples are (3, 4, 5) and (4, 3, 5).
# The method countTriples calculates the number of such triples.

class SquareSumTriples:
    def countTriples(self, n: int) -> int:
        squares = {i * i for i in range(1, n + 1)}

        count = 0

        for a in range(1, n + 1):
            for b in range(1, n + 1):
                if a * a + b * b in squares:
                    count += 1

        return count
    
if __name__ == "__main__":
    sst = SquareSumTriples()
    n = 5
    result = sst.countTriples(n)
    print(f"Count of square sum triples for n = {n}: {result}")