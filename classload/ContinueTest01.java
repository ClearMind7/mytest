/*

   continue��䣺
     1��continue��ʾ������/go on/��һ��

	 2��continueҲ��һ��continue�ؼ��ּ�һ���ֺŹ���һ��������������java��䣬
	 ��Ҫ����ѭ����䵱����������ѭ����ִ�С�

	 3��break��continue������
	    *break��ʾѭ����ִ����
		*continue��ʾֱ�ӽ�����һ��ѭ������ִ�С�
      4��continueҲ���������﷨��
	    continue ѭ������;����Ϊ�˽����ݡ�
*/

public class ContinueTest1
{
	public static void main(String[]args){
                   
		for(int i =0;i<10;i++){
            if(i==5){
				break;
			}
			System.out.println(i);//0 1 2 3 4
		}
			System.out.println("hello world");

			           
		myfor��for(int i =0;i<10;i++){
            if(i==5){
				continue;//continue myfor;//ֻҪ������ִ�� ��ǰ����ѭ����ֹ ������һ��ѭ��ִ�С�
			}
			System.out.println(i);//0 1 2 3 4 6 7 8 9 
		}
			System.out.println("hello world");
		


	}
}