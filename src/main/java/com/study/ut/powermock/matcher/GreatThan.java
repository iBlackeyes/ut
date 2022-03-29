package com.study.ut.powermock.matcher;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;

public class GreatThan<T extends Number> extends BaseMatcher<T> {
    private final T value;

    public GreatThan(T value) {
        this.value = value;
    }

    public boolean matches(Object actual) {
        Class<?> clazz = actual.getClass();
        if (Integer.class == clazz) {
            return (Integer) actual > (Integer) value;
        } else if (Short.class == clazz) {
            return (Short) actual > (Short) value;
        } else {
            throw new RuntimeException("Not support.");
        }
    }

    @Factory
    public static <T extends Number> GreatThan<T> gt(T value) {
        return new GreatThan<T>(value);
    }

    public void describeTo(Description description) {
        description.appendText("not great than.");
    }
}
