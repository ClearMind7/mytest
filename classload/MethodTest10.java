/*

�ڷ���ֵ������void�ķ�����ʹ��return��䡣
return�������ڷ���ֵΪvoid�ķ���������Ҫ��Ϊ�˽�����ǰ������

*/
public class MethodTest10
{
	public static void main(String[]args){
	    
	       
	
	}
	//������� ��������Ϊ�յķ��� �޷�����ֵ
	/*
	public static void m(){
	
	    return 10;
	
	}*/
	public static void m(){
	
	    return;
	
	}
	public static void m(){
	     for (int i = 0;i<10;i++ )
	     {if(i==5){
                return;//������ֹforѭ�� ����ֹM���� break������ֹѭ��
		 }
		 System.out.println("fff")
	     }
		 System.out.println("ffff")
	    
	
	}

}