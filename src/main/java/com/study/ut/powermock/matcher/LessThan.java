package com.study.ut.powermock.matcher;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

public class LessThan<T extends Number> extends BaseMatcher<T> {
    private final T value;

    public LessThan(T value) {
        this.value = value;
    }

    public boolean matches(Object actual) {
        Class<?> clazz = actual.getClass();
        if (clazz == Integer.class) {
            return (Integer) actual < (Integer) value;
        } else if (clazz == Short.class) {
            return (Short) actual < (Integer) value;
        } else {
            throw new RuntimeException("Not support this class " + clazz + " to less than.");
        }
    }

    public static <T extends Number> LessThan<T> lt(T value) {
        return new LessThan<T>(value);
    }

    public void describeTo(Description description) {
        description.appendText("less than compare faile.");

    }
}
