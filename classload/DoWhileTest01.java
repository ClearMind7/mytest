/*

   do...while
      1、do..while循环的语法结构:

	      do{
			  循环体;
		  }whlie(布尔表达式);

	  2、do..while循环的执行原理:
	      
	  3、do..while循环的执行次数：
	     do..while循环体代码片段之心个次数是：1~N次【至少一次】
	  4、使用do..while循环的注意事项：
	     do..while循环语句最终有一个分号。

*/

public class DoWhileTest01
{
	public static void main(String[]args){
                
				int i = 10;

				do{
					System.out.println(i);
				}while (i>100);

				while(i>100){

					System.out.println(i);
                      
				}
             
			 int k =1;
			 do{
				 System.out.println(k);
			     k++;
			 }while(k<=10);



	}
}