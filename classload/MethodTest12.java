/*��editPlus���У�������ɫΪ��ɫ�ı�ʾһ��������֣�������javase������Դ��ġ�
�����Զ�����࣬������ɫ�Ǻ�ɫ���Ǳ�ʶ��
��ʵjavase������Դ����ࡣ���磺string.class ��Щ����Ҳ�Ǳ�ʶ����
ֻҪ��������һ���Ǳ�ʶ��

�ص�:�������õ�ʱ���ڲ������ݵ�ʱ��ʵ���ϴ��ݵ��Ǳ����ٱ�����Ǹ���ֵ������ȥ��
*/

public class MethodTest12
{
     public static void main(String[]args){
	 
	      int a = 10;
		  int b = 20;

		  int k = sumInt(a,b);
		System.out.println("k="+k);
	 
	 }
	 public static int sumInt(int i,int j){
	 
	     int t =i+j;
		 int num = 3;
		int k = divide(t,num);
		 return k; 
	 
	 }
	 public static int divide(int x,int y){
	 
	      int z =x/y;
		  return z;
	 
	 
	 }

}

/*
��ͼ���ݣ�
   1��ֻҪ�漰���������ݵ����⣬���ݵ��Ǳ����б����ֵ
   2����ͼ��ʱ�򣬱�����ѭ���϶��µ�˳������ִ�С�
   //�ֲ�����ֻ�ڵ�ǰ������Ч

*/