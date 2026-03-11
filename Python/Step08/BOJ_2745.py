N, B = input().split()
B = int(B)
result = 0

for i in N:
    if '0' <= i <= '9':
        value = int(i)
    else:
        value = ord(i) - ord('A') + 10
    result = result * B +value
print(result)

"""
# 한번에 풀 수 있는 코드
N, B = input().split()
print(int(N, int(B)))

"""