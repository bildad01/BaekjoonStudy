matrix = []
for _ in range(5):
    a = list(input().rstrip())
    matrix.append(a)

l = []
M = len(max(matrix, key=len))

for col in range(M):
    for row in range(5):
        if col >= len(matrix[row]):
            continue
        l.append(matrix[row][col])
print(l)
print(''.join(l))
