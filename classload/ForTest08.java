/*
   ʹ��forѭ�����99�˷���
*/

public class ForTest08
{
	public static void main(String[]args){
	    for (int i = 1;i<=9;i++)
	    {
			//for (int j=1;j<=9;j++)���� ����ѭ���Ŵ�1*1 1*2 1*3....
            for (int j=1;j<=i;j++)//���� I���ڼ� ��ѭ������ 99�˷���������
			{
				System.out.print(  i + "*"+ j +"="+i*j + "  " );//������������ֱ�� Ӧ��ȥ��ln
			}
			System.out.println();//����߻��� �±ߵ�һ��
	 //System.out.print("\n");//����ѭ�������
	    }
	
	}
}