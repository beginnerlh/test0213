/*
 * ����һ�� ��������������ͳ������������������������֮����ȣ����ǳ���Ϊ������������

����һ�� ������ n�� ������������������� True�����򷵻� False

 

ʾ����

����: 28
���: True
����: 28 = 1 + 2 + 4 + 7 + 14
*/
package lianxi0213;

import java.util.Scanner;

public class test0213 {
	public static void main(String[] args) {
		System.out.print("������һ����:");
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