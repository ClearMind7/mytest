/*

     关于switch语句：
	   1、switch语句也属于选择结构，也是分支语句。
	   2、switch语句的语法结构：
	       一个比较完整的switch语句应该这样编写：
		    switch（int或String类型的字面值或变量）{
				case int或String类型的字面值或变量：
				   java 语句;
				   java 语句;
				   .....
				   break;	
		        case int或String类型的字面值或变量：
				   java 语句;
				   java 语句;
				   .....
				   break;	
			    case int或String类型的字面值或变量：
				   java 语句;
				   java 语句;
				   .....
				   break;	
				 ....
				 default;
				   java 语句;
				   .......
			}

		3、switch语句执行原理：
		   switch后面小括号当中的数据和case后面的数据进行一一匹配，匹配成功的分支执行。
		   按照自上而下的顺序依次匹配。
		 
		4、匹配成功的分支执行，分支当中的最后又break;语句的话，整个switch语句终止。

		5、匹配成功的分支执行，分支当中没有break语句的话，直接进入下一个分支执行（不进行匹配），
		这种现象称为case穿透现象。【提供break;语句可以避免穿透】

		6、所有分支都没有匹配成功，当有default语句的话，会执行default分支当中的程序。

		7、switch后面和case后面只能是int或String类型的数据，不能是其他类型。
		      *当然 byte，short，char也可以直接写到switch和case后面，因为他们可以进行自动类型转换。

			  *jdk6的，switch和case后面只能探测int类型

			  *jdk7之后包括7版本在内，引入新特性，switch关键字和case关键字后面可以探测int和String类型的数据。
              
	    8、case可以合并;
		    int i =10
			 switch(i){
			 case 1;case2;case3;case4;case5;
			     System.out.println("Test code!");
			 }
*/

public class SwitchTest01
{
	public static void main(String[]args){

     /*
		long x = 100L;
		switch(x)//编译报错
		*/

         long x = 100L;
		 switch((int)x){}

		String username = "zhangsan";
		switch(username){}

       /*
           较完整的switch语句
	   */

	   //接收用户的输入
	   //1表示周一
	   //2表示周二
	   //.....
		 
	   java.util.Scanner s = new java.util.Scanner(System.in);
	   System.out.print("请输入数字：");
	   int num =s.nextInt();
	   switch(num){
                case 1:
					System.out.print("星期一");
				    break;
				case 2:
					System.out.print("星期二");
				    break;
				case 3:
					System.out.print("星期三");
				    break;
				case 4:
					System.out.print("星期四");
				    break;
				case 5:
					System.out.print("星期五");
				    break;
				case 6:
					System.out.print("星期六");
				    break;
				case 7:
					System.out.print("星期日");
				    break;
				default:
				    System.out.print("对不起，您输入的数字非法");
	   }
	     //case合并
		 switch(num){
                case 1:case 0:
					System.out.print("星期一");
				    break;
				case 2:
					System.out.print("星期二");
				    break;
				case 3:
					System.out.print("星期三");
				    break;
				case 4:
					System.out.print("星期四");
				    break;
				case 5:
					System.out.print("星期五");
				    break;
				case 6:
					System.out.print("星期六");
				    break;
				case 7:
					System.out.print("星期日");
				    break;
				default:
				    System.out.print("对不起，您输入的数字非法");
	   }

	      
	
	}
}