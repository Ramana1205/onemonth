a = 642
res = ""

while a > 0:
    rem = a % 10
    res = str(rem * rem) + res
    a //= 10

print(res)