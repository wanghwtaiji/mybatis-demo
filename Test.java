 package cn.com.taiji.pad2;

public class Test {

	public static String test1(String x){
		String result = null;
		if(x!=null){
			result = "成功";
		}else{
			return null;
		}
		System.out.println(x+result);
		return result;
	}
	
	public static void main(String[] args) {
		String y = "nihao";
		test1(y);
	}
}
