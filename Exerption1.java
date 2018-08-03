import java.util.Scanner;

//传统方式来处理异常
public class Exerption1 {
	public static void main(String[] args) {
		/*Scanner in=new Scanner(System.in);
		System.out.print("请输入被除数：");
		int num1=in.nextInt();
		System.out.println("请输入除数：");
		int num2=in.nextInt();
		System.out.println(num1+"/"+num2+"="+num1/num2);
		System.out.println("感谢使用本程序！");*/
		
		
		//纠正错误后避免异常
		Scanner in=new Scanner(System.in);
		System.out.print("请输入被除数：");
		int num1=in.nextInt();
		System.out.print("请输入除数：");
		int num2=0;
		if(in.hasNextInt()){
			//录入的是整数
			num2=in.nextInt();
			if(num2==0){
				System.err.println("输入的除数是0，程序退出！");
				System.exit(1);
			}else{
				System.out.println(num1+"/"+num2+"="+num1/num2);
				System.out.println("感谢使用本程序！");
			}
		}else{
			//录入的不是整数
			System.err.println("录入的除数不是整数，程序退出！");
			System.exit(1);
		}
		
		
	}
	

}
