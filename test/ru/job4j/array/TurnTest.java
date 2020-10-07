package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArray1() {
        int[] input = {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expect = {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArray2() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expect = {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}