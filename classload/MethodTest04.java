/*

  方法的调用不一定在main方法当中，可以再其他方法当中。
  只要是程序可以执行到的位置，都可以去调用其他方法。

*/

public class MethodTest
{
	public static void sum(int a,int b){
                  
				System.out.println(a+"+"+b+"="+(a+b));
	          //调用do some方法
			 MethodTest04.dosome();
	}

	public static void main(String[]args){
       //调用sum方法
     MethodTest04.sum(1,2);
    
	 System.out.println("hello world")

	}
	public static void dosome(){
	
	    System.out.println("do some")
	
	}
}