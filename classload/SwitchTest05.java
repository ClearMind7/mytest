/*
  ����ϵͳ���������ɼ������жϸÿ����ĳɼ��ȼ���
     1����Ч�ɼ���Χ��0~100
	 2�����Գɼ�����С��
	 3�����Գɼ��͵ȼ���֮��Ķ��չ�ϵ��
	   90~100 A
	   80~90  B
	   70~80  C
	   60~70  D
	   0~60   E

	   4��������������switch�����ɣ�������if��
	   ���ţ���int�����ɼ�/10��
	   0 1 2 3 4 5 6 7 8 9 10

*/
public class SwitchTest05
{
	public static void main(String[]args){
		System.out.println("��ӭʹ�óɼ���ѯϵͳ");
	 java.util.Scanner s = new java.util.Scanner(System.in);
	   System.out.print("��������ĳɼ�");
	   int grade = s.nextInt();
	    //�����ɼ�

		//ת����int
		grade =(grade/10);

		switch (grade)
		{
		case 9: case 10:
			System.out.println("��ĳɼ�����ΪA");
			break;		
		case 8: 
			System.out.println("B");
			break;		
		case 7: 
			System.out.println("C");
			break;		
		case 6: 
			System.out.println("D");
			break;
		default:
            System.out.println("E");
			break;
	
		}
	
	
	
	
	
	
	
	
	
	}
}