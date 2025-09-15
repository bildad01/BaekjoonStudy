i, j = input().split()
i = int(str(i)[::-1])
j = int(str(j)[::-1])
if i<j:
    print(j)
else:
    print(i)