package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int result = Fitness.cacl(95, 90);
        assertThat(result, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        int result = Fitness.cacl(90, 95);
        assertThat(result, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        int result = Fitness.cacl(50, 90);
        assertThat(result, is(2));
    }

    @Test
    public void whenIvanEqualNik() {
        int result = Fitness.cacl(90, 90);
        assertThat(result, is(1));
    }
}