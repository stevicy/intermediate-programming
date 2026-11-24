import array

#1. array.typecode
array_num0 = array.array('i', [14, 5, 7, 8, 2])
print(array_num0.typecode)
print()

#looping the array.typecode
n = 12
for y3 in range(int(n)):
    array_num0 = (array_num0,)
    print(array_num0)
    
print()

#2.array.itemsize
array_num0 = array.array('i', [14, 5, 7, 8, 2])
size = array_num0.itemsize

print("Item size (in bytes):", size)

if size == 4:
    print("Each item in the array uses 4 bytes.")
elif size == 2:
    print("Each item uses 2 bytes.")
elif size == 8:
    print("Each item uses 8 bytes.")
else:
    print("Unknown item size:", size)
    
print()

#3. array.append(x)
print("Original array:", array_num0)
array_num0 = array.array('i', [14, 5, 7, 8, 2])
array_num0.append(111)
print("After append: ", array_num0)

print()

#Using while loop in array append
array_num0 = array.array('i', [14, 5, 7, 8, 2])
print("Original array:", array_num0)
new_value = 111

while len(array_num0) < 10:
    array_num0.append(new_value)
    new_value += 1  

print("After appending with while loop:", array_num0)

print()

#4.array.extend(iterable)
array_num = array.array('u', ['A','R', 'R', 'A', 'Y', ' ', 'K', 'O', ' ',])
print("Original array: "+str(array_num))
array_num.extend(array_num)
print("Extended array: "+str(array_num))

print()

n1 = 0 
while n1 < len(array_num):
    print(array_num)
    if n1 == 5:
        break
    n1 += 1
    
print()

#4.array.index
nums = array.array("i", [5, 2, 15, 12, 25])
print("Index of 2:", nums.index(2))
print("Index of 5:", nums.index(5))
print("Index of 25:", nums.index(25))
print()

#5. array.insert
nums1 = array.array('u', ['A', 'R', 'R', 'A', 'Y'])
print("Original array: ", nums1)

nums1.insert(5, ' ')
nums1.insert(6, 'K')
nums1.insert(7, 'O')
nums1.insert(8, ' ')
nums1.insert(9, 'P')
nums1.insert(10, 'O')
nums1.insert(11, '!')

print("After insert:", nums1)

print()

#6. array.pop
array_num1 = array.array('i', [2,5,7,9,12,15,17])
print("Original array: ", array_num1)
print("After popping [5]: ", array_num1.pop(5), "<-My second favorite number, incase you want to know.")
print("After popping [1]: ", array_num1.pop(1), "<-My first favorite number, incase you want to know.")

print()

#7.array.remove
array_num2 = array.array('i', [3,2,1,5,6])
print("Original array: ", array_num2)
print("After remove [6]: ", array_num2.remove(6))
print("New array, After removing [6]: ", array_num2)

print()

#8.array.reverse()
array_num3 = array.array('i', [7,6,5,4,3,2,1])
print("Original array: ", array_num3)
array_num3.reverse()
print("Reverse array: ", array_num3)

print()

array_message = array.array('u', ['A', 'R', 'R', 'A', 'Y'])

y5 = 0
while y5 < array_message.itemsize:
    print("PYTHON ARRAY DONE, ITS NOT EASY BUT I DID IT THOUGH.")
    if y5 == 2:
        break
    y5 += 1