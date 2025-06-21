n = int(input())  # n == 3×2^k

# Generate Pascal's Triangle
pascals_triangle = []
triangle_rows = n // 3
for i in range(triangle_rows):
    row = [1] * (i + 1)
    for j in range(1, i):
        row[j] = pascals_triangle[i - 1][j - 1] + pascals_triangle[i - 1][j]
    pascals_triangle.append(row)

# Generate Sierpinski Triangle
s_triangle = []
for i in range(triangle_rows):
    row = []
    for j in range(i + 1):
        row.append(pascals_triangle[i][j] % 2)
    s_triangle.append(row)

# Print Sierpinski Triangle
for i in range(triangle_rows):
    for sub_row in range(3):
        front_spaces = ' ' * (n - 3 * i - sub_row - 1)
        line = front_spaces
        
        for j in range(i + 1):
            # Fill Triangle
            if s_triangle[i][j] == 1:
                if sub_row == 0:
                    pattern = '*'
                elif sub_row == 1:
                    pattern = '* *'
                else:
                    pattern = '*****'
            # Empty Triangle
            else:
                if sub_row == 0:
                    pattern = ' '
                elif sub_row == 1:
                    pattern = '   '
                else:
                    pattern = '     '
            
            line += pattern
            
            # Add space between triangles
            if j < i:
                if sub_row == 0:
                    line += '     '
                elif sub_row == 1:
                    line += '   '
                else:
                    line += ' '
        
        print(line)