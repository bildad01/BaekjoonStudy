M = 0
pos = 0

for i in range(9):
    a = int(input())
    if a > M:
        M = a
        pos = i + 1

print(M)
print(pos)