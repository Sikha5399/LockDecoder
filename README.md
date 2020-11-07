# LockDecoder
The digital lock is encoded in numeric form. To decode the lock there are two methods.
If the lock is encoded by an amstrong number, then the decoding number is the sum of the evn digits of the encoded number.
if the encoded number is not an amstrong number, then the decoding number is the sum of the odd digits of the encoded number.
Write an algorithm to decode the digital locker.

Input:
The input is a long integer-encodedLock representing the numeric value of the encoded digital lock.

Output:
print the integer representing the decoding number for the encoded digital lock.


Example1:
I/P- 407
Explanation- (4^3)+(0^3)+(7^3) = 64+0+343 = 407
              Sum of even digits = 4+0 = 4
O/P- 4

Example2:
I/P- 1541
Explanation- (1^4)+(5^4)+(4^4)+(1^4) = 1+625+256+1 = 883
              Sum of odd digits = 1+5+1 = 7
O/P- 7
