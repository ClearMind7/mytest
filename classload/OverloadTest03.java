/*
  方法重载：
     1、方法重载又被称为：overload
	 2、什么时候考虑使用方法重载？
          *功能相似的时候，尽可能让方法名相同。
		  但是，功能不同的时候，尽可能让方法名不同


	 3、什么条件满足之后构成了方法重载？
	     *在同一个类当中
		 *方法名相同
		 *参数列表不同
		    - 数量不同
			- 顺序不同
			- 类型不同
	 4、方法重载和什么有关系，和什么没有关系？
	    *方法重载和方法名和参数列表有关系
		*方法名和返回值类型无关
		*方法重载和修饰符列表无关
*/
public class OverloadTest03
{
	public static void main(String[]args){
	
	     
	}
	//构成重载
	public static void m1(){}
	public static void m1(int a){}

     //构成重载
	public static void m2(int a double b){}
	public static void m2(double a int b){}

      //构成重载
	public static void m3(int x){}
	public static void m3(double y){}

	 //编译错误 以下不是方法重载 是方法重复
	/* public static void m4(int x int y){}
	 public static void m4(int y int x){}
   */
 
   //编译错误 
   /*public static void x(){}
   public static int x(){  retrun 1;}
   */
/*
void y(){}
public static  void y(){} 也不行
 
   }