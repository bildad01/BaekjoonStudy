N = int(input())
score = list(map(int, input().split()))
M = max(score)
num = 0
for i in score:
    i = i/M*100
    num += i
print(num/N)