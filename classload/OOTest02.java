/*

测试类

*/
public class  OOTest02
{
	public static void main(String[]args){
	
	     //创建user对象
		 //u是一个局部变量
		 //u是一个引用
		 //u保存内存地址指向堆内存user对象
		 User u = new User();
	  
         //输出user内部对象内部实际变量的值
	     System.out.println(u.no);
		 System.out.println(u.name);
		 System.out.println(u.addr);

		 //修改User对象内部的值
		 u.no = 110;
	     u.name = "jack";
		 u.addr = new Address();

		 //在main方法当中目前只能看到一个引用u
		 //一切都是只能通过u来进行访问
		 System.out.println(u.name+"居住在哪个城市："+u.addr.city);
		 System.out.println(u.name+"居住在哪个街道："+u.addr.street);
		 System.out.println(u.name+"邮编："+u.addr.zipcode);

		 u.addr.city = "北京";
		 u.addr.street = "朝阳";
		 u.addr.zipcode = "11111111";

		 System.out.println(u.name+"居住在哪个城市："+u.addr.city);
		 System.out.println(u.name+"居住在哪个街道："+u.addr.street);
		 System.out.println(u.name+"邮编："+u.addr.zipcode);
		 
		 
	}      
	
}

