/*
  �������أ�
     1�����������ֱ���Ϊ��overload
	 2��ʲôʱ����ʹ�÷������أ�
          *�������Ƶ�ʱ�򣬾������÷�������ͬ��
		  ���ǣ����ܲ�ͬ��ʱ�򣬾������÷�������ͬ


	 3��ʲô��������֮�󹹳��˷������أ�
	     *��ͬһ���൱��
		 *��������ͬ
		 *�����б�ͬ
		    - ������ͬ
			- ˳��ͬ
			- ���Ͳ�ͬ
	 4���������غ�ʲô�й�ϵ����ʲôû�й�ϵ��
	    *�������غͷ������Ͳ����б��й�ϵ
		*�������ͷ���ֵ�����޹�
		*�������غ����η��б��޹�
*/
public class OverloadTest03
{
	public static void main(String[]args){
	
	     
	}
	//��������
	public static void m1(){}
	public static void m1(int a){}

     //��������
	public static void m2(int a double b){}
	public static void m2(double a int b){}

      //��������
	public static void m3(int x){}
	public static void m3(double y){}

	 //������� ���²��Ƿ������� �Ƿ����ظ�
	/* public static void m4(int x int y){}
	 public static void m4(int y int x){}
   */
 
   //������� 
   /*public static void x(){}
   public static int x(){  retrun 1;}
   */
/*
void y(){}
public static  void y(){} Ҳ����
 
   }