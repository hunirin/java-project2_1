package com.java.javaproject2_1.Week4.day1;

import java.util.Scanner;

public class RockPaperScissors {

    public String play(int user, int computer) {

        if(user == 0 && computer == 1) {
            return "win";
            // win
        } else if (user == 1 && computer == 2) {
            return "win";
        } else if (user == 2 && computer == 0) {
            return "win";
        } else if (user == computer) {
            return "tie";
        } else {
            return "lose";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RockPaperScissors rpc = new RockPaperScissors();
        System.out.println(rpc.play(sc.nextInt(), sc.nextInt()));

    }
}
