/*

         关于java控制语句当中的break语句：

		   1、break是java语言当中的关键字，被翻译为"中断/折断"

		   2、break +";"可以成为单独的完整的java语句 break;
 
           3、break语句使用在switch语句当中，用来中止循环的执行。

		   4、break语句同样可以使用在循环语句当中，来终止循环的执行。

		   5、break终止哪个循环呢？

		   6、break;语句使用在for while do...whlie循环语句中跳出循环，终止循环的运行。
		   因为当程序循环到某个条件的时候，后续的循环就没必要执行了，在执行也是浪费资源，所以可以
		   终止循环，这样可以提高程序执行效率

		   7、以下以for循环为例讲解break;语句

		   8、默认情况下break;终止的是离它最近的循环语句。

		   9、默认情况下break终止的是理他最近的循环语句。当然也可以指定终止某个循环，
		   需要给循环起名，采用这种语法：break 循环名称;
*/
public class BreakTest01
{
	public static void main(String[]args){
	   
	  for (int i =0;i<10;i++)
	    {
			if (i==5)
			{
				break;
			} 
			System.out.println(i)
	    }
			//以下语法使用较少
	A: for (int j=0;k<3;j++)
	 {
	 B:for (int i =0;i<10;i++)
	    {
			if (i==5)
			{
				break;//break A;//当前break语句终止的内层的for循环，因为这个for理她最近。
				      //这里的break不会影响到外边的for循环。
					  //如果要终止外部 可以加上标志
			}
	  }
	}
}

