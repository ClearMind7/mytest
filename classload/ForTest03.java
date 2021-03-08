/*

*/

public class ForTest03
{
	public static void main(String[]args){
	     
		 //输出1~10之间的奇数
		 for (int i =1;i<=10;i+=2 )
		 {
		    System.out.println("i---->" + i);
		 }
		 //输出1~10所有的偶数
		 for (int i= 2;i<=10 ;i += 2 )
		 {
			 System.out.println("i---->" + i);
		 }
		 for (int i =10;i>0;i-- )
		 {
			 System.out.println("i---->" + i);
		 }
		 for (int i =0;i<10; )
		 {    //i++. 放到上边下边都行
			 System.out.println("i---->" + i);
			 i++
		 }
	
	}
}