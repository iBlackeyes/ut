package com.study.ut.powermock.matcher;

import org.junit.Test;

import static com.study.ut.powermock.matcher.GreatThan.gt;
import static com.study.ut.powermock.matcher.LessThan.lt;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreatThanTest {
    @Test
    public void test() {
        assertThat(10 ,gt(5));
        assertThat(10 ,lt(11));
    }

}