package com.algorithm.greedy;

import java.util.Arrays;

public class BigNum {

    /**
     * @param n numbers의 개수
     * @param m 총 더하기 횟수
     * @param k 동일한 숫자의 연속 더하기 횟수
     * @param numbers
     * @return
     */
    public int execute (int n, int m, int k, Integer[] numbers) {

        // start, end : 시간복잡도 계산용
        long start = System.currentTimeMillis();

        int answer = 0;

        Arrays.sort(numbers); // 숫자 배열 정렬

        int first = numbers[n - 1]; // 가장 큰 수
        int second = numbers[n - 2]; // 두번째 큰 수

        do {

            // 가장 큰 수를 k번 더하기
            for (int j = 0; j < k; j++) {

                if (m == 0) break;
                answer += first;
                m--;
            }
            if (m > 0) {
                answer += second; // 두번째 큰 수를 한번 더하기(중간에 이음새 개념으로 한 번만 더해 주면 됨)
                m--;
            }

        } while (m > 0);

        long end = System.currentTimeMillis();
        System.out.println("소요시간 : " + (end - start)/1000.0);

        return answer;
    }
}
