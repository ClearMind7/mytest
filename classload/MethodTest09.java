/*

 ����return���
    *����return�ؼ��ֵ�java���ֻҪִ�У����ڵķ���ִ�н�����
	*��ͬһ���������У�return����±߲��ܱ�д�κδ��룬��Ϊ
	��Щ������Զ�Ķ�ִ�в��������Ա��뱨��

*/
public class MethodTest09
{
	public static void main(String[]args){

    int k = m();
	System.out.println(k);

	//���÷��� ���������
	System.out.println(m());


	}
	//���뱨��ȱ�ٷ�����䣬���³����������Ϊ�޷��ٷְٱ�֤"return 1"��ִ�С�
	/*
	public static int m(){

	     int a = 10;
		 if(a>3){
            return 1;
		 }
	
	}
	*/
	//���³�����Ա�֤return 1��return 0ִ�У�����ͨ��
/*	public static int m(){

	     int a = 10;
		 if(a>3){
            return 1;
		 }else{
		   return 0 ;
		 }
	
	}*/

	//���Բ���else �����Ϸ�����ȫ��ͬ
	//����else Ҳһ����ִ���±ߵ�return

	public static int m(){

	     int a = 10;
		 if(a>3){
            return 1;
			//System.out.println();
			//��仰һ��ִ�в��� ���Ա������
		 }{
           System.out.println();//����Ϳ��� ��Ϊ��仰�п���ִ�С�
		   return 0;
		 }
	
	}

	public static int k(){
	   //ʵ�����ú�M����һ��
	   return 10>3 ? 1 : 0;
	}

}