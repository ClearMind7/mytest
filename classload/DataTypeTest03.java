
/*
        关于java语言当中的char类型：
		转义字符  \
		
		转义字符出现在特殊字符之前，会将特殊字符转换成普通字符。
		\n   换行符
		\t   制表符
		\'     普通的单引号
		\\     普通的反斜杠
		\"		普通的双引号

*/
public class DataTypeTest03
{
	public static void main(String[]args){

        //普通的n字符
		char c1 = 'n';
		System.out.println(c1);

		// \n不是字符串，而是一个字符
		//这是一个"换行符"，属于char类型的数据
		//反斜杠在java语言当中具有转义功能。
		char c2 ='\n';

		/*System.out.println("Hello");
		System.out.println("world");
		*/

     //System.out.print()和System.out.print()区别
	 //println表示输出之后换行，print表示输出不换行。
		/*
    System.out.print("Hello");
    System.out.println("world");
     */
	 System.out.print("a");
	// System.out.print(c2);
	 System.out.println("b");

	 //普通的t字符
	 char x ='t';
	 System.out.println(x);

	 //制表符tab
	 //制表符和空格不一样，他们的ASCII不一样，体现在键盘上两个不同的按键。
	 char y = '\t';
	 System.out.print("A");
	 System.out.print(y);
     System.out.println("b");
	 //要求在控制台上输出“反斜杠字符”
	 //反斜杠将后边的单引号转义成不具备特殊含义的单引号字符，
	 //左边的单引号缺少了结束的单引号字符，编译报错
	/* char k = '\';
	 System.out.println(k);
	 */
	 char k = '\\';
	 System.out.println(k);
      
	  /*
	  解释：第一个反斜杠具有转义功能，将后边的反斜杠转义为普通的反斜杠字符。
	  结论：在java当中两个反斜杠代表一个普通的反斜杠字符。

	  //在控制台上输出普通的单引号字符
	  */
	  //char a = '';//java中不允许这样编写 程序报错
	  //char a =''';//这个报错是因为，第一个单引号和第二个单引号配对，最后的单引号找不到另一半。
         char a = '\'';
		 //反斜杠具有转义功能，将第二个单引号转换成普通的单引号字符。
		 //第一个单引号和最后一个单引号配对。
	 System.out.println(a);

         //编译错误
		//System.out.println(""Helloworld"");
		//纠正
		System.out.println("\"Helloworld\"");

		char m ='中';
		System.out.println(m);

		char n = '\u4e2d';//"中"对应的Unicode编码是 4e2d
		System.out.println(n);
                        
         //编译错误 字符串
		//char g ='4e2d';
		//编译错误 字符串
		//char g ='u4e2d';
		//通过：反斜杠U联合起来后面的一串数字变成了Unicode编码
		char g ='\u4c2d';
        System.out.println("g="+g);
		System.out.println("====================");
        //PS:乱蒙编码就是？没有意义。

	    //char类型的默认值
		char c10 ='\u0000';
		System.out.print(c10);

         
		//JDK中自带的native2ascii.exe命令，可以将文字转换成Unicode编码形式。
		//怎么使用这个命令：
		//在命令行中输入native2ascii，回车，然后输入文字之后即可获得Unicode编码。
         
		/*
		 十进制：0 1 2 3 4 5 6 7 8 9 10 11 12 13....
		 二进制：0 1 10 11 100 101....
		 十六进制：0 1 2 3 4 5 6 7 8 9 10 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20
	     八进制：0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20.....
		 */
	}
}