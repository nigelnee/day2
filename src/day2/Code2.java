package day2;

public class Code2 {
//计算一天中的毫秒数和微秒数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int与long 类型的转换
		//24默认是int类型,后面计算的值都放入int类型长度的空间中24*60*60*1000，
		//到24*60*60*1000*1000时，int类型内存空间不够，自动截取
		double haomiao = 24L*60*60*1000;
		long weimiao = 24L*60*60*1000*1000;
		System.out.println(weimiao/haomiao);
	}

}
