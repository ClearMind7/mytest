/*

    关于八种基本数据类的默认值
	数据类型                 默认值
	--------------------------------
	byte,short,int long       0
	float,double              0.0
	boolean                   false 【在C语言中，true是1 fales是0】
	char                      \u0000

	八种基本类型的数据类型一切向0看齐。
 
*/
public class DataTypeTest02
{
	//这里的static必须加
	 static int k = 1000;

     static int f ;//成员变量
	 //成员变量如果没有手动赋值就会默认赋值【局部变量不会】
	 //成员变量还是得遵守这个语法：必须先声明，再赋值，才能访问。
	public static void main(String[]args){
	/*
	int i; //局部变量
	System.out.println(i);

	*/
	 System.out.println(k);
     System.out.println(f);

	}
}