package com.juaracoding;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        soal1();
        soal2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    static void soal1() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("BIZZBUZZ");
            } else if (i % 3 == 0 ) {
                System.out.println("BIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else  {
                System.out.println(i);
            }
        }
    }

    static void soal2(int[] data) {
        int len = data.length;
        ArrayList<String> result = new ArrayList<>();
        if (len % 2 != 0) {
            for (int i : data) {
                if (i % 2 != 0) {
                    result.add(String.valueOf(i));
                } else {
                    result.add("_");
                }
            }

            do {
                for (String s : result) {
                    System.out.print(s);
                }
                result.remove(result.size() - 1);
                result.remove(0);
                System.out.println();
                if (result.size() == 1) {
                    for (String s : result) {
                        System.out.print(s);
                    }
                }
            } while (result.size() > 1);
        } else {
            System.out.println("Jumlah angka genap");
        }
    }
}
