/*
    ����
	   �жϵ�ǰ��������
	       ����������ʱ��
		      ����ɡ��
			     �ж��Ա�
				    ���Ա�Ϊ�У���һ�Ѵ��ɡ
					���Ա�ΪŮ����һ��С��ɡ

		   ������������ʱ��
		        �ж��������¶�
				   �������¶���30�����ϣ�
				       ���Ա�Ϊ�У���ī��
					   ���Ա�ΪŮ������ɹ˪
         
		 ��ʾ��
		   һ�����õ�Ƕ��
		   ����״�����¶ȡ��Ա𡢶���Ҫ�Ӽ������롣
		    ����״����1��ʾ���ꡢ0��ʾ����
			 �Ա� 1��ʾ�� 0��ʾŮ
*/
/*
public class IfTest03
{
	public static void main(String[]args){

	     java.util.Scanner s = new java.util.Scanner(System.in);
		 System.out.print("����������״����1Ϊ���죬0Ϊ����");
		   int num = s.nextInt();
		
		  if (num == 1)
		  {  java.util.Scanner b = new java.util.Scanner(System.in);
		     System.out.print("�����������Ա�,1Ϊ�У�0ΪŮ");
		       int sex = b.nextInt();
			  if (sex == 1)
			  {
				  System.out.println("��һ�����ɡ");
			  }else if (sex == 0)
			  {
				  System.out.println("��һ����ɡ");
			  }
		  }else if (num == 0)
		  { java.util.Scanner w = new java.util.Scanner(System.in);
		     System.out.print("�������������¶�");
		       int k = w.nextInt();
			  if (k<30)
			  {
				  System.out.println("��������");
			  }
			  if (k>=30)
			  {   java.util.Scanner b = new java.util.Scanner(System.in);
		           System.out.print("�����������Ա�,1Ϊ�У�0ΪŮ");
		          int sex = b.nextInt();
				  if (num == 1)
				  {
					  System.out.println("��һ��ī��");
				  }else if (num == 0)
				  {
                     System.out.println("����ɹ˪");
				  }
				  
			  }

		  }

         
	
	}
}*/
public class IfTest03
{
	public static void main(String[]args){
              java.util.Scanner b = new java.util.Scanner(System.in);//��׼�� ���� ���Է���һЩ
		           System.out.print("�����������Ա�,1Ϊ�У�0ΪŮ");
		          int sex = b.nextInt();
	     java.util.Scanner s = new java.util.Scanner(System.in);
		 System.out.print("����������״����1Ϊ���죬0Ϊ����");
		   int num = s.nextInt();
		
		  if (num == 1)
		  {  
			  if (sex == 1)
			  {
				  System.out.println("��һ�����ɡ");
			  }else if (sex == 0)
			  {
				  System.out.println("��һ����ɡ");
			  }else{
				        System.out.print("���������ֵ���Ϸ�");
			  }
		  }else if (num == 0)
		  { java.util.Scanner w = new java.util.Scanner(System.in);
		     System.out.print("�������������¶�");
		       int k = w.nextInt();
			  if (k<30)
			  {
				  System.out.println("��������");
			  }
			  if (k>=30)
			  { 
				  if (sex == 1)
				  {
					  System.out.println("��һ��ī��");
				  }else if (sex == 0)
				  {
                     System.out.println("����ɹ˪");
				  }else{
				        System.out.print("���������ֵ���Ϸ�");
				  }
				  
			  }

		  }

         
	
	}
}