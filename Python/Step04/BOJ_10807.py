a =int(input())
list = list(map(int, input().split()))
b = int(input())
cut = 0

for i in list:
    if b == i:
        cut +=1
print(cut)