/*
   ����java��������ֵ�����������
     +      ���
	 -      ���
	 *      �˻�
	 /      ��
	 %      ��������ȡģ��

	 ++     �Լ�1
	 --     �Լ�1
     
ע�⣺һ�����ʽ�����ж�������������������ȼ�����ȷ���ͼ����ţ����ȼ��õ�������
      û�б�Ҫȥר�ż�������������ȼ���
*/

public class OperatorTest01
{
	public static void main(String[]args){
	      
		  int i = 10;
		  int j = 3;
		
		System.out.println(i+j);//13
		System.out.println(i-j);//7
		System.out.println(i*j);//30
		System.out.println(i/j);//3
		System.out.println(i%j);//1
         
		//������++Ϊ����--�������ѧ��
		//����++��������Լ�1��
		int k =10;

		//++��������Գ����ڱ�����ߣ�����������Լ�1����������Ŀ�������

		k++;
		System.out.println(k);

		int y = 10;

		//++��������Գ����ڱ���ǰ�ߡ���Ŀ������� ����ǰ���������Լ�1
		++ y;
		System.out.println(y);

		//++��������Գ����ڱ���ǰ��Ҳ���Գ����ڱ��������۱���ǰ���Ǻ�
		//ֻҪ++����������ñ����е�ֵһ�����Լ�1
		
		//++�����ڱ�����
		//����������ֵ���㣬�ٶԱ����б����ֵ�����Լ�1

		int a =100;
		int b =a++;
		System.out.println(a);//101
		System.out.println(b);//100
        
		//++�����ڱ���ǰ
		//�����Ƚ����Լ�1���㣬�ٸ�ֵ��
		int m = 20;
		int n =++m;
		System.out.println(m);//21
        System.out.println(n);//21


		int xx = 500;
		System.out.println(xx);
		//sun��˾�ṩ�����Դ������������
			//int x = xx������������ַ���
           //�����������ַ�Ϊxx ++
		/*   int x = xx++
		��������ͻ���
			   System.out.println(xx++);//500
		       System.out.println(xx);//501
     */
	//System.out.println(--xx);//500
	//System.out.println(xx++);//500
	//System.out.println(xx--);//501
	//System.out.println(xx--);//500
	//System.out.println(xx--);//499
    //System.out.println(xx);//498



	}
}