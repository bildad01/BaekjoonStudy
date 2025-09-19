S = input()
s = list(S)
s.reverse()
s = "".join(s)
if S == s:
    print(1)
else:
    print(0)