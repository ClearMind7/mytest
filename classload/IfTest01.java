/*
   ����java���Ե��е�if��䣬����ѡ��ṹ��if�ֱ���Ϊ��֧���/����������䣺
      1��if�����﷨�ṹ�����ֱ�д��ʽ
	    ��һ�֣�
		   if(�������ʽ)//���ֻ������{
			   java���;
			   java���;
			   java���;
			   java���;
			   java���;
			   .....
			   }
			  �������� ��ִ������������

		 �ڶ��֣� if(�������ʽ){
			        java���;
					 java���;
					 .....
					 }else{
						  java���;
						   java���;
						   ......
						   }
						                  
         �����֣�
		 if(�������ʽ){
			  java���;
			   java���;
			   ....
			   }else if(�������ʽ){
				    java���;
					 java���;
					 ......
					 }else if(�������ʽ){
				    java���;
					 java���;
					 ......
					 }else if(�������ʽ){
				    java���;
					 java���;
					 ......
					 }else if(�������ʽ){
				    java���;
					 java���;
					 ......
					 }.....
		�����֣� if(�������ʽ){
			        java���;
			        java���;
			         ....
			   }else if(�������ʽ){
				    java���;
					 java���;
					 ......
					 }else if(�������ʽ){
				    java���;
					 java���;
					 ......
					 }else{
						 java���
						 java���
						 ....
						 }


			2���ص㣺����java�е�if�����˵��ֻҪ��һ����ִ֧�У�����if���ȫ��������

	        3��ע�⣺���ϵĵڶ��ֱ�д��ʽ�͵����ֱ�д��ʽ������else��֧�������ַ�ʽ���Ա�֤�ٷ�֮�ٻ��з�ִ֧�С�

			4�����еĿ�����䶼�ǿ���Ƕ��ʹ�õġ�ֻҪ����Ƕ�׾��С�
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

			ע�⣺Ƕ��ʹ�õ�ʱ�򣬴����ʽҪ��֤����������������ʱ������������󲿷������ʹ�ô����Ű�Χ����Ҫ��������

			5��if���ķ�֧��ֻ��һ��java���Ļ��������ſ���ʡ�Բ�д��
			  if(true/false){
				  ֻ��һ��java���;
				  }
				=
				if(true/false)һ�����;
				���ַ�ʽ���Ƽ�ʹ�ã�������ôд�ܿ������С�
				 
*/

public class IfTest01
{
	public static void main(String[]args){
          //��������λ�õ��幫�ﷶΧ֮���пϵ»��Ļ���ȥkfc���緹��
          //������
		  double distance = 6.0;//��λkm
		  //�ж����
		  if(distance<5){
			  System.out.print("ȥkfc�Կ����");

		  }
		/*
		 ����
		 ����ϵͳ����һ�������ĳ˻����ɼ����ܴ���С����,�ɼ�Ҫ��Χ0~100
		 ����ѧ���ĳɼ� �жϸ�ѧ���ĳɼ��ȼ�
		   91~100 A
		   81-90  B
		   71~80  C
		   60~ 70 D
		   0~59   E
  �����߼��жϲ���if������ Ӧ����ôд��

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
       

	   //�õ�һ�ַ�ʽҲ����������� ��������Ч�ʽϵͣ�ÿһ��if���ǲ���صģ����Ƕ�����
	   //ÿһ��if�����ж�һ��

	   //�������� �����ֽṹ����ʡ�
	   /*
	   double score = 101;
	   if(score < 0 || score > 100){
		    System.out.print("�Բ������ṩ�Ŀ����ɼ����Ϸ�");
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
          //�±���String�÷�
         double score = 59;
		  String grade = "E";
		  if(score < 0 || score > 100){
		   grade = "�Բ������ṩ�Ŀ����ɼ����Ϸ�";
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