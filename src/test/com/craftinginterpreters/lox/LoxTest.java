package com.craftinginterpreters.lox;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoxTest {
    @Test
    public void TestNothing() {
        assertThat(1, is(equalTo(2)));
    }
}