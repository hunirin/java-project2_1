package com.java.javaproject2_1.Week4.day5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamReaderEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("hospital_info_0920_euckr.csv"), "EUC-KR"));
        System.out.println(br.readLine());
    }
}


