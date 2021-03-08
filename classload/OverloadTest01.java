/*

  以下代码不使用方法重载机制，不使用overload，分析程序存在的缺点
     1、g、o、p、虽然功能不同。但是功能是相似的，都是求和。
	 以下方法当中功能相似的方法，分别起了三个不同的名字，对于程序员来说，
	 调用方法的时候不方便，程序员需要记忆更多的方法，才能完成调用。【不方便】

	 2、不美观

	 有这样一种机制：
	    功能虽然不同，但是功能相似的时候，有没有这样一种机制，可以让程序员使用
		这些方法的时候就像在使用同一个方法一样，这样程序员以后编写代码比较方便，
		也不需要记忆更多方法名，代码也更加美观

		这种机制就是 方法重载/overload

*/


public class overloadTest01
{
	public static void main(String[]args){

		//调用方法
		int k1 = g(1,2);
		System.out.println(k1);

		int k2 = o(1.0,2.0);
		System.out.println(k2);

		long k3 =p(1L,2L);
		System.out.println(k3);
	
	       
	}
	//定义一个方法 可以计算两个int类型的和
	public static int g(int a ,int b){
	
	   return a+b;
	
	}
	public static double o(double a,double b){
	  
	       return a+b;
	}
	public static long p(long a,long b){
	    return a+b;
	}
}

//最终希望达到的是：程序员使用上面三个相似的方法的时候，就想在使用一个方法一样。
//java支持这种机制【有些语言不支持，例如以后要学习的javascrpit】