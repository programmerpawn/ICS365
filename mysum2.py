print("enter two numbers")
a = int(input()) 
b = int(input())
total = 0

for x in range(a,b):
    total +=x
print(f'{a} + ... + {b} = {total + (b)}')
