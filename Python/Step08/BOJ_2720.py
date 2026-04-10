import sys

T = int(sys.stdin.readline())

for _ in range(T):
    money = int(sys.stdin.readline())
    
    for coin in [25, 10, 5, 1]:
        print(money // coin, end=' ')
        money %= coin
        
    print()