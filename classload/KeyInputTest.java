/*

System.out.println(); ���������̨��������ڴ浽����̨������Ĺ����У����Ǵ��ڴ��г����ˡ�

�����û��������룬 �ӡ����̡������ڴ桱��������Ĺ��̣����ڴ���ȥ��

���´��� �Ȳ�Ҫ��Ϊʲô���̶���д�Ϳ��Խ����û����̵����롣
*/

public class KeyInputTest
{
	public static void main(String[]args){

		  //��һ��:��������ɨ��������
		  java.util.Scanner s = new java.util.Scanner(System.in);
		  //�ڶ���������Scanner�����next()������ʼ�����û���������
		  //����ִ�е������ͣ�������ȴ��û�����
		  //���û������ʱ�򣬲��������ûس�����ʱ�򣬼������Ϣ���Զ���ֵ��userInputContent
		  //����ִ�е�����û��������Ϣ�Ѿ����ڴ����ˡ�
		  //�����ı������ַ�������ʽ���ա�
		  //String userInputContent = s.next();//��ʶ���������淶������֪��
		  
		  //�������֡���������int����ʽ�����ա�
		  int num = s.nextInt();
		  //���ڴ��е��������������̨
		  //System.out.print("�������ˣ�"+userInputContent);
			  
	       System.out.println("������������ǣ�"+num);
	}
}

/*
�ܽ� ����ס���룬����ֱ������븴��ճ��
��һ��
java.util.Scanner s = new java.util.Scanner(System.in);
�ڶ�������ѡһ��
int num = s.nextInt();����
int String = s.next();�ַ���