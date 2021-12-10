package com.algorithm.greedy;

import java.util.Arrays;
import java.util.Collections;

public class NumberCard {

    /**
     * @param n 행의 개수
     * @param m 열의 개수
     * @param cards 숫자 카드 배열
     * @return 가장 큰 숫자
     */
    public int execute(int n, int m, Integer[][] cards) {

        int answer = 0;

        for (Integer [] line : cards) {
            answer = Math.max(answer, Collections.min(Arrays.asList(line)));
        }

        return answer;
    }
}
