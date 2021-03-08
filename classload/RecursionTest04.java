/*

先不使用递归计算N的阶乘
5的阶乘：
  5*4*3*2*1

*/

public class RecursionTest04
{
	public static void main(String[]args){
	
	       int n = 5;
		   int retvalue = method(n);
		   u.g(retvalue);
	
	}
	public static int method(int n){
/*	     
		 int result = 1;
	     for (int i =n;i>0 ;i-- )
	     {
               result *= i;
	     }
		 return result;
	
	}*/

	if (n==1)
	{
		return 1;
	}
	return n * method(n-1);
}