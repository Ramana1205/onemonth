a="one two three"
s=a.split(" ")
res=""
for i in s:
    res+=i[::-1]+" "
res=res.strip()
print(res)
