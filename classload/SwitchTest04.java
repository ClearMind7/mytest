/*
 ʵ�ּ��������еļӼ��˳����������㡣


 ʵ��˼·��
   1��ѡ���������ݴӼ�������
   2��ʹ��switch�������ж�
   3����Ҫ�ӿ���̨�������Σ�
         *��һ������
		 *�����
		 *�ڶ�������

		 */
public class SwitchTest04
{
	public static void main(String[]args){
		System.out.println("��ӭʹ�ü򵥼�����ϵͳ");
	 java.util.Scanner s = new java.util.Scanner(System.in);
	   System.out.print("�������һ������");
	   int num = s.nextInt();
       System.out.print("�����������");
	   String y = s.next();
	   System.out.print("������ڶ�������");
	   int num2 = s.nextInt();

	  /* switch(y){
		   case "+":
			  System.out.print("���Ϊ" + (num + num2));
		      break;
		   case "-":
			  System.out.print("���Ϊ" + (num - num2));
		      break;
		   case "*":
			  System.out.print("���Ϊ" + (num * num2));
		      break;
		   case "/":
			  System.out.print("���Ϊ" + (num / num2));
		      break;
		   case "%":
			  System.out.print("���Ϊ" + (num % num2));
		      break;
		   default:
			  System.out.print("���������������Ϸ�" );
       */
	   int jg = 0;
       switch(y){
		   case "+":
			  jg = num + num2;
		      break; 
		   case "-":
			  jg = num - num2;
		      break;
		   case "*":
			  jg = num * num2;
		      break;
		   case "/":
			  jg = num / num2;;
		      break;
		   case "%":
			jg = num % num2;
		      break;
		   default:
			 System.out.print("���������������Ϸ�" );
       
	      }
		  System.out.print("������Ϊ" + num + y + num2 + "=" + jg );
	
	}
}
