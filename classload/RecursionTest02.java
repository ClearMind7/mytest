/*
  不使用递归，计算1~n的和
  */

  public class RecursionTest02
  {
	  public static void main(String[]args){
	      
		  /*int n = 4;
		  int sum = 0;
		  for (int i=1;i<=4 ;i++ )
		  {
			  sum+=i;
		  }
		  u.p("sum ="+sum);
	  }
	  */

	  //直接调用即可
	  int n = 4;
	  int retvalue = sum(n);
	  u.g(retvalue);

	  n = 10;
	  retvalue = sum(n);
	  u.g(retvalue);
	  }

	  //单独定义一个方法，这是一个独立的功能，可以完成1~n的和
	  public static int sum(int n){
		  int result =0;
		  for (int i=1;i<=n ;i++ )
		  {
			  result += i;
		  }
		  return result;
	  }
		 
}