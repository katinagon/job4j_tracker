package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactTest {
    @Test
    public void whenExceptionMinus2() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Fact().calc(-2);
                });
        assertThat(exception.getMessage()).isEqualTo("N could not be less then 0");
    }

    @Test
    public void whenExceptionMinus10() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Fact().calc(-10);
                });
        assertThat(exception.getMessage()).isEqualTo("N could not be less then 0");
    }
}