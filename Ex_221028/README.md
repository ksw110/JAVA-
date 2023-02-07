### Ex01_출력 <br>
System.out.println(); 명령어로 콘솔창에 띄울수 있다.<br>
### Ex02_입력 <br>
// 키보드를 통해 (콘솔창을 통해) 데이터를 입력!<br>
// Scanner<br>
// import (불러오기) : 외부에 있는 도구 (라이브러리)를 사용하기 위해 설정<br>
// 문장 완성후 Scanner 자리에 마우스 커서 놓고 import 클릭 또는 sc + Ctrl + Space -> 자동완성<br>
// syso = System.out.println(); ctrl+space 출력 자동완성<br>
Scanner sc = new Scanner(System.in);<br>
		// 입력이기 떄문에 in<br>
	
// sc 안에있는 기능을 사용하겠다 sc.<br>
// 콘솔창에 우리가 입력한 정수를 받아오자!<br>
// Int(자료형) = 정수 (변하는수) int a = 3;<br>
// final(상수) = 한번 넣으면 변하지않는수 final int a = 3;<br>
    
    // 자바 프로그래머들에게 권장하는 규칭
    // 1. 클래스 이름 시작은 대문자
    // 2. 변수 이름의 첫글자는 항상 소문자
    // 3. 상수는 모두 대문자로 표시
    // 4. 변수 이름이 여러 단어로 이루어져 띄어쓰기를 해야하는경우
    // 예) int person_age=20; ,int personAge=20;
    // Ctrl + D = 줄삭제
    // Ctrl + Alt + ↓ or ↑ = 줄복사
    // Alt + ↓ or ↑ = 줄이동
    // Ctrl + f = 단어찾기
    // Ctrl + Shift + f = 띄어쓰기 정렬
### Ex03_변수 <br>
//		 필수적으로 지켜야 하는 규칙<br>
//		 1. 키워드 사용불가<br>
//		 2. 대소문자 구분가능, 제한길이 없음<br>
//		 3. 특수문자 _ , $ 두가지만 사용가능<br>
		<br>
//		 관습<br>
//		 1. 클래스의 이름은 대문자로 시작<br>
//		 2. 변수의 시작은 소문자로 시작<br>
//		 3. 패키지는 소문자로 시작<br>
//		 4. 여러단어로 이루어져 있는경우 <br>
//		 4-1. 띄어쓰기 대신 _ 사용<br>
//		 4-2. 다음 단어의 첫 글자를 대문자로 사용<br>
### Ex05_자료형
    // 1. 논리형
    // boolean : 1bit or 1byte (1과 0)
    // 참 혹은 거짓 (true or false)
    // 1byte = 8bit = 2^8 = 256가지
    
    // 2.문자형
    // char : 2byte = 2^16 = 0 ~ 65,536 가지의 경우의수
    // -> 모든 유니코드 문자 표현 가능
    
    // 3. 정수형
    // byte(-128 ~ 127)
    byte age = 20;
    // short (-32768 ~ 32767)
    short lunch = 7000;
    // int (-21억 ~ 21억)
    int account = 2000000000;
    // long
    long microbe = 1000000000000000l;
    // 숫자 끝에 L 을 입력하여 알려줘야한다 숫자만 입력시 int 로 인식

    // 4.실수형
    // float (소수점) 4byte
    float height = (float) 175.6; // or 175.6f; 가능
    // double 8byte
    double a = 12345646.12345645;

    // 레퍼런스 타입 : 기본 데이터 타입 8개 이외의 타입
    // 자바 책 : 65p
    // 기본변수는 소문자로 시작하지만 레퍼런스는 대문자로 시작한다
    // 문자열을 담는 타입 -> String
### 형변환<br>
// 자동 형변환 , 묵시적 형변환<br>
int num = 5;<br>
double num2 = num;<br>
정수형을 실수형으로 변환하여 5.0으로 출력이됨<br>

// 강제 형변환 , 명시적 형변환<br>
double num3 = 5.6;<br>
int num4 = (int) num3; // 강제적으로 형변환 정수로 바뀌기때문에 소수점은 출력하지않음<br>
byte num1 = 3; // -128 ~ 127 (256가지)
int num2 = 8000;

num1 = (byte) num2;

int num3 = 128; // 256씩 더하기
num1 = (byte) num3;
// 값이 양의 방향으로 넘어가는 현상 : Overflow

int num4 = -129;
num1 = (byte)num4;
// 값이 음의 방향으로 넘어가는 현상 : Underflow

int num5 =30000;
short num6 = 0; // -32768 ~ 32767

num6 = (short)num5; //들어있는 값과는 상관없이, 자료형이 일치하여야함 ->명시적형변환

short num7 = 3;
int num8 = 90000;
num7 = (short)num8;

String num = "10";
//Integer.parseInt("문자열") --> 문자열을 숫자 타입으로 바꿔주세요!
