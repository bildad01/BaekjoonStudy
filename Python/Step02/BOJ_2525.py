# 오븐 시계
h,m = map(int, input().split())
a = int(input())

h += a // 60
m += a % 60

if m >= 60:
    h += 1
    m -= 60
if h >= 24:
    h -= 24
print(h,m)


# 다른 방법:
#m += a
#
# if (m//60) == 0:
#     print(h, m)
# elif 0 < (m//60):
#     h += m//60
#     if 24 <= h:
#         h -= 24
#         print(h,m%60)
#     else:
#         print(h,(m%60))

