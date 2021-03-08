/*
     
	 循环语句和条件判断语句嵌套使用【for和if的嵌套】

*/
public class ForTest
{
	public static void main(String[]args){
	   
	   //找出1~100所有的奇数
	   //第一种：从1开始每次递增2，这样每一个数字一定是奇数。
	     for (int i =1;i<=100 ;i+=2 )
	     {
			 System.out.println("奇数"---> + i);
	     }
	   //第二种：从1开始，以1递增，每个数据都进行判断。判断标准是对该数字对2求余数
	      for (int i =1;i<=100 ;i+=1 )
		//System.out.println("奇数"---> + i);
		//判断i是否是奇数，是奇数的时候输出。
	     {    //i%2 == 0
			 //I%2==1//奇数
			 //i%2！=0//奇数

			 if(i % 2 ！= 0){
			 System.out.println("奇数"---> + i);
			 }

	     }
		 //以上两种方案 优先第一种：代码少 循环次数少，效率高。
	}
}