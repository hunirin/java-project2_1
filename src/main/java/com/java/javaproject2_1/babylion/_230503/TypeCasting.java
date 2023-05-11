package com.java.javaproject2_1.babylion._230503;

public class TypeCasting {
    public static void main(String[] args) {
//      자동 형 변환(암묵적인)
//      작은 타입을 큰 타입으로 변환해줌
        System.out.println(1 + "1");
//      강제 형 변환(명시적인)
//      데이터 유실이 생길 수 있음 -> 소수점 이하가 사라짐
        double dVal = 123.456;
        int iVal = (int) dVal;
        System.out.println(iVal);

        System.out.println(1 + Integer.parseInt("1"));
//      그럼 실수는 어떻게? Float, Double
//        Float.parseFloat();
//        Double.parseDouble();

//      과제: 문자열 1.11111111 , 2.11111111 의 합
        // 틀린 답
        String str1 = "1.11111111";
        String str2 = "2.11111111";
        Float result = Float.parseFloat(str1) + Float.parseFloat(str2);
        System.out.println(result);
        // 결과: 3.2222223

        // 옳은 답
        double result2 = Double.parseDouble(str1) + Double.parseDouble(str2);
        System.out.println(result2);
        // 결과: 3.22222222

//      float는 유효자릿수가 7
//      double은 소수점 15자리까지



    }
}
