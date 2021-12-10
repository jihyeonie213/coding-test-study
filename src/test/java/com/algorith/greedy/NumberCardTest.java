package com.algorith.greedy;

import com.algorithm.greedy.NumberCard;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberCardTest {

    private static NumberCard nc;

    @BeforeAll
    private static void before() {

        nc = new NumberCard();
    }

    @Test
    @DisplayName("숫자 카드 게임 테스트")
    public void t1() {

        Integer[][] cards = {{3, 1, 2}, {4, 1, 4}, {2, 2, 2}};
        assert(nc.execute(cards.length, cards[0].length, cards) == 2);

    }

    @Test
    @DisplayName("숫자 카드 게임 테스트 2")
    public void t2() {

        Integer[][] cards = {{7, 3, 1, 8}, {3, 3, 3, 4}};
        assert(nc.execute(cards.length, cards[0].length, cards) == 3);

    }

    @Test
    @DisplayName("숫자 카드 게임 테스트 3")
    public void t3() {

        // TODO 랜덤 배열 만드는 로직을 만들어 보자 (1 <= card <= 10000)
        Integer[][] cards = {{37, 54, 21, 54}, {60, 60, 93, 10}, {23, 75, 55, 81}, {70, 61, 70, 61}, {40, 40, 98, 51}}; // 21, 10, 23, 61, 40 => 61
        assert(nc.execute(cards.length, cards[0].length, cards) == 61);

    }
}
