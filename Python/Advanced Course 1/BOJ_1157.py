a = input().upper()
s = {}

for i in a:
    if i in s:
        s[i] += 1
    else:
        s[i] = 1
m = max(s.values())

M = [k for k, v in s.items() if v == m]


if len(M) > 1:
    print("?")
else:
    print(M[0])