/*在editPlus当中，字体演色为红色的表示一个类的名字，并且是javase类库中自带的。
我们自定义的类，字体颜色是黑色，是标识符
其实javase类库中自带的类。例如：string.class 这些类名也是标识符。
只要是类名就一定是标识符

重点:方法调用的时候，在参数传递的时候，实际上传递的是边连仲保存的那个“值”传过去了
*/

public class MethodTest12
{
     public static void main(String[]args){
	 
	      int a = 10;
		  int b = 20;

		  int k = sumInt(a,b);
		System.out.println("k="+k);
	 
	 }
	 public static int sumInt(int i,int j){
	 
	     int t =i+j;
		 int num = 3;
		int k = divide(t,num);
		 return k; 
	 
	 }
	 public static int divide(int x,int y){
	 
	      int z =x/y;
		  return z;
	 
	 
	 }

}

/*
画图依据：
   1、只要涉及到参数传递的问题，传递的是变量中保存的值
   2、画图的时候，必须遵循自上而下的顺序依次执行。
   //局部变量只在当前方法有效

*/