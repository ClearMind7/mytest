/*
   在前一个程序的基础之上 计算1~100所有奇数的和

   运算符 += 就是专门完成追加的。
*/

public class ForTest05
{
	public static void main(String[]args){
	      int sum = 0;  

	   /*  for(int i =1;i<=100;i+=2){
		     
			 System.out.println(i);

			 //定义一个变量【盒子】，初始值为0
			
			 //sum = 0;//不能放到这里
			 //这里是循环体 每次都会执行sum = 0;
			 sum += i;
			 //System.out.println("sum" + sum);放入这里输出 有不同的结果
			 //即每次循环一次输出一次 即0+1=1 1+3=4....一步一步输出
			 //循环体外就是输出最终结果
		 
		 
		 }*/
		// System.out.println("sum" + sum);
	      
		  for (int i=1;i<=100;i++)
		  {
			  if (i % 2 !=0)
			  {
				  sum+=i;
			  }
		  }
	System.out.println("sum" + sum);
	}
	
}
    