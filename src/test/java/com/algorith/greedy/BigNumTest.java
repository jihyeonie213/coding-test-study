package com.algorith.greedy;

import com.algorithm.greedy.BigNum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BigNumTest {

    private static BigNum bn;

    @BeforeAll
    private static void before() {

        bn = new BigNum();
    }

    @Test
    @DisplayName("그리디 알고리즘 테스트 기본")
    public void t1() {

        assert(bn.execute(5, 8, 3, new Integer[]{2, 4, 5, 4, 6}) == 46);
    }

    @Test
    @DisplayName("그리디 알고리즘 테스트")
    public void t2() {

        // 1. 가장 큰 숫자 k개와 두번째 큰 숫자 1개 한 세트 : 8 + 1(두번째 작은 숫자의 더하기 횟수) = 9
        // 2. 숫자의 총 합산 횟수 m / (1)에서 계산한 한 세트의 수 : 100 / 9 = 11 + 1
        // 3. 11개 세트를 만들고 가장 큰 숫자를 1번 더 더해주면 된다.
        // ( 8 * 8 + 5 ) * 11 + 8 = 767
        assert(bn.execute(4, 100, 8, new Integer[]{3, 8, 4, 5}) == 767);

    }
}
