package day2;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lefthand = 10;
		int righthand = 8;
		System.out.println("互换前手中的纸牌：\n 左手中的纸牌：" + lefthand + "\n 右手中的纸牌："
				+ righthand);

		lefthand = lefthand + righthand;
		righthand = lefthand - righthand;
		lefthand = lefthand - righthand;
		System.out.println("互换后手中的纸牌\n 左手中的纸牌：" + lefthand + "\n 右手中的纸牌："
				+ righthand);

	}

}
