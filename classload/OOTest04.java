public class OOTest04
{
	public static void main(String[]args){
	
	      //����һ���ɷ����
		  Husband GGG = new Husband();
		  GGG.name = "��˾";
		  //����һ�����Ӷ���
		  wife baby = new wife();
		  baby.name = "����";

          //��顾��ͨ���ɷ��ҵ����ӣ�ͨ���������ҵ��ɷ�
		  GGG.w = baby;
		  baby.h = GGG;

		  //�õ�����ggg�����ӵ�����
		  u.g(GGG.name+"�����ӵ����ֽ�"+GGG.w.name);
		  u.g(GGG.name+"�����ӵ����ֽ�"+baby.name);
	
	}
}