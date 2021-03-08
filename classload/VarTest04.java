/*
  关于变量的分类：
  根据变量声明的位置来分类：
        *局部变量
		  - 在方法体当中声明的变量叫做局部变量

		 *成员变量
		  - 在方法体外【类体之内】声明的变量叫做成员变量

		  在不同的作用域当中 变量名是可以相同的。
		  同一个作用域当中，就不可以重名。
		  */

public class VarTest04
{
	//成员变量
	int k = 200;
	public static void main(String[] args){
	      //i变量就是局部变量
		  int i = 10;

		  //java遵循就近原则
		  System.out.println(i);
	
	}
	//属于成员变量
	int i = 100;
	//类体中不能直接编写java语句【除声明变量以外】
	//System.out.println（i）;

	//dosome方法
	public static void dosome（）{

		//局部变量
		int i = 90;

	}
}