/*

在返回值类型是void的方法中使用return语句。
return语句出现在返回值为void的方法当中主要是为了结束当前方法。

*/
public class MethodTest10
{
	public static void main(String[]args){
	    
	       
	
	}
	//编译错误 对于类型为空的方法 无法返回值
	/*
	public static void m(){
	
	    return 10;
	
	}*/
	public static void m(){
	
	    return;
	
	}
	public static void m(){
	     for (int i = 0;i<10;i++ )
	     {if(i==5){
                return;//不是终止for循环 是终止M方法 break才是终止循环
		 }
		 System.out.println("fff")
	     }
		 System.out.println("ffff")
	    
	
	}

}