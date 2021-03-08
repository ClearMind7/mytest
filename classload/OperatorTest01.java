/*
   关于java变成运算符值：算术运算符
     +      求和
	 -      相减
	 *      乘积
	 /      商
	 %      求余数【取模】

	 ++     自加1
	 --     自减1
     
注意：一个表达式当中有多个运算符，运算符有优先级，不确定就加括号，优先级得到提升。
      没有必要去专门记忆运算符的优先级。
*/

public class OperatorTest01
{
	public static void main(String[]args){
	      
		  int i = 10;
		  int j = 3;
		
		System.out.println(i+j);//13
		System.out.println(i-j);//7
		System.out.println(i*j);//30
		System.out.println(i/j);//3
		System.out.println(i%j);//1
         
		//以下以++为例，--运算符自学！
		//关于++运算符【自加1】
		int k =10;

		//++运算符可以出现在变量后边，最变量进行自加1操作。【单目运算符】

		k++;
		System.out.println(k);

		int y = 10;

		//++运算符可以出现在变量前边【单目运算符】 变量前后结果都会自加1
		++ y;
		System.out.println(y);

		//++运算符可以出现在变量前，也可以出现在变量后，无论变量前还是后。
		//只要++运算结束，该变量中的值一定会自加1
		
		//++出现在变量后
		//规则：先做赋值运算，再对变量中保存的值进行自加1

		int a =100;
		int b =a++;
		System.out.println(a);//101
		System.out.println(b);//100
        
		//++出现在变量前
		//规则：先进行自加1运算，再赋值。
		int m = 20;
		int n =++m;
		System.out.println(m);//21
        System.out.println(n);//21


		int xx = 500;
		System.out.println(xx);
		//sun公司提供的输出源代码是这样的
			//int x = xx（即你输出的字符）
           //如果你输出的字符为xx ++
		/*   int x = xx++
		这样输出就会变成
			   System.out.println(xx++);//500
		       System.out.println(xx);//501
     */
	//System.out.println(--xx);//500
	//System.out.println(xx++);//500
	//System.out.println(xx--);//501
	//System.out.println(xx--);//500
	//System.out.println(xx--);//499
    //System.out.println(xx);//498



	}
}