package com.java.javaproject2_1.Week3.day1;

public class NewSwitchCaseClinicHours {
    public static void main(String[] args) {
        String day = "월";
        String time = switch (day) {
            case "월", "화", "목", "금" -> "09:30 - 18:30";
            case "토" -> "09:30 - 13:00";
            case "수", "일" -> "휴진";
            default -> "잘못입력하였습니다.";
        };
        System.out.println(day + "요일은 " + time + "입니다.");
    }
}
