package a01_HelloJava;

import java.util.Scanner;

/**
 * 
 * @author ehgns
 * 여러줄 주석(클래스 또는 메소드를 설명하는 주석)
 */
/*"문자열" '문자'
 * 여러줄 주석(여러줄 메모용
 * 이름:김도훈
 * 연락처: 010-6435-7321
 * 주소:부산 부산진구 부암동
 */
//한줄 주석

//주석의 단축키 Ctrl+ 프로그램 실행(Run) 단축키 Ctrl+F11/
public class HelloJava {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int A=scanner.nextInt();
		int B=scanner.nextInt();
		int C=scanner.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		
	}
}