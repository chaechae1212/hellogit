strArr=["AAA","BBB","CCC","DDD"]
result=[]
for i in range(len(strArr)):
    if i%2==0:
        result.append(strArr[i].lower())
    else:
        result.append(strArr[i].upper())
print(result)

