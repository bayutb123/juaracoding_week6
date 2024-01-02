package com.juaracoding;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // SOAL 1
        printNumbersWithConditions();
        // SOAL 2
        printPattern(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        // SOAL 3
        processTags(":T1:202112SOAL3", ":T2:SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT");
        processTags(":T1:202111SOAL3", ":T2:SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT");
        processTags(":T1:202110SOAL3", ":T2:SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY .DT");
    }

    static void printNumbersWithConditions() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("BIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("BIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    static void printPattern(int[] data) {
        int len = data.length;
        ArrayList<String> result = new ArrayList<>();
        if (len % 2 != 0) {
            for (int i : data) {
                result.add(i % 2 != 0 ? String.valueOf(i) : "_");
            }

            do {
                System.out.println(String.join("", result));
                result.remove(result.size() - 1);
                result.remove(0);
            } while (result.size() > 1);
        } else {
            System.out.println("Jumlah angka genap");
        }
        System.out.println("\n");
    }

    static void processTags(String tag1, String tag2) {
        final int TAG2_START = 0;
        final int TAG2_LENGTH = 4;
        final int TRAILER_LENGTH = 18;
        final int MIN_TAG2_LENGTH = 94;

        if (tag2.length() < MIN_TAG2_LENGTH) {
            System.out.println("Tag2 string should have a minimum length of " + MIN_TAG2_LENGTH + " characters.");
            return;
        }

        String tag2Prefix = tag2.substring(TAG2_START, TAG2_LENGTH);
        String[] tag2t = new String[5];

        int offset = TAG2_LENGTH;
        for (int i = 0; i < tag2t.length; i++) {
            tag2t[i] = tag2.substring(offset, offset + TRAILER_LENGTH);
            offset += TRAILER_LENGTH;
        }

        String result = tag2Prefix + String.join("", tag2t);

        System.out.println(tag1);
        System.out.println(result);
    }
}
