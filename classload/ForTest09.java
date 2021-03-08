/*

    编写for循环 找出1~100中所有的素数
     素数：又被称为质数。能被1和自身整除，不能被其他数字整除。
*/
public class ForTest09
{
	public static void main(String[]args){

		int count = 0;
	     for (int i =2;i<=100;i++)
	     {
			 boolean issushu = true;//标记 默认将I看做一个素数
			 for (int j =2;j<i;j++)
			 {
				if (i % j == 0)
				{
					issushu = false;
					break;
				}
			  }
			  if(issushu){
				  count++;
                  System.out.print(i+" ");
				  if(count % 8 == 0){
				  System.out.println();
				  }

			  }
		   }
		//升级版加入统计机制
	
	
	}
}

/*
升级版
 编写1~10000所有的素数
  要求每八个换一行输出

*/