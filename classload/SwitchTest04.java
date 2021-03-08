/*
 实现计算器当中的加减乘除求余数运算。


 实现思路：
   1、选择所有数据从键盘输入
   2、使用switch语句进行判断
   3、需要从控制台输入三次：
         *第一个数字
		 *运算符
		 *第二个数字

		 */
public class SwitchTest04
{
	public static void main(String[]args){
		System.out.println("欢迎使用简单计算器系统");
	 java.util.Scanner s = new java.util.Scanner(System.in);
	   System.out.print("请输入第一个数字");
	   int num = s.nextInt();
       System.out.print("请输入运算符");
	   String y = s.next();
	   System.out.print("请输入第二个数字");
	   int num2 = s.nextInt();

	  /* switch(y){
		   case "+":
			  System.out.print("结果为" + (num + num2));
		      break;
		   case "-":
			  System.out.print("结果为" + (num - num2));
		      break;
		   case "*":
			  System.out.print("结果为" + (num * num2));
		      break;
		   case "/":
			  System.out.print("结果为" + (num / num2));
		      break;
		   case "%":
			  System.out.print("结果为" + (num % num2));
		      break;
		   default:
			  System.out.print("您输入的运算符不合法" );
       */
	   int jg = 0;
       switch(y){
		   case "+":
			  jg = num + num2;
		      break; 
		   case "-":
			  jg = num - num2;
		      break;
		   case "*":
			  jg = num * num2;
		      break;
		   case "/":
			  jg = num / num2;;
		      break;
		   case "%":
			jg = num % num2;
		      break;
		   default:
			 System.out.print("您输入的运算符不合法" );
       
	      }
		  System.out.print("运算结果为" + num + y + num2 + "=" + jg );
	
	}
}
