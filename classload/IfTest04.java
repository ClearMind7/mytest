/*
    
	if语句 
  
*/

public class IfTest04
{
	public static void main(String[]args){
	     
		  boolean sex = true;
		  if (sex)
		  {
			  System.out.println("男");
		  }else{
		   System.out.println("女");
		  }

		  if (sex)
             System.out.println("男");
		     System.out.println("GG");
		  else
			 System.out.println("女");
	
	}
}
/*上边程序错在 22行 之上没有错误 没括号的实际情形是这样的
   if(sex){
	   System.out.println("男");
	   }System.out.println("GG");
	    else{
			System.out.println("女");
		}
		因为中间出现了一个GG 使得前边的if和后边else断了联系成了单独的语句
