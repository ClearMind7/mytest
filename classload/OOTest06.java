/*

       需求：
	      定义一个学生类
		   *姓名
		   *学号
		   *学生有一台笔记本电脑 

		  定义一个计算机类
           *型号
		   *品牌
		   *颜色
     
	 让其中的一个学生去使用其中的一台笔记本电脑

	  然后编译并运行，画图。
*/
public class OOTest06
{
	public static void main(String[]args){
		
		Computer c = new Computer();
		c.xinghao = "寂夜二号B型";
		c.pinpai = "联想";
        c.yanse = "黑色";

		Xuesheng kami = new Xuesheng();
		kami.xingming = "夜神月";
		kami.xuehao = 4563214;
		kami.note = c; 
	   
	
		System.out.println(kami.note.pinpai);

		kami.note = new Computer();//必杀！
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