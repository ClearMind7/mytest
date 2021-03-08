/*
  该程序还是一个体验程序，体验overload的优点
     *程序员调用方法的时候，比较方便。虽然方法不同，但是感觉就像再用一个方法一样。
	 不需要记忆更多的方法名。

	 *代码美观

	 前提：功能相似的时候，方法名可以相同。

	 但是，功能不同的时候，尽可能让方法名不同。

  */

  public class OverloadTest02
  {
	  public static void main(String[]args){
	     
		 //调用方法的时候就像调用一个方法一样。
		 //参数的类型不同，对应调用的方法不同。
		 //此时区分不在依靠方法名，依靠的是参数的数据类型。
		 System.out.println(sum(1,2));
		 System.out.println(sum(1.0,2.0));
		 System.out.println(sum(1L,2L));
	  
	  }
     public static int sum(int a.int b){
	   return a + b;
	 }
	 public static int sum(long a.long b){
	   return a + b;
	 }
	 public static int sum(double a.double b){
	   return a + b;
	 }

  }