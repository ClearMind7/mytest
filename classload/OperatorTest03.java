/*
    �߼��������
	   &       �߼��롾���ҡ����������Ӷ���true���������true��
	   |       �߼��򡾻��ߡ������ߵ�����ֻҪ��һ��true���������true��
	   !       �߼��ǣ�ȡ������false����true����true����false������һ����Ŀ���������
	   ^       �߼���� �����ߵ�����ֻҪ��һ�����������true��

	   &&      ��·��  
	   ||      ��·��

	 1���߼������Ҫ�����ߵ����Ӷ��ǲ������ͣ������߼���������յ�������Ҳ��һ���������͡�
     2����·����߼���������������ͬ��ֻ������·����ڶ�·����
	 3����·����߼���������������ͬ��ֻ������·����ڶ�·����
	 4��ʲô����·�����·�����أ�
	 5��ʲôʱ��ѡ��ʹ���߼����������ʲôʱ��ѡ��ʹ�ö�·���������

	   */
	 public class OperatorTest03
{
	public static void main(String[]args){

	    System.out.println(5>3&5>2);//true
		System.out.println(5>3&5>6);//false
		System.out.println(5>3|5>6);//true

		System.out.println(!false);//true
		System.out.println(!true);//false

		System.out.println(true^false);//true
		System.out.println(false^false);//false
	    System.out.println(true^true);//false

		//�߼���Ͷ�·��
		//int x = 10��
		//int y = 12��
		//�߼���
		//System.out.println��x<y && ++x<y��;
	    //System.out.println��x)
	
		//�߼���Ͷ�·��
		int x = 10;
		int y = 8;
		//�߼���
		System.out.println(x<y && ++x<y);
	    System.out.println(x);
	}
}