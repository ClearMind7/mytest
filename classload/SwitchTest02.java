public class SwitchTest02
{
	public static void main��String[]args��{
	   
	   java.util.Scanner s = new java.util.Scanner(System.in);
	   System.out.print("���������ڼ�");
       String dayofweek = s.next();
	   switch(dayofweek){
	   case"����һ":
		   System.out.println(1);
	       break;
	   case"���ڶ�":
		   System.out.println(2);
	       break;
	   case"������":
		   System.out.println(3);
	       break;
		case"������":
		   System.out.println(4);
	       break;
	   case"������:
		   System.out.println(5);
	       break;
	   case"������":
		   System.out.println(6);
	       break;
       case"������":
		   System.out.println(7);
	       break;
	   defult:
		   System.out.println("�Բ��� ����������ݷǷ�");
	       break;

	   }

	}
}