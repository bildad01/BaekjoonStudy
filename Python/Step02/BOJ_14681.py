# 사분면 고르기

a = int(input())
b = int(input())

if 0 < a and 0 < b:
    print(1)
elif 0 < a and b < 0:
    print(4)
elif a < 0 and 0 < b:
    print(2)
else:
    print(3)


# 다른 방법: 
# if 0 < a:
#     if 0 < b:
#         print(1)
#     elif b < 0:
#         print(4)
# elif a < 0:
#     if 0 < b:
#         print(2)
#     elif b < 0:
#         print(3)
