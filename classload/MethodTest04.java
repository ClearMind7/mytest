/*

  �����ĵ��ò�һ����main�������У������������������С�
  ֻҪ�ǳ������ִ�е���λ�ã�������ȥ��������������

*/

public class MethodTest
{
	public static void sum(int a,int b){
                  
				System.out.println(a+"+"+b+"="+(a+b));
	          //����do some����
			 MethodTest04.dosome();
	}

	public static void main(String[]args){
       //����sum����
     MethodTest04.sum(1,2);
    
	 System.out.println("hello world")

	}
	public static void dosome(){
	
	    System.out.println("do some")
	
	}
}