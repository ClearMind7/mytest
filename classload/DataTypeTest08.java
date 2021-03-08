/*
       关于基本数据类型之间的互相转换：转换规则
	        1、八种基本数据类型当中除布尔类型之外，剩下的七种类型之间都可以互相转换。
			2、小容量向大容量转换，成为自动类型转换，容量从小到大排序：
			   byte<short<int<long<float<double
			        char<
				注：任何浮点类型不管占用多少字节，都比整数型容量大。
			        char和short可表示的种类数量相同，但是char可以取更大正整数。
			byte b;
            int i=b;
            long l=b;
            float f=b;
            double d=b;
            3、大容量转换成小容量，叫做强制类型转换，需要加强制类型转换符，程序才能编译
			通过，但是在运行阶段损失精度，所以谨慎使用。
			4、当整数字面值没有超出byte，short，char取值范围，可以直接赋值给byte，short，char类型的变量。

			5、byte，short、char混合运算的时候，各自先转换成int类型在做运算。

			6、多种数据类型混合运算，先转换成容量最大的那种类型再做运算。
	       
             注意：

			   byte b = 3; 可以编译通过，3没有超出byte类型取值范围

			   int i =10
			   byte b = i/3;编译报错，编译器只检查语法，不会运算i/3
*/
   public class DataTypeTest08
   {
	   public static void main(String[]args){
	     //出现错误，1000超出了byte范围
		 //byte a = 1000;
		 //正确，因为20没有超出byte范围
		 //所以赋值
		 byte a = 20;
		 //变量不能重名
		 //short a = 1000；
		 //正确因为数值1000没有超出short类型的范围
		 //所以赋值正确
		 short b = 1000;
		  //正确，因为默认就是int，并且没有超出int范围
		  int c =1000;
		  //正确，可以自动转换
		  long d = c;

		  int f = 10/3;//整数型没有小数，结果为3
		  double gg = 10/3;//结果3.0,原理是先算出3在转成3.0
		  double GG = 10.0/3; //3.333333333333335
		  //编译的时候只看语法 不进行计算
		  //出现精度损失问题，以下问题主要还是优先级的问题。
		  //将G转换成int，然后又将int类型的g转换成byte,最后byte类型的G和3运算，那么
		  //他的运算结果类型就是int，所以int赋值给byte就出现了精度损失问题
		  long g =10;
		  //byte h =(byte)(int)g/3;
		  //正确
		    byte h =(byte)(int)(g/3);
		  short i =10;
		  byte j =5;
		//错误，short和byte运算，首先会转换成int再运算
		//所以运算结果为int，int赋值给short就会出现精度丢失问题
		//short k = i+j ;
		//可以将运算结果强制转换成short
		short k =(short)(i+j);
		//因为运算结果为 int，所以可以采用int类型接收
		int w =i+j;
		char l ='a';
		System.out.println(l);//a
		//输出结果为97，也就是a的ASCII值
          System.out.println((byte)l);//97
		int m =l+100;
		//输出结果为197，取得a的ascii码值，然后与100进行相加运算
		System.out.println(m);




	   }

   }