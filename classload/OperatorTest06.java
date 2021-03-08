/*
     三元运算符/三目运算符/条件运算符
	     1、语法规则
		    布尔表达式？表达式1：表达式2

		 2、三元运算符的执行原理？
		     当布尔表达式的结果是true的时候，选择表达式1作为整个表达式的执行结果。
			 当布尔表达式的结果为false的时候，选择表达式2作为整个表达式的执行结果。

*/
public class OperatorTest06
{
	public static void main(String[]args){
        boolean sex = false;

		//分析以下程序可否编译通过
		//编译报错 因为它不是一个完整的java语句。
		//sex?'男'：'女';

		char c =sex ? '男':'女';
		System.out.println(c);

		sex = true;
        c = sex ? '男':'女';
		System.out.println(c);
         
		 //语法错误，编译报错，结果可能是String，也可能是char，但是前边不能用char来接收数据。
		 //编译错误，类型不兼容。
		//char c1 = sex?"男":'女';

		System.out.println(sex?'男':"女");
		//字符串类型String
	
	}
}