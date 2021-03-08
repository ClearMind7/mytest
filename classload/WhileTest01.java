/*

while循环语句
  1、while循环的语法结构：
        
		while(布尔表达式){
		   循环体
		}
  2、while循环的执行原理：
        
		先判断布尔表达式的结果
		  *ture
		    - 执行循环体
			  *判断布尔表达的结果 
			     *true
				   -执行循环体
				      *判断布尔表达式结果
					    ....
					    *false
						  -循环结束
		  *flase
		    - 循环结束
     
  3、whlie循环的循环次数：
        0~N次
		注意：while循环的循环体可能一次都不会执行。

*/
public class WhileTest01
{
	public static void main(String[]args){
	
	    //死循环
	/*	while(true){
		   
		   System.out.println("死循环");
		
		}
  //编译器检测到该程序无法都执行 所以编译报错，因为进入死循环 轮不到下边的代码。
  //System.out.println("hello world");
	*/
    
	 /*  int i = 10;
	   int j = 3;
	   while (i>j)
	  {
		   System.out.println("死循环");
	   }
    System.out.print("hello world"); 这里就可以编译通过 因为编译的时候不知道i>j是对是错
	*/
	       
	}
}