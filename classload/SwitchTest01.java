/*

     ����switch��䣺
	   1��switch���Ҳ����ѡ��ṹ��Ҳ�Ƿ�֧��䡣
	   2��switch�����﷨�ṹ��
	       һ���Ƚ�������switch���Ӧ��������д��
		    switch��int��String���͵�����ֵ�������{
				case int��String���͵�����ֵ�������
				   java ���;
				   java ���;
				   .....
				   break;	
		        case int��String���͵�����ֵ�������
				   java ���;
				   java ���;
				   .....
				   break;	
			    case int��String���͵�����ֵ�������
				   java ���;
				   java ���;
				   .....
				   break;	
				 ....
				 default;
				   java ���;
				   .......
			}

		3��switch���ִ��ԭ��
		   switch����С���ŵ��е����ݺ�case��������ݽ���һһƥ�䣬ƥ��ɹ��ķ�ִ֧�С�
		   �������϶��µ�˳������ƥ�䡣
		 
		4��ƥ��ɹ��ķ�ִ֧�У���֧���е������break;���Ļ�������switch�����ֹ��

		5��ƥ��ɹ��ķ�ִ֧�У���֧����û��break���Ļ���ֱ�ӽ�����һ����ִ֧�У�������ƥ�䣩��
		���������Ϊcase��͸���󡣡��ṩbreak;�����Ա��⴩͸��

		6�����з�֧��û��ƥ��ɹ�������default���Ļ�����ִ��default��֧���еĳ���

		7��switch�����case����ֻ����int��String���͵����ݣ��������������͡�
		      *��Ȼ byte��short��charҲ����ֱ��д��switch��case���棬��Ϊ���ǿ��Խ����Զ�����ת����

			  *jdk6�ģ�switch��case����ֻ��̽��int����

			  *jdk7֮�����7�汾���ڣ����������ԣ�switch�ؼ��ֺ�case�ؼ��ֺ������̽��int��String���͵����ݡ�
              
	    8��case���Ժϲ�;
		    int i =10
			 switch(i){
			 case 1;case2;case3;case4;case5;
			     System.out.println("Test code!");
			 }
*/

public class SwitchTest01
{
	public static void main(String[]args){

     /*
		long x = 100L;
		switch(x)//���뱨��
		*/

         long x = 100L;
		 switch((int)x){}

		String username = "zhangsan";
		switch(username){}

       /*
           ��������switch���
	   */

	   //�����û�������
	   //1��ʾ��һ
	   //2��ʾ�ܶ�
	   //.....
		 
	   java.util.Scanner s = new java.util.Scanner(System.in);
	   System.out.print("���������֣�");
	   int num =s.nextInt();
	   switch(num){
                case 1:
					System.out.print("����һ");
				    break;
				case 2:
					System.out.print("���ڶ�");
				    break;
				case 3:
					System.out.print("������");
				    break;
				case 4:
					System.out.print("������");
				    break;
				case 5:
					System.out.print("������");
				    break;
				case 6:
					System.out.print("������");
				    break;
				case 7:
					System.out.print("������");
				    break;
				default:
				    System.out.print("�Բ�������������ַǷ�");
	   }
	     //case�ϲ�
		 switch(num){
                case 1:case 0:
					System.out.print("����һ");
				    break;
				case 2:
					System.out.print("���ڶ�");
				    break;
				case 3:
					System.out.print("������");
				    break;
				case 4:
					System.out.print("������");
				    break;
				case 5:
					System.out.print("������");
				    break;
				case 6:
					System.out.print("������");
				    break;
				case 7:
					System.out.print("������");
				    break;
				default:
				    System.out.print("�Բ�������������ַǷ�");
	   }

	      
	
	}
}