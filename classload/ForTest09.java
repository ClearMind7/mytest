/*

    ��дforѭ�� �ҳ�1~100�����е�����
     �������ֱ���Ϊ�������ܱ�1���������������ܱ���������������
*/
public class ForTest09
{
	public static void main(String[]args){

		int count = 0;
	     for (int i =2;i<=100;i++)
	     {
			 boolean issushu = true;//��� Ĭ�Ͻ�I����һ������
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
		//���������ͳ�ƻ���
	
	
	}
}

/*
������
 ��д1~10000���е�����
  Ҫ��ÿ�˸���һ�����

*/