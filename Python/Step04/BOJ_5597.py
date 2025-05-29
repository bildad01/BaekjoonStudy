lis = []
for _ in range(28):
    n = int(input())
    lis.append(n)

for i in range(1, 31):
    if i not in lis:
        print(i)