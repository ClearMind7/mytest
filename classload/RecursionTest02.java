/*
  ��ʹ�õݹ飬����1~n�ĺ�
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

	  //ֱ�ӵ��ü���
	  int n = 4;
	  int retvalue = sum(n);
	  u.g(retvalue);

	  n = 10;
	  retvalue = sum(n);
	  u.g(retvalue);
	  }

	  //��������һ������������һ�������Ĺ��ܣ��������1~n�ĺ�
	  public static int sum(int n){
		  int result =0;
		  for (int i=1;i<=n ;i++ )
		  {
			  result += i;
		  }
		  return result;
	  }
		 
}