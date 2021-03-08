/*

  方法的返回值类型不是void的时候
      1、返回值类型不是void的时候，
	  要求方法必须百分百执行"return;值";这样的语句来完成值的返回。
      没有这个语句的时候，编译器报错。

	  2、一个方法有返回值的时候，当我们调用这个方法的时候，方法返回了一个值。
	  对于调用者来说，这个返回值可以选择接收，也可以选择不接收。
	  但是大部分情况下都是选择接收。

*/
public class MethodTest08
{
	public static void main(String[]args){
	    
		//调用 没有接收返回值
		num(10,3);

		//变量接收
		//赋值运算符的右边先执行，将结果赋值给左边。
		int i = num(10,3);
		System.out.println(i);

		System.out.println(num(10,3));
	      
	    
	}
	/*
	   需求：
	       定义一并实现一个方法，该方法可以计算两个int类型的商，
		   要求将最终的计算结果返回给调用者。

	*/
	public static int num(int a,int b){
	      // System.out.println("GGG");
	        return a / b;
			
	}
}