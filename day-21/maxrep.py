num = 122114444
temp = num

max_digit = 0

while temp > 0:
    rem = temp % 10
    if rem > max_digit:
        max_digit = rem
    temp //= 10

li = [0 for i in range(max_digit + 1)]

n = str(num)

for i in n:
    li[int(i)] += 1

max_freq = 0

for freq in n:
    if(li[int(freq)]>max_freq):
        max_freq=int(freq)

print(max_freq)