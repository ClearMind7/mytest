/*


*/
public class MethodTest05
{
	public static void main(String[]args){
	      
		  //编译错误 参数数量不同
		  //MethodTest05.sum();

         //存在自动类型转换int--->long
         MethodTest05.sum(10,20);
        //参数不对应
		//MethodTest05.sum(10.0,20);

		//OK
		MethodTest05.sum(（long）10.0,20);

	}
	public static void sum(long a,long b){
         System.out.println(a+"+"+b+"="+(a+b));
	}
}