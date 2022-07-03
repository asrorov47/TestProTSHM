package com.example.testprotshm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestProTShM {


    public static boolean tup(int x) {
        int S = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                S++;
            }
        }
        return S == 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int S = 1;
        for (int i = 0; i < n; i++) {
            if (tup(list.get(i))) {
                S *= list.get(i);
            }
        }

        while (S > 0){
            int t = S % 10;
            S /= 10;
            list1.add(t);
        }
        int count = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == 0){
                count++;
            }
        }
        System.out.println(count);


    }
}


