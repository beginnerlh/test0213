/*
 * 对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。

给定一个 正整数 n， 如果他是完美数，返回 True，否则返回 False

 

示例：

输入: 28
输出: True
解释: 28 = 1 + 2 + 4 + 7 + 14
*/
package lianxi0213;

import java.util.Scanner;

public class test0213 {
	public static void main(String[] args) {
		System.out.print("请输入一个数:");
		Scanner Sc=new Scanner(System.in);
		int num = Sc.nextInt();
		Solution S = new Solution();
		Boolean a = S.checkPerfectNumber(num);
		System.out.println(a);

		}
}
class Solution {
    public boolean checkPerfectNumber(int num) {
        int a=1;
        if(num == 1)
        	a-=1;
        for(int i = 2; i<=(int)Math.sqrt(num);i++)
        {
            if(num % i==0)
            {
                a+=i+(num/i);
            }
        }
        if(a==num)
        {
            return true;
        }
        return false;
        
    }
}