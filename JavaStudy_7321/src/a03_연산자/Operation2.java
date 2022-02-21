package a03_연산자;

public class Operation2 {

	public static void main(String[] args) {
		int num1=10;
		int num2=30;
		int dan=2,num=1;
		int result=dan*num;
		int year = 2022;
		int month = 2;
		int day = 21;
		
		System.out.println(dan+"X"+num+"="+result);
		
		System.out.println(num1+(num2++));
		System.out.println(num2);
		System.out.println((++year)+"년 "+(++month)+"월 "+(++day)+"일");
		//정수형 변수 dan=2
		//2x1 = 2
	}

}
