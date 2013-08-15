package day2;

public class Code3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 交换两个变量值 
		int leftHand = 10;
		int rightHand = 8;
		//方法一，定义第三个变量，交换
		System.out.println("交换前，leftHand"+leftHand+"  "+"rightHand"+rightHand);
		int t = 0 ;
		t = leftHand;
		leftHand = rightHand;
		rightHand = t;
		System.out.println("交换后，leftHand"+leftHand+"  "+"rightHand"+rightHand);
		//方法二，不定义第三个量，用加减法
		leftHand = leftHand + rightHand;
		rightHand = leftHand - rightHand;
		leftHand = leftHand - rightHand;
		System.out.println("交换后，leftHand"+leftHand+"  "+"rightHand"+rightHand);
		//方法三，不定义第三个变量，用异或
		leftHand = leftHand ^ rightHand;
		rightHand = leftHand ^ rightHand;
		leftHand = leftHand ^ rightHand;
		System.out.println("交换后，leftHand"+leftHand+"  "+"rightHand"+rightHand);
		
	}

}

