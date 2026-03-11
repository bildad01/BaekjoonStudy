N, B = map(int, input().split())
result = []

while N > 0:
    remainder = N%B
    if remainder <10:
        result.append(str(remainder))
    else:
        result.append(chr(remainder -10+ord('A')))
    N //= B
print(''.join(result[::-1]))
