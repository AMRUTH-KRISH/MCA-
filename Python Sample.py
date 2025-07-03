l=[5,4,6,2,8,2]
f=0
n=len(l)
for i in range(0,n):
    for j in range(0,n):
        if i!=j:
            if l[i]==l[j]:
                f=1
if f==1:
    print("not unique")
else:
    print("unique")