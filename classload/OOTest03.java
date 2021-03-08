public class OOTest03
{
	public static void main(String[]args){
	
	    User d = new User();

		//上一个版本写的
		//u.addr = new Address();

      //a是引用
	  //a是局部变量
		Address a = new Address();
		d.addr = a;
        
		a.city = "天津";
		u.g(a.city);
	        
	
	}
}