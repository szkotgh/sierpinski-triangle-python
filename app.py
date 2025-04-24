from itertools import combinations, permutations

input_num = int(input())

pascal = []
for i in range(input_num):
    line = []
    
    for j in range(i+1):
        if j == 0 or i == j:
            line.append(1)
            continue
        
        line.append(len(list(combinations(range(i), j))))
    pascal.append(line)
print(pascal)
    
sierpinski = []
for line in pascal:
    s_line = []
    for el in line:
        s_line.append(el%2)
    sierpinski.append(s_line)
print(sierpinski)


s_len = len(sierpinski)
for index, s_line in enumerate(sierpinski):
    print(" "*(int((s_len-index)/2)), end="")
    
    for i in s_line:
        print("#" if i==1 else " ", end="")
    
    print()