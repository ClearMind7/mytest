/*

������

*/
public class  OOTest02
{
	public static void main(String[]args){
	
	     //����user����
		 //u��һ���ֲ�����
		 //u��һ������
		 //u�����ڴ��ַָ����ڴ�user����
		 User u = new User();
	  
         //���user�ڲ������ڲ�ʵ�ʱ�����ֵ
	     System.out.println(u.no);
		 System.out.println(u.name);
		 System.out.println(u.addr);

		 //�޸�User�����ڲ���ֵ
		 u.no = 110;
	     u.name = "jack";
		 u.addr = new Address();

		 //��main��������Ŀǰֻ�ܿ���һ������u
		 //һ�ж���ֻ��ͨ��u�����з���
		 System.out.println(u.name+"��ס���ĸ����У�"+u.addr.city);
		 System.out.println(u.name+"��ס���ĸ��ֵ���"+u.addr.street);
		 System.out.println(u.name+"�ʱࣺ"+u.addr.zipcode);

		 u.addr.city = "����";
		 u.addr.street = "����";
		 u.addr.zipcode = "11111111";

		 System.out.println(u.name+"��ס���ĸ����У�"+u.addr.city);
		 System.out.println(u.name+"��ס���ĸ��ֵ���"+u.addr.street);
		 System.out.println(u.name+"�ʱࣺ"+u.addr.zipcode);
		 
		 
	}      
	
}

