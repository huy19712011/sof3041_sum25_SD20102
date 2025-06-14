package org.example.sof3041_sum25_sd20102.exceptions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JUnit5TestExceptions {

    @Test
    @DisplayName("Exceptions test")
    void test() {
        String str = null;
        //str.toUpperCase();
        assertThrows(NullPointerException.class, () -> {
            System.out.println("Check exception");
            str.toUpperCase();
        });

        assertThrows(NullPointerException.class, () -> str.length());

        Foo foo = new Foo();
        Exception exception = assertThrows(Exception.class, () -> foo.foo());

        assertEquals("Exception Message", exception.getMessage());
    }

}

class Foo {
    void foo() throws Exception {
        throw new Exception("Exception Message");
    }
}
