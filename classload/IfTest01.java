/*
   关于java语言当中的if语句，属于选择结构，if又被称为分支语句/条件控制语句：
      1、if语句的语法结构：四种编写方式
	    第一种：
		   if(布尔表达式)//结果只有真或假{
			   java语句;
			   java语句;
			   java语句;
			   java语句;
			   java语句;
			   .....
			   }
			  条件成立 才执行括号里的语句

		 第二种： if(布尔表达式){
			        java语句;
					 java语句;
					 .....
					 }else{
						  java语句;
						   java语句;
						   ......
						   }
						                  
         第三种：
		 if(布尔表达式){
			  java语句;
			   java语句;
			   ....
			   }else if(布尔表达式){
				    java语句;
					 java语句;
					 ......
					 }else if(布尔表达式){
				    java语句;
					 java语句;
					 ......
					 }else if(布尔表达式){
				    java语句;
					 java语句;
					 ......
					 }else if(布尔表达式){
				    java语句;
					 java语句;
					 ......
					 }.....
		第四种： if(布尔表达式){
			        java语句;
			        java语句;
			         ....
			   }else if(布尔表达式){
				    java语句;
					 java语句;
					 ......
					 }else if(布尔表达式){
				    java语句;
					 java语句;
					 ......
					 }else{
						 java语句
						 java语句
						 ....
						 }


			2、重点：对于java中的if语句来说，只要有一个分支执行，整个if语句全部结束。

	        3、注意：以上的第二种编写方式和第四种编写方式都带有else分支，这两种方式可以保证百分之百会有分支执行。

			4、所有的控制语句都是可以嵌套使用的。只要合理嵌套就行。
			 if(){
				 if(){
					 if(){
					 }
			 }
					 }else{
						 if(){

						 }else{
                            if(){
						       if(){
						 
						 }
					 }
				 }
			}

			注意：嵌套使用的时候，代码格式要保证完美。【该缩进的时候必须缩进，大部分情况下使用大括号包围的需要缩进。】

			5、if语句的分支中只有一条java语句的话，大括号可以省略不写。
			  if(true/false){
				  只有一条java语句;
				  }
				=
				if(true/false)一条语句;
				这种方式不推荐使用，别人这么写能看懂就行。
				 
*/

public class IfTest01
{
	public static void main(String[]args){
          //需求：所在位置的五公里范围之内有肯德基的话，去kfc吃午饭。
          //公里数
		  double distance = 6.0;//单位km
		  //判断语句
		  if(distance<5){
			  System.out.print("去kfc吃开封菜");

		  }
		/*
		 需求：
		 假设系统给定一个考生的乘积，成绩可能带有小数点,成绩要求范围0~100
		 根据学生的成绩 判断该学生的成绩等级
		   91~100 A
		   81-90  B
		   71~80  C
		   60~ 70 D
		   0~59   E
  以上逻辑判断采用if语句完成 应该怎么写。

      */
	  /*
	   double score = 59;
	   if ( score > 90.0 ){
	      System.out.print("A");
	    }else if( score > 80.0){
		  System.out.print("B");
		}else if( score > 70.0){
		  System.out.print("C");
		}else if( score > 60.0){
          System.out.print("D");
		}else{
		  System.out.print("E");
		}
		*/
       

	   //用第一种方式也可以完成需求 但是这样效率较低，每一个if都是不相关的，都是独立的
	   //每一个if都会判断一次

	   //根据需求 第四种结构最合适。
	   /*
	   double score = 101;
	   if(score < 0 || score > 100){
		    System.out.print("对不起，您提供的考生成绩不合法");
		}else if(score > 90 ){
			System.out.print("A");
		}else if( score > 80.0){
		    System.out.print("B");
		}else if( score > 70.0){
		    System.out.print("C");
		}else if( score > 60.0){
            System.out.print("D");
		}else{
		    System.out.print("E");
		}
		*/
          //下边是String用法
         double score = 59;
		  String grade = "E";
		  if(score < 0 || score > 100){
		   grade = "对不起，您提供的考生成绩不合法";
		}else if(score > 90 ){
			grade = "A";
		}else if( score > 80.0){
		    grade = "B";
		}else if( score > 70.0){
		    grade = "C";
		}else if( score > 60.0){
            grade = "D";
			
		}
		System.out.println(grade);
	}
}