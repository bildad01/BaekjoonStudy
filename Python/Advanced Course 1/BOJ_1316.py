a = int(input())
cut = 0
for _ in range(a):
    word = input()
    s = set()
    prev = None
    cut +=1

    for i in word:
        if i != prev:
            if i in s:
                cut -= 1
                break
            s.add(i)
            prev = i
        
print(cut)