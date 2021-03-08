/*

 深入return语句
    *带有return关键字的java语句只要执行，所在的方法执行结束。
	*在同一个作用域当中，return语句下边不能编写任何代码，因为
	这些代码永远的都执行不到，所以编译报错。

*/
public class MethodTest09
{
	public static void main(String[]args){

    int k = m();
	System.out.println(k);

	//调用方法 必须带括号
	System.out.println(m());


	}
	//编译报错：缺少返回语句，以下程序编译器人为无法百分百保证"return 1"会执行。
	/*
	public static int m(){

	     int a = 10;
		 if(a>3){
            return 1;
		 }
	
	}
	*/
	//以下程序可以保证return 1或return 0执行，编译通过
/*	public static int m(){

	     int a = 10;
		 if(a>3){
            return 1;
		 }else{
		   return 0 ;
		 }
	
	}*/

	//可以不加else 和以上方法完全相同
	//不加else 也一定会执行下边的return

	public static int m(){

	     int a = 10;
		 if(a>3){
            return 1;
			//System.out.println();
			//这句话一定执行不到 所以编译错误
		 }{
           System.out.println();//这里就可以 因为这句话有可能执行。
		   return 0;
		 }
	
	}

	public static int k(){
	   //实际作用和M方法一样
	   return 10>3 ? 1 : 0;
	}

}