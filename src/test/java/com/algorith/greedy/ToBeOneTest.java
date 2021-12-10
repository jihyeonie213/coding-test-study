package com.algorith.greedy;

import com.algorithm.greedy.ToBeOne;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ToBeOneTest {

    private static ToBeOne tbo;

    @BeforeAll
    private static void before() {

        tbo = new ToBeOne();
    }

    @Test
    @DisplayName("1이 될 때까지 테스트")
    public void t1() {

        assert(tbo.execute(25, 5) == 2);
    }

    @Test
    @DisplayName("1이 될 때까지 테스트 2")
    public void t2() {

        assert(tbo.execute(161059, 11) == 13);
    }
}
