package com.algorithm.greedy;

public class ToBeOne {

    /**
     * @param n
     * @param k
     * @return
     */
    public int execute(int n, int k) {

        int answer = 0;

        // 1. n이 k의 배수가 아닐 경우, k의 배수 만들기
        while (n % k != 0) {
            n--;
            // 연산 횟수 추가
            answer++;
        }

        System.out.printf("n 확인 : %s%n", n);

        // 2. 1의 작업으로 n이 k의 배수가 되었으므로 나눠주기
        do {
            n = n / k;
            // 연산 횟수 추가
            answer++;

        } while (n != 1);
        System.out.printf("n 확인 : %s", n);

        return answer;
    }
}
