/*
    
         关于布尔型数据类型：
		      boolean（发音布林bu一声）

		在java语言当中 boolean只有两个值：true false，没有其他值。
		不像C语言当中，0和1可以表示假和真。

		在底层存储的时候boolean类型占用一个字节，因为实际存储的时候false底层是0.
		true底层是1。

		布尔类型在实际开发当中非常重要，经常使用在逻辑运算和条件控制语句当中。


*/

public class DataTypeTest07
{
	public static void main(String[]args){

		//不兼容的类型 编译错误
	     //boolean flag =1;

		 boolean loginSuccess = true;//或者flase

		 //if语句以后讲 【条件控制语句】
		 if(loginSuccess){
			 System.out.println("恭喜你，登录成功");
          }else{
				 System.out.println("对不起，用户名不存在或密码错误！");
		  }

	}
}