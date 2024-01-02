package com.juaracoding;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        soal1();
        soal2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        soal3(":T1:202112SOAL3", ":T2:SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT");
        soal3(":T1:202111SOAL3", ":T2:SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT");
        soal3(":T1:202110SOAL3", ":T2:SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY .DT");
    }

    static void soal1() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("BIZZBUZZ");
            } else if (i % 3 == 0 ) {
                System.out.println("BIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }
        System.out.println();
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
        System.out.println("\n");
    }

    static void soal3(String tag1, String tag2) {
        if (tag2.length() < 94) {
            throw new IllegalArgumentException("Tag2 string should have a minimum length of 94 characters.");
        }

        final int TAG2_START = 0;
        final int TAG2T1_START = 4;
        final int TAG2T2_START = 22;
        final int TAG2T3_START = 40;
        final int TAG2T4_START = 58;
        final int TAG2T5_START = 76;
        final int TAG2_LENGTH = 4;
        final int TRAILER_LENGTH = 18;

        String tag2Prefix = tag2.substring(TAG2_START, TAG2_LENGTH);
        String tag2t1 = tag2.substring(TAG2T1_START, TAG2T1_START + TRAILER_LENGTH);
        String tag2t2 = tag2.substring(TAG2T2_START, TAG2T2_START + TRAILER_LENGTH);
        String tag2t3 = tag2.substring(TAG2T3_START, TAG2T3_START + TRAILER_LENGTH);
        String tag2t4 = tag2.substring(TAG2T4_START, TAG2T4_START + TRAILER_LENGTH);
        String tag2t5 = tag2.substring(TAG2T5_START, TAG2T5_START + TRAILER_LENGTH);

        String result = tag2Prefix + tag2t3 + tag2t4 + tag2t5 + tag2t1 + tag2t2;

        System.out.println(tag1);
        System.out.println(result);
    }

}
