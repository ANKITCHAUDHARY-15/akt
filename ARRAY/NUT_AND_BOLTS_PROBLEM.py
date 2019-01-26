#code
t=int(input())
while(t>0):
    n=int(input())
    nut=input().split(" ")
    #print(nut)
    dic={'!':0,'#':0,'$':0,'%':0,'&':0,'*':0,'@':0,'^':0,'~':0,'':0}
    l=['!','#','$','%','&','*','@','^','~']
    bolt=input().split(" ")
    for i in nut:
        dic[i]+=1
    for i in bolt:
        dic[i]+=1
    for i in l:
        if(dic[i]>1):
            print(i,end=' ')
    print()
    for i in l:
        if(dic[i]>1):
            print(i,end=' ')
    print()
    t-=1
