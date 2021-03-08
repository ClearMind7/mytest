/*
   使用for循环完成99乘法表
*/

public class ForTest08
{
	public static void main(String[]args){
	    for (int i = 1;i<=9;i++)
	    {
			//for (int j=1;j<=9;j++)这样 就是循环九次1*1 1*2 1*3....
            for (int j=1;j<=i;j++)//这样 I等于几 就循环几次 99乘法表就完成了
			{
				System.out.print(  i + "*"+ j +"="+i*j + "  " );//这样看起来不直观 应该去掉ln
			}
			System.out.println();//在外边换行 下边的一样
	 //System.out.print("\n");//在主循环体里边
	    }
	
	}
}