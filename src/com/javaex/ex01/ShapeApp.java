package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		Shape sr1 = new Ractangle("빨강", 12, 10);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		//sr1의 가로크기 출력
		sr1.val();
	}
}

	
	