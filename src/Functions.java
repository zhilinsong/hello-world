
public class Functions {
	public static int faculty(int n){
		int sum=1;
		if(n<0){//判断传入数是否为负数
			throw new IllegalArgumentException("n must be positiv!");//抛出不合理参数异常
	     }
	     for(int i=1;i<=n;i++){//循环n
	        sum *= i;//每循环一次进行乘法运算
	     }
	        return sum;//返回阶乘的值
	}
	public static void main(String[] args){
		System.out.println("The faculty of 5 is "+faculty(5)+".");
	}
}
