/*
  �ó�����һ�������������overload���ŵ�
     *����Ա���÷�����ʱ�򣬱ȽϷ��㡣��Ȼ������ͬ�����Ǹо���������һ������һ����
	 ����Ҫ�������ķ�������

	 *��������

	 ǰ�᣺�������Ƶ�ʱ�򣬷�����������ͬ��

	 ���ǣ����ܲ�ͬ��ʱ�򣬾������÷�������ͬ��

  */

  public class OverloadTest02
  {
	  public static void main(String[]args){
	     
		 //���÷�����ʱ��������һ������һ����
		 //���������Ͳ�ͬ����Ӧ���õķ�����ͬ��
		 //��ʱ���ֲ����������������������ǲ������������͡�
		 System.out.println(sum(1,2));
		 System.out.println(sum(1.0,2.0));
		 System.out.println(sum(1L,2L));
	  
	  }
     public static int sum(int a.int b){
	   return a + b;
	 }
	 public static int sum(long a.long b){
	   return a + b;
	 }
	 public static int sum(double a.double b){
	   return a + b;
	 }

  }