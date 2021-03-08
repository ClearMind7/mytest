/*

   对象的创建和使用

*/
public class OOTest01
{
	public static void main(String[]args){

		int i = 10;
	
	       //通过一个类可以实例化N个对象
		   //实例化对象的语法：new 类名();
		   //new是java语言当中的一个运算符
		   //new运算符的作用是创建对象，在jvm堆内存中开辟新的内存空间。
		   //方法区内存：在类加载的时候，class字节码片段被加载到该内存空间当中。
		   //栈内存（局部变量）：方法代码片段执行的时候，会给该方法分配内存空间，在栈内存中压栈。
		   //堆内存：new的对象在堆内存中存储
		   //student是一个引用数据类型
		   //s是一个变量名
		   //new Student()是一个学生对象。
		   //s;是一个局部变量【在栈内存中存储】
		   //什么是对象？new运算符在堆内存中开辟的内存空间称为对象。
		   //什么是引用？引用是一个变量，只不过这个变量中保存了另一个java对象的内存地址。
		   //java语言当中 程序员不能直接操作堆内存，java中没有指针，不像C语言。
		   //java语言当中，程序员只能通过引用去访问堆内存当中内部对象的实例变量。
		  Student s = new Student();

		   //访问实例变量的语法格式：
		   //读取数据：引用、变量名
		   //修改数据：引用.变量名=值
/*		   int stuNo = s.No;
		   String stuName = s.name;
		   int stuage = s.age;
		   boolean stusex = s.sex;
		   String stuAddr = s.addr;

		   u.g("学号="+stuNo);
		   u.g("姓名="+stuName);
		   u.g("年龄="+stuage);
		   u.g("性别="+stusex);
		   u.g("住址="+stuAddr);上下文一样
		   */
           u.g("学号="+s.No);
		   u.g("姓名="+s.name);
		   u.g("年龄="+s.age);
		   u.g("性别="+s.sex);
		   u.g("住址="+s.addr);

		   s.No = 10;
		   s.name = "jack";
		   s.age = 20;
		   s.sex = true;
		   s.addr = "x";
		   u.g("学号="+s.No);
		   u.g("姓名="+s.name);
		   u.g("年龄="+s.age);
		   u.g("性别="+s.sex);
		   u.g("住址="+s.addr);

		   //再通过类实例化一个全新的对象
		   //stu是一个引用
		   //stu同时也是一个局部变量
		   //student是变量的数据类型
		   Student stu = new Student();
		   u.g(stu.No);
		   u.g(stu.name);
		   u.g(stu.age);
		   u.g(stu.sex);
		   u.g(stu.addr);

		   /*
		   u.g(student.no);
		   //编译错误，no这个实例变量不能直接采用类名方式访问
		   //因为no是实例变量，对象级别的变量，变量储存在java对象的内部，必须现有对象
		   //通过对象才能访问no这个实例变量，不能直接通过类名访问


/*

局部变量在栈内存中存储
成员变量中的实例变量在堆内存的java对象内部存储

实例变量是一个对象一份，100个对象有100份。

*/
		   
	}
}