/*
      ��������
	     1�����������η��б�����static�ؼ��֣������ĵ��÷����ǣ�����.������(ʵ���б�);
		 2�����ǣ���ʱ��"����."����ʡ�ԣ�ʲôʱ���¿���ʡ���أ�
		 �������ڵ�ǰ���п���ʡ�Ե�ǰ�������������������ķ����Ͳ����ԡ�

		 3��������ӮjavaԴ�ļ�����ֻ����һ��class���������ֻ��Ϊ�˽��η��㡣
		 ���ַ�ʽ��Ҫģ�¡�
*/ 

public class MethodTest06
{
	public static void main(String[]args)
	{

     //���÷���
	 MethodTest06.m();

	 //���ڷ����������б�����static�ؼ��ֵ�"����"���Բ�д��
     m();  

	 //���������ࡾ���Ǳ��ࡿ�еķ���
	 A.k();

	 //����������ķ�����ʱ�� ����������� ��ǰ��Ϳ���ʡ��



	}
	public static void m(){
	 
	  System.out.println("m method execut!");
	  m2();
	  //�����������
	  A.k2();
	}
	public static void m2(){
	 
	  System.out.println("m2 method execut!");
	}
}

class A
{
		public static void k(){
	 
	  System.out.print("k method execut!");
	}
	public static void k2(){
	 
	  System.out.print("k2 method execut!");
	}
}