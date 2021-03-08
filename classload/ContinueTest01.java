/*

   continue语句：
     1、continue表示：继续/go on/下一个

	 2、continue也是一个continue关键字加一个分号构成一个单独的完整的java语句，
	 主要出现循环语句当中用来控制循环的执行。

	 3、break和continue的区别？
	    *break表示循环不执行了
		*continue表示直接进入下一次循环继续执行。
      4、continue也有这样的语法：
	    continue 循环名称;【作为了解内容】
*/

public class ContinueTest1
{
	public static void main(String[]args){
                   
		for(int i =0;i<10;i++){
            if(i==5){
				break;
			}
			System.out.println(i);//0 1 2 3 4
		}
			System.out.println("hello world");

			           
		myfor：for(int i =0;i<10;i++){
            if(i==5){
				continue;//continue myfor;//只要这个语句执行 当前本次循环终止 进入下一次循环执行。
			}
			System.out.println(i);//0 1 2 3 4 6 7 8 9 
		}
			System.out.println("hello world");
		


	}
}