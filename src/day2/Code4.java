package day2;

public class Code4 {

	public static void main(String[] args) {
		// 输入一个成绩，判断该成绩是否符合标准  A B C D E F 
		if(args.length == 0 ){
			System.out.println("忘记输入成绩！");
			//break;//终止
			return;
		}
		//得到输入成绩
		String number = args [0];
		//int num = Integer.parseInt(number);
		char c = number.charAt(0);
		//把B字符串类型转换为B字符类型
		//char c = number.charAt(0);
		//'B'
		
		switch(c){
		case 'A':
					
		
			System.out.println("90-100");
			break;
			
		case 'B':
			System.out.println("80-90");
			break;
		
		case 'C':
			System.out.println("70-80");
			break;

		case 'D':
			System.out.println("60-70");
			break;
			
		default:
			System.out.println("<60");
			break;
		
		}
	}

}
