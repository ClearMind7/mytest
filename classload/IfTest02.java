/*
     ����
	  ����ϵͳ����һ���˵����䣨���������Ҫ�Ӽ������룩�������������ж�����������������ĸ��׶Σ�
	  ���������0~150֮�䡣
	  0~5 �׶�
	  6~10 �ٶ�
	  11~18  ������
	  19~35  ����
	  36~55  ����
	  56~150 ����


*/

public class IfTest02
{
	public static void main(String[] args){
		//���ռ������� �����䡾�����ʱ������������֡�
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("��������������");//�����ʾ��Ϣ����Ȼ�û�������֪������Ҫ���
		int age = s.nextInt();//ͣ�����ȴ��û����룬����֮���Զ����գ���ֵ��age������
		//System.out.println("age="age);

		//2�������������ҵ���߼��ж�
		String str = "����";
		if (age<0 || age>150)
		{
			str="���ṩ�����䲻�Ϸ�������ֵ��Ҫ��0~150֮��";
		}else if (age <= 5)
		{
			str ="�׶�";
		}else if (age <= 10)
		{
		    str = "�ٶ�";
		}else if (age <= 18)
		{
			str = "������";
		}else if (age <= 35)
		{
			str = "����";
		}else if (age<=55)
		{
			str ="����";
		}
		if(age<0 || age>150){
           System.out.println(str);
		}else{
		System.out.println("�������������ڵ�"+str+"�׶�");
       }
	   
	
	}
}