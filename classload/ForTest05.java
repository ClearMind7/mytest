/*
   ��ǰһ������Ļ���֮�� ����1~100���������ĺ�

   ����� += ����ר�����׷�ӵġ�
*/

public class ForTest05
{
	public static void main(String[]args){
	      int sum = 0;  

	   /*  for(int i =1;i<=100;i+=2){
		     
			 System.out.println(i);

			 //����һ�����������ӡ�����ʼֵΪ0
			
			 //sum = 0;//���ܷŵ�����
			 //������ѭ���� ÿ�ζ���ִ��sum = 0;
			 sum += i;
			 //System.out.println("sum" + sum);����������� �в�ͬ�Ľ��
			 //��ÿ��ѭ��һ�����һ�� ��0+1=1 1+3=4....һ��һ�����
			 //ѭ���������������ս��
		 
		 
		 }*/
		// System.out.println("sum" + sum);
	      
		  for (int i=1;i<=100;i++)
		  {
			  if (i % 2 !=0)
			  {
				  sum+=i;
			  }
		  }
	System.out.println("sum" + sum);
	}
	
}
    