/*

  ���´��벻ʹ�÷������ػ��ƣ���ʹ��overload������������ڵ�ȱ��
     1��g��o��p����Ȼ���ܲ�ͬ�����ǹ��������Ƶģ�������͡�
	 ���·������й������Ƶķ������ֱ�����������ͬ�����֣����ڳ���Ա��˵��
	 ���÷�����ʱ�򲻷��㣬����Ա��Ҫ�������ķ�����������ɵ��á��������㡿

	 2��������

	 ������һ�ֻ��ƣ�
	    ������Ȼ��ͬ�����ǹ������Ƶ�ʱ����û������һ�ֻ��ƣ������ó���Աʹ��
		��Щ������ʱ�������ʹ��ͬһ������һ������������Ա�Ժ��д����ȽϷ��㣬
		Ҳ����Ҫ������෽����������Ҳ��������

		���ֻ��ƾ��� ��������/overload

*/


public class overloadTest01
{
	public static void main(String[]args){

		//���÷���
		int k1 = g(1,2);
		System.out.println(k1);

		int k2 = o(1.0,2.0);
		System.out.println(k2);

		long k3 =p(1L,2L);
		System.out.println(k3);
	
	       
	}
	//����һ������ ���Լ�������int���͵ĺ�
	public static int g(int a ,int b){
	
	   return a+b;
	
	}
	public static double o(double a,double b){
	  
	       return a+b;
	}
	public static long p(long a,long b){
	    return a+b;
	}
}

//����ϣ���ﵽ���ǣ�����Աʹ�������������Ƶķ�����ʱ�򣬾�����ʹ��һ������һ����
//java֧�����ֻ��ơ���Щ���Բ�֧�֣������Ժ�Ҫѧϰ��javascrpit��