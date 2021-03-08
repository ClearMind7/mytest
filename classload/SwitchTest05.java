/*
  假设系统给定考生成绩，请判断该考生的成绩等级：
     1、有效成绩范围：0~100
	 2、考试成绩带有小数
	 3、考试成绩和等级的之间的对照关系：
	   90~100 A
	   80~90  B
	   70~80  C
	   60~70  D
	   0~60   E

	   4、以上需求需用switch语句完成，不能用if。
	   窍门：（int）（成绩/10）
	   0 1 2 3 4 5 6 7 8 9 10

*/
public class SwitchTest05
{
	public static void main(String[]args){
		System.out.println("欢迎使用成绩查询系统");
	 java.util.Scanner s = new java.util.Scanner(System.in);
	   System.out.print("请输入你的成绩");
	   int grade = s.nextInt();
	    //考生成绩

		//转换成int
		grade =(grade/10);

		switch (grade)
		{
		case 9: case 10:
			System.out.println("你的成绩级别为A");
			break;		
		case 8: 
			System.out.println("B");
			break;		
		case 7: 
			System.out.println("C");
			break;		
		case 6: 
			System.out.println("D");
			break;
		default:
            System.out.println("E");
			break;
	
		}
	
	
	
	
	
	
	
	
	
	}
}