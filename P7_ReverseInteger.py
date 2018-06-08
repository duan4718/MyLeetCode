"""Given a 32-bit signed integer, reverse digits of an integer.
Example 1:
    Input: 123
    Output: 321

Example 2:
    Input: -123
    Output: -321

Example 3:
    Input: 120
    Output: 21
Note:
  Assume we are dealing with an environment which could only store integers
within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose of
this problem, assume that your function returns 0 when the reversed integer overflows.

rate:easy
"""


class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x==0:
            return 0
        sign=x/abs(x)    #求x的符号
        x=abs(x)         #取绝对值
        x=str(x)         #将整数转换成字符串
        x=x[::-1]        #将字符串逆置
        x=int(x)         #把字符串转换成整数
        x=int(sign*x)    #加上符号
        if x<-2**31 or x>2**31-1:  #溢出
            return 0
        else:
            return x
        
        
