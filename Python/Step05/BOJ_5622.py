word = input()
time = 0

for T in word:
    if T in 'ABC' : time += 3
    elif T in 'DEF' : time += 4
    elif T in 'GHI' : time += 5
    elif T in 'JKL' : time +=6
    elif T in 'MNO' : time +=7
    elif T in 'PQRS' : time +=8
    elif T in 'TUV' : time +=9  
    elif T in 'WXYZ' : time +=10


print(time)