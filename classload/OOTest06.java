/*

       ����
	      ����һ��ѧ����
		   *����
		   *ѧ��
		   *ѧ����һ̨�ʼǱ����� 

		  ����һ���������
           *�ͺ�
		   *Ʒ��
		   *��ɫ
     
	 �����е�һ��ѧ��ȥʹ�����е�һ̨�ʼǱ�����

	  Ȼ����벢���У���ͼ��
*/
public class OOTest06
{
	public static void main(String[]args){
		
		Computer c = new Computer();
		c.xinghao = "��ҹ����B��";
		c.pinpai = "����";
        c.yanse = "��ɫ";

		Xuesheng kami = new Xuesheng();
		kami.xingming = "ҹ����";
		kami.xuehao = 4563214;
		kami.note = c; 
	   
	
		System.out.println(kami.note.pinpai);

		kami.note = new Computer();//��ɱ��
		System.out.println(kami.note.xinghao);
	        
	
	}
}

class Computer
{
	String xinghao;
	String pinpai;
	String yanse;


}

class Xuesheng
{
	String xingming;
    int  xuehao;
	Computer note;
}