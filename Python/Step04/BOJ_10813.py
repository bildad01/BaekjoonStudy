n,m = map(int, input().split())
lis=[]
for i in range(1,n+1):
  lis.append(i)
for _ in range(m):
  i,j = map(int, input().split())
  lis[i-1], lis[j-1] = lis[j-1], lis[i-1] 
print(*lis)