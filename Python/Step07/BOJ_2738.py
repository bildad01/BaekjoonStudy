N,M = map(int, input().split())
a=[]

for _ in range(N*2):
    ad = list(map(int, input().split()))
    a.append(ad)

for i in range(N):
    d = [x+y for x,y in zip(a[i], a[N+i])]
    print(*d)
