/*
      方法调用
	     1、方法的修饰符列表中有static关键字，完整的调用方法是：类名.方法名(实参列表);
		 2、但是，有时候"类名."可以省略，什么时候下可以省略呢？
		 方法名在当前类中可以省略当前类名，如果调用其他类的方法就不可以。

		 3、建议再赢java源文件当中只定义一个class，这个程序只是为了讲课方便。
		 这种方式不要模仿。
*/ 

public class MethodTest06
{
	public static void main(String[]args)
	{

     //调用方法
	 MethodTest06.m();

	 //对于方法的修饰列表中有static关键字的"类名"可以不写吗。
     m();  

	 //调用其他类【不是本类】中的方法
	 A.k();

	 //调用其他类的方法的时候 必须加上类名 当前类就可以省略



	}
	public static void m(){
	 
	  System.out.println("m method execut!");
	  m2();
	  //调用其他类的
	  A.k2();
	}
	public static void m2(){
	 
	  System.out.println("m2 method execut!");
	}
}

class A
{
		public static void k(){
	 
	  System.out.print("k method execut!");
	}
	public static void k2(){
	 
	  System.out.print("k2 method execut!");
	}
}