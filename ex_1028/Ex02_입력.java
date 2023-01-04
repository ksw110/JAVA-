package ex_1028;

import java.util.Scanner;

public class Ex02_입력 {

	public static void main(String[] args) {

		// 키보드를 통해 (콘솔창을 통해) 데이터를 입력!
		// Scanner

		// import (불러오기) : 외부에 있는 도구 (라이브러리)를 사용하기 위해 설정
		// 문장 완성후 Scanner 자리에 마우스 커서 놓고 import 클릭 또는 sc + Ctrl + Space -> 자동완성
		// syso = System.out.println(); ctrl+space 출력 자동완성

		Scanner sc = new Scanner(System.in);
		// 입력이기 떄문에 in
	

		// sc 안에있는 기능을 사용하겠다 sc.
		// 콘솔창에 우리가 입력한 정수를 받아오자!
		// Int(자료형) = 정수 (변하는수) int a = 3;
		// final(상수) = 한번 넣으면 변하지않는수 final int a = 3;

		// 자바 프로그래머들에게 권장하는 규칭
		// 1. 클래스 이름 시작은 대문자
		// 2. 변수 이름의 첫글자는 항상 소문자
		// 3. 상수는 모두 대문자로 표시
		// 4. 변수 이름이 여러 단어로 이루어져 띄어쓰기를 해야하는경우
		// 예) int person_age=20; ,int personAge=20;

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		// 문자열 일때 next //int 뺴야함

		System.out.println("입력한 정수 : " + num);

	}

}
