/*
 使用递归计算1~n的和
 */

 public class RecursionTest03
{
	public static void main(String[]args){

	     //1~4的和
		 int n =4;
		 int retvalue =sum(n);
		 u.g(retvalue);

		 sum(10);
		 u.g(sum(10));
	
	
	}
	public static int sum(int n){
  
     //4+3+2+1
	 
	  if (n == 1)
	  {
		  return 1;
	  }
	  return n + sum(n-1);
	
	}
      
 }