/*
       ����java�еĸ�ֵ���������
	     ��ֵ��������������֣�
		    * �����ĸ�ֵ�����
			   =
			* ��չ�ĸ�ֵ�����
			+=
			-+
			*-
			/=
			%=

	1����ֵ�����������ȼ�����ִ�еȺ��ұߵı��ʽ����ִ�н����ֵ����ߵı�����
    2��ע��һ�´���
	    byte i =10;
		i += 5; ��ͬ�ڣ�i=��byte����i+5��;

		int k = 10;
		k+=5; ��ͬ��:(int)(l+5)
		
		long x =10l;
		int y = 20;
		y += x; ��ͬ��y = (int)(y+x);

		3����Ҫ���ۣ���չ��ĸ�ֵ����������ı����������͡�����������������
		������byte���ͣ�������ô����׷�ӻ�׷�������ոñ������������ͻ���byte���͡�
*/

public class OperatorTest04
{
	public static void main(String[]args){

		//�����ĸ�ֵ�����
		int i = 10;
		System.out.println(i);//10

		i= i + 5;

		System.out.println(i);//15
          
		  //��չ�ĸ�ֵ�������+=��������Է���Ϊ��׷��/�ۼӡ���
		i += 5;//��ͬ��i = i + 5
	
	    System.out.println(i);//20

		i -= 5;//��ͬ��i = i -5;
		System.out.println(i);//15

		i *= 2;//i = i*2
		System.out.println(i);//30

		i /= 4; //i =i/4
		System.out.println(i);//7

		i %= 2;//i= i%2
		System.out.println(i);//1

		//------------------------------
        //10û�г���ȡֵ��Χ������ֱ�Ӹ�ֵ��
		byte b = 10;
		//�޷���ֵ��
		//b = b +5;
    
	   //��������
	   b = (byte)(b+5);
	   System.out.println(b);

	   byte x =10;
	   //���Ը�ֵ
	   x += 5;//��ͬ�ڣ�x =��byte���� x + 5��; ����ͬ�� x = x +5
	   System.out.println(x);
	   x += 113;
	   System.out.println(x);//-128����ʧ���ȡ�
            
	}
}