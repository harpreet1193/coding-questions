package com.example.codingquestions;

import java.math.BigInteger;
import java.util.*;

public class MissingVoters {

    public static long findMissingVoterID(int N, long[] party1, long[] party2) {
        long missingID = 0;
        Map<Long, Integer> countMap = new HashMap<>();
        for (long id : party1) {
            countMap.put(id, countMap.getOrDefault(id, 0) + 1);
        }
        for (long id : party2) {
            countMap.put(id, countMap.getOrDefault(id, 0) - 1);
        }
        for (Map.Entry<Long, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 0) {
                missingID = entry.getKey();
                break;
            }
        }
        return missingID;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int t = 0; t < testCases; t++) {
            int numberOfVoters = scanner.nextInt();
            long[] party1 = new long[numberOfVoters];
            long[] party2 = new long[numberOfVoters - 1];
            for (int i = 0; i < numberOfVoters; i++) {
                party1[i] = scanner.nextLong();
            }
            for (int i = 0; i < numberOfVoters - 1; i++) {
                party2[i] = scanner.nextLong();
            }
            long missingID = findMissingVoterID(numberOfVoters, party1, party2);
            System.out.println(missingID);
        }
    }
}
