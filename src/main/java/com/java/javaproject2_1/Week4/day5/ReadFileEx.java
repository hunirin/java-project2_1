package com.java.javaproject2_1.Week4.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    LineReader lineReader;
    Charset charset;

    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        // BufferedReader 선언 -> File 연결
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        // BufferedReadr에서 Loop로 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        return lines;
    }

    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
        List<String> strLines = rfe.getLines("hospital_info_10lines.csv");
        System.out.println(strLines.get(0));

    }
}
