# You are given an array A of length N. You take an array B of length N such that B[i] = 0 for each 1 <= i <= N. You can apply the following operation on B any number of times:

# Choose (N - 1) distinct indices and add 1 to each of those indices.

# Task:
# Find the number of operations required to convert array B into array A by applying the given operation. Print -1 if it is impossible to do so.


def solve(N, A):
    total_sum = sum(A)
    max_val = max(A)
    
    if(total_sum % (N - 1) != 0 or max_val > total_sum // (N - 1)):
        return -1
    else:
        return total_sum // (N - 1)
        pass
T = int(input())
for _ in range(T):
    N = int(input())
    A = list(map(int, input().split()))

    out_ = solve(N, A)
    print (out_)