
public class Functions {
	public static int faculty(int n){
		int sum=1;
		if(n<0){//�жϴ������Ƿ�Ϊ����
			throw new IllegalArgumentException("n must be positiv!");//�׳�����������쳣
	     }
	     for(int i=1;i<=n;i++){//ѭ��n
	        sum *= i;//ÿѭ��һ�ν��г˷�����
	     }
	        return sum;//���ؽ׳˵�ֵ
	}
	public static void main(String[] args){
		System.out.println("The faculty of 5 is "+faculty(5)+".");
	}
}
