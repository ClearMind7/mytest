/*
     ��Ԫ�����/��Ŀ�����/���������
	     1���﷨����
		    �������ʽ�����ʽ1�����ʽ2

		 2����Ԫ�������ִ��ԭ��
		     ���������ʽ�Ľ����true��ʱ��ѡ����ʽ1��Ϊ�������ʽ��ִ�н����
			 ���������ʽ�Ľ��Ϊfalse��ʱ��ѡ����ʽ2��Ϊ�������ʽ��ִ�н����

*/
public class OperatorTest06
{
	public static void main(String[]args){
        boolean sex = false;

		//�������³���ɷ����ͨ��
		//���뱨�� ��Ϊ������һ��������java��䡣
		//sex?'��'��'Ů';

		char c =sex ? '��':'Ů';
		System.out.println(c);

		sex = true;
        c = sex ? '��':'Ů';
		System.out.println(c);
         
		 //�﷨���󣬱��뱨�����������String��Ҳ������char������ǰ�߲�����char���������ݡ�
		 //����������Ͳ����ݡ�
		//char c1 = sex?"��":'Ů';

		System.out.println(sex?'��':"Ů");
		//�ַ�������String
	
	}
}