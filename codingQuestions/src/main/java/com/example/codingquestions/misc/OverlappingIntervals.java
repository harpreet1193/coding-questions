package com.example.codingquestions.misc;

import java.util.Scanner;

public class OverlappingIntervals {

    static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean overlaps(Interval other) {
            return this.start <= other.end && other.start <= this.end;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L1 = scanner.nextInt();
        int R1 = scanner.nextInt();
        int L2 = scanner.nextInt();
        int R2 = scanner.nextInt();
        Interval interval1 = new Interval(L1, R1);
        Interval interval2 = new Interval(L2, R2);
        if (interval1.overlaps(interval2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
