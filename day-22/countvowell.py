s="ramanaaaeio"
# print(s.count('a')+s.count('e')+s.count('i')+s.count('o')+s.count('u'))
print(sum(1 for ch in s if ch in "aeiou"))