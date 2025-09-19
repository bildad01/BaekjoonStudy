num = int(input())
for i in range(1,2*num):
    h = i if i <= num else 2 * num -i
    left = num - h
    star = 2 * h - 1
    print(' '* left + '*'* star)
