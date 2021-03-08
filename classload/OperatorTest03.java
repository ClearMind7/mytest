/*
    逻辑运算符：
	   &       逻辑与【并且】（两边算子都是true，结果才是true）
	   |       逻辑或【或者】（两边的算子只要有一个true，结果就是true）
	   !       逻辑非（取反，！false就是true，！true就是false，这是一个单目运算符。）
	   ^       逻辑异或 （两边的算子只要不一样，结果就是true）

	   &&      短路与  
	   ||      短路或

	 1、逻辑运算符要求两边的算子都是布尔类型，并且逻辑运算符最终的运算结果也是一个布尔类型。
     2、短路与和逻辑与最终运算结果相同，只不过短路与存在短路现象。
	 3、短路或和逻辑或最终运算结果相同，只不过短路或存在短路现象。
	 4、什么情况下发生短路现象呢？
	 5、什么时候选择使用逻辑与运算符？什么时候选择使用短路与运算符？

	   */
	 public class OperatorTest03
{
	public static void main(String[]args){

	    System.out.println(5>3&5>2);//true
		System.out.println(5>3&5>6);//false
		System.out.println(5>3|5>6);//true

		System.out.println(!false);//true
		System.out.println(!true);//false

		System.out.println(true^false);//true
		System.out.println(false^false);//false
	    System.out.println(true^true);//false

		//逻辑与和短路与
		//int x = 10；
		//int y = 12；
		//逻辑与
		//System.out.println（x<y && ++x<y）;
	    //System.out.println（x)
	
		//逻辑与和短路与
		int x = 10;
		int y = 8;
		//逻辑与
		System.out.println(x<y && ++x<y);
	    System.out.println(x);
	}
}