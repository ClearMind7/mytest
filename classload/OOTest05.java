
//���Գ���
public class OOTest05
{
	public static void main(String[]args){
	
	    Customer c = new Customer();
		u.g(c.id);

		c = null;
		//���³�����Ա���ͨ������Ϊ�����﷨
		//�����÷���ʵ����ص�����һ������ֿ�ָ���쳣
		//java.lang.NullPointerException
	    u.g(c.id);	
	
	}
}


//ʵ����ص����ݱ�ʾ��������ݷ��ʵ�ʱ������ж���Ĳ��룬
//�������ݾ���ʵ����ص�����