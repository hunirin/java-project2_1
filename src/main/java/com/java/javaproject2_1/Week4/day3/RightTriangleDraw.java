package com.java.javaproject2_1.Week4.day3;

/*
 >> 최초의 코드
  : main에서 하지 않아야 할 구체적인 연산 작업, 출력, 반복이 모두 들어 있습니다.
public class RightTriangleDraw {
    public static void main(String[] args) {
        int h = 5;
        for (int i = 1; i <= h; i++) {
            System.out.printf("%s%s\n", "0".repeat(h - i), "*".repeat(2 * i - 1));
        }
    }
}
*/

public class RightTriangleDraw {
    public void printShape() {
        int h = 5;
        for (int i = 1; i <= h; i++) {
            System.out.printf("%s%s\n", "0".repeat(h - i), "*".repeat(2 * i -1));
        }
    }
    // main에서 인스턴스 생성과 호출만 하도록 변경
    public static void main(String[] args) {
        RightTriangleDraw rtd = new RightTriangleDraw(); // 생성
        rtd.printShape(); // 호출
    }
}
