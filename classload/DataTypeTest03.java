
/*
        ����java���Ե��е�char���ͣ�
		ת���ַ�  \
		
		ת���ַ������������ַ�֮ǰ���Ὣ�����ַ�ת������ͨ�ַ���
		\n   ���з�
		\t   �Ʊ��
		\'     ��ͨ�ĵ�����
		\\     ��ͨ�ķ�б��
		\"		��ͨ��˫����

*/
public class DataTypeTest03
{
	public static void main(String[]args){

        //��ͨ��n�ַ�
		char c1 = 'n';
		System.out.println(c1);

		// \n�����ַ���������һ���ַ�
		//����һ��"���з�"������char���͵�����
		//��б����java���Ե��о���ת�幦�ܡ�
		char c2 ='\n';

		/*System.out.println("Hello");
		System.out.println("world");
		*/

     //System.out.print()��System.out.print()����
	 //println��ʾ���֮���У�print��ʾ��������С�
		/*
    System.out.print("Hello");
    System.out.println("world");
     */
	 System.out.print("a");
	// System.out.print(c2);
	 System.out.println("b");

	 //��ͨ��t�ַ�
	 char x ='t';
	 System.out.println(x);

	 //�Ʊ��tab
	 //�Ʊ���Ϳո�һ�������ǵ�ASCII��һ���������ڼ�����������ͬ�İ�����
	 char y = '\t';
	 System.out.print("A");
	 System.out.print(y);
     System.out.println("b");
	 //Ҫ���ڿ���̨���������б���ַ���
	 //��б�ܽ���ߵĵ�����ת��ɲ��߱����⺬��ĵ������ַ���
	 //��ߵĵ�����ȱ���˽����ĵ������ַ������뱨��
	/* char k = '\';
	 System.out.println(k);
	 */
	 char k = '\\';
	 System.out.println(k);
      
	  /*
	  ���ͣ���һ����б�ܾ���ת�幦�ܣ�����ߵķ�б��ת��Ϊ��ͨ�ķ�б���ַ���
	  ���ۣ���java����������б�ܴ���һ����ͨ�ķ�б���ַ���

	  //�ڿ���̨�������ͨ�ĵ������ַ�
	  */
	  //char a = '';//java�в�����������д ���򱨴�
	  //char a =''';//�����������Ϊ����һ�������ź͵ڶ�����������ԣ����ĵ������Ҳ�����һ�롣
         char a = '\'';
		 //��б�ܾ���ת�幦�ܣ����ڶ���������ת������ͨ�ĵ������ַ���
		 //��һ�������ź����һ����������ԡ�
	 System.out.println(a);

         //�������
		//System.out.println(""Helloworld"");
		//����
		System.out.println("\"Helloworld\"");

		char m ='��';
		System.out.println(m);

		char n = '\u4e2d';//"��"��Ӧ��Unicode������ 4e2d
		System.out.println(n);
                        
         //������� �ַ���
		//char g ='4e2d';
		//������� �ַ���
		//char g ='u4e2d';
		//ͨ������б��U�������������һ�����ֱ����Unicode����
		char g ='\u4c2d';
        System.out.println("g="+g);
		System.out.println("====================");
        //PS:���ɱ�����ǣ�û�����塣

	    //char���͵�Ĭ��ֵ
		char c10 ='\u0000';
		System.out.print(c10);

         
		//JDK���Դ���native2ascii.exe������Խ�����ת����Unicode������ʽ��
		//��ôʹ��������
		//��������������native2ascii���س���Ȼ����������֮�󼴿ɻ��Unicode���롣
         
		/*
		 ʮ���ƣ�0 1 2 3 4 5 6 7 8 9 10 11 12 13....
		 �����ƣ�0 1 10 11 100 101....
		 ʮ�����ƣ�0 1 2 3 4 5 6 7 8 9 10 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20
	     �˽��ƣ�0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20.....
		 */
	}
}