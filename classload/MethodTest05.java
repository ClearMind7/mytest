/*


*/
public class MethodTest05
{
	public static void main(String[]args){
	      
		  //������� ����������ͬ
		  //MethodTest05.sum();

         //�����Զ�����ת��int--->long
         MethodTest05.sum(10,20);
        //��������Ӧ
		//MethodTest05.sum(10.0,20);

		//OK
		MethodTest05.sum(��long��10.0,20);

	}
	public static void sum(long a,long b){
         System.out.println(a+"+"+b+"="+(a+b));
	}
}