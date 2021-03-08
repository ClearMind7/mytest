/*
       关于java中的赋值类运算符：
	     赋值类运算符包括两种：
		    * 基本的赋值运算符
			   =
			* 扩展的赋值运算符
			+=
			-+
			*-
			/=
			%=

	1、赋值类的运算符优先级：先执行等号右边的表达式，将执行结果赋值给左边的变量。
    2、注意一下代码
	    byte i =10;
		i += 5; 等同于：i=（byte）（i+5）;

		int k = 10;
		k+=5; 等同于:(int)(l+5)
		
		long x =10l;
		int y = 20;
		y += x; 等同于y = (int)(y+x);

		3、重要结论：扩展类的赋值运算符，不改变运算结果类型。假设最初这个变量的
		类型是byte类型，无论怎么进行追加或追减，最终该变量的数据类型还是byte类型。
*/

public class OperatorTest04
{
	public static void main(String[]args){

		//基本的赋值运算符
		int i = 10;
		System.out.println(i);//10

		i= i + 5;

		System.out.println(i);//15
          
		  //扩展的赋值运算符【+=运算符可以翻译为“追加/累加”】
		i += 5;//等同于i = i + 5
	
	    System.out.println(i);//20

		i -= 5;//等同于i = i -5;
		System.out.println(i);//15

		i *= 2;//i = i*2
		System.out.println(i);//30

		i /= 4; //i =i/4
		System.out.println(i);//7

		i %= 2;//i= i%2
		System.out.println(i);//1

		//------------------------------
        //10没有超出取值范围，可以直接赋值。
		byte b = 10;
		//无法赋值。
		//b = b +5;
    
	   //纠正错误
	   b = (byte)(b+5);
	   System.out.println(b);

	   byte x =10;
	   //可以赋值
	   x += 5;//等同于：x =（byte）（ x + 5）; 不等同于 x = x +5
	   System.out.println(x);
	   x += 113;
	   System.out.println(x);//-128【损失精度】
            
	}
}