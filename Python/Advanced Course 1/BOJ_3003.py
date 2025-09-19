K = list(map(int, input().split())) 
S = [1,1,2,2,2,8]
N = []

for i in range(0,6):
    if S[i] - K[i] == 0:
        N.append(0)
    else:
        N.append(S[i] - K[i])

for j in N:
    print(j, end=' ')