/*
    关于java语言中的变量；
	
	1、在方法体中的java代码，是遵守自上而下的顺序依次执行的，逐行执行
	   第一行;
	   第二行;
	   第三行;
      特点：前一行的代码必须完整结束之后，下一行才能执行

    2、在同一个作用域当中 变量名不能重名，但是变量可以重新赋值。
	   
*/
public class VarTest02
{
	public static void main(String[]args){

	   int i =100;
	   System.out.println(i);//100

	   i = 200;

	   System.out.println(i);//200
/*反面教材 这样是不对的
	    System.out.println(K);
		int K = 50;
     */

	 //int i = 90; 反面教材 不可以重名 可以重新赋值		
	 //System.out.println(i);

	}
}