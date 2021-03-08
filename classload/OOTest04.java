public class OOTest04
{
	public static void main(String[]args){
	
	      //创建一个丈夫对象
		  Husband GGG = new Husband();
		  GGG.name = "康司";
		  //创建一个妻子对象
		  wife baby = new wife();
		  baby.name = "瑛莉";

          //结婚【能通过丈夫找到妻子，通过妻子能找到丈夫】
		  GGG.w = baby;
		  baby.h = GGG;

		  //得到以上ggg的妻子的名字
		  u.g(GGG.name+"的妻子的名字叫"+GGG.w.name);
		  u.g(GGG.name+"的妻子的名字叫"+baby.name);
	
	}
}