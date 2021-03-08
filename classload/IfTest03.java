/*
    需求：
	   判断当前的天气：
	       当外边下雨的时候：
		      带雨伞：
			     判断性别：
				    当性别为男：带一把大黑伞
					当性别为女：带一把小花伞

		   当外边是晴天的时候：
		        判断天气的温度
				   当天气温度在30度以上：
				       当性别为男：带墨镜
					   当性别为女：擦防晒霜
         
		 提示：
		   一定会用到嵌套
		   天气状况、温度、性别、都需要从键盘输入。
		    天气状况：1表示下雨、0表示晴天
			 性别 1表示男 0表示女
*/
/*
public class IfTest03
{
	public static void main(String[]args){

	     java.util.Scanner s = new java.util.Scanner(System.in);
		 System.out.print("请输入天气状况，1为雨天，0为晴天");
		   int num = s.nextInt();
		
		  if (num == 1)
		  {  java.util.Scanner b = new java.util.Scanner(System.in);
		     System.out.print("请输入您的性别,1为男，0为女");
		       int sex = b.nextInt();
			  if (sex == 1)
			  {
				  System.out.println("带一个大黑伞");
			  }else if (sex == 0)
			  {
				  System.out.println("带一个花伞");
			  }
		  }else if (num == 0)
		  { java.util.Scanner w = new java.util.Scanner(System.in);
		     System.out.print("请输入天气的温度");
		       int k = w.nextInt();
			  if (k<30)
			  {
				  System.out.println("正常出门");
			  }
			  if (k>=30)
			  {   java.util.Scanner b = new java.util.Scanner(System.in);
		           System.out.print("请输入您的性别,1为男，0为女");
		          int sex = b.nextInt();
				  if (num == 1)
				  {
					  System.out.println("戴一个墨镜");
				  }else if (num == 0)
				  {
                     System.out.println("擦防晒霜");
				  }
				  
			  }

		  }

         
	
	}
}*/
public class IfTest03
{
	public static void main(String[]args){
              java.util.Scanner b = new java.util.Scanner(System.in);//标准答案 这样 可以方便一些
		           System.out.print("请输入您的性别,1为男，0为女");
		          int sex = b.nextInt();
	     java.util.Scanner s = new java.util.Scanner(System.in);
		 System.out.print("请输入天气状况，1为雨天，0为晴天");
		   int num = s.nextInt();
		
		  if (num == 1)
		  {  
			  if (sex == 1)
			  {
				  System.out.println("带一个大黑伞");
			  }else if (sex == 0)
			  {
				  System.out.println("带一个花伞");
			  }else{
				        System.out.print("您输入的数值不合法");
			  }
		  }else if (num == 0)
		  { java.util.Scanner w = new java.util.Scanner(System.in);
		     System.out.print("请输入天气的温度");
		       int k = w.nextInt();
			  if (k<30)
			  {
				  System.out.println("正常出门");
			  }
			  if (k>=30)
			  { 
				  if (sex == 1)
				  {
					  System.out.println("戴一个墨镜");
				  }else if (sex == 0)
				  {
                     System.out.println("擦防晒霜");
				  }else{
				        System.out.print("您输入的数值不合法");
				  }
				  
			  }

		  }

         
	
	}
}