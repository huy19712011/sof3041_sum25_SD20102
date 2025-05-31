package org.example.sof3041_sum25_sd20102.assertions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionExample {

    @Test
    @DisplayName("assertNull Examples")
    void test_assertNull() {
        assertNull(null);
    }

    @Test
    @DisplayName("assertNotNull Examples")
    void test_assertNotNull() {
        assertNotNull(new Object());
    }

    @Test
    @DisplayName("assertSame Examples")
    void test_assertSame() {
        assertSame("Hi", "Hi");
    }

    @Test
    @DisplayName("assertNotSame Examples")
    void test_assertNotSame() {
        assertNotSame("Hi", "Hello");
    }

    @Test
    @DisplayName("assertTrue Examples")
    void test_assertTrue() {
        assertTrue(3 > 0);
        assertTrue(() -> {
            return true;
        });

        assertTrue(3 > 0, "assertTrue fail message");
        assertTrue(3 > 0, () -> {
            return "assertTrue fail message";
        });

        assertTrue(() -> {
            return true;
        }, "assertTrue fail message");
        assertTrue(() -> {
            return true;
        }, () -> {
            return "assertTrue fail message";
        });
    }

    @Test
    @DisplayName("assertFalse Examples")
    void test_assertFalse() {
        assertFalse(3 < 0);
        assertFalse(() -> {
            return false;
        });

        assertFalse(3 < 0, "assertFalse fail message");
        assertFalse(3 < 0, () -> {
            return "assertFalse fail message";
        });

        assertFalse(() -> {
            return false;
        }, "assertFalse fail message");
        assertFalse(() -> {
            return false;
        }, () -> {
            return "assertFalse fail message";
        });
    }

    @Test
    @DisplayName("assertEquals Examples")
    void test_assertEquals() {
        assertEquals(10, 10);
        assertEquals(true, true, "assertEquals Failure Message");
        assertEquals("Hi", new String("Hi"));
        assertEquals(new File("test"), new File("test"));
    }

    @Test
    @DisplayName("assertNotEquals Examples")
    void test_assertNotEquals() {
        assertNotEquals(10, 100);
        assertNotEquals(true, false, "assertEquals Failure Message");
        assertNotEquals("Hi", new String("Hello"));
        assertNotEquals(new File("test"), new File("test1"));
    }

    @Test
    @DisplayName("assertArrayEquals Examples")
    void test_assertArrayEquals() {
        String[] s1 = { "A", "B" };
        String[] s2 = { "A", "B" };
        assertArrayEquals(s1, s2);
        assertArrayEquals(s1, s2, "My Custom Failure Message");
    }



}
