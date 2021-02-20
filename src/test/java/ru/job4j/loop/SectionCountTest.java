package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SectionCountTest {

    @Test
    public void when11() {
        assertThat(SectionCount.count(1, 1), is(1));
    }

    @Test
    public void when21() {
        assertThat(SectionCount.count(2, 1), is(2));
    }

    @Test
    public void when32() {
        assertThat(SectionCount.count(3, 2), is(1));
    }

    @Test
    public void when42() {
        assertThat(SectionCount.count(4, 2), is(2));
    }
}