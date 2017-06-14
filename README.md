# euclid-algorithm

#concept
Finding the greatest common divisor through euclid's algorithm. This is accomplished by alternately subtracting the smaller number from the larger and subsequently repeating the steps for the new set of the former smaller and the result.

#execution
Take the two numbers a and b
Use absolute values if either is negative
while a and b are not equal
  if a > b reduce a by b
  if b > a ruduce b by a
when a and b are equal it is the greatest common divisor
