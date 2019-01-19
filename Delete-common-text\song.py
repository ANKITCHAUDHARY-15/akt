#..................................delete common text/songs... between two files...............................................


folder1=r"A:\python\folder1"
folder1songs=os.listdir(folder1)
folder2=r"A:\python\folder2"
#print(os.listdir(folder2))
folder2songs=os.listdir(folder2)
print("common file between folder1 and folder2 : ")
for song in folder1songs:
    if song in folder2songs:
        commonsong=os.path.join(folder1,song)
       # print(commonsong)
        os.remove(commonsong)
        print(song)

