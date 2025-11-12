a = input()
li = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
c = 0

for i in li:
    a = a.replace(i,'*')
print(len(a))