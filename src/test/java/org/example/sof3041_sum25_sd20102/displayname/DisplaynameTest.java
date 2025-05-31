package org.example.sof3041_sum25_sd20102.displayname;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DisplaynameTest {

    @Test
    @DisplayName("Demo using @Displayname")
    void test() {

        Assertions.assertTrue(10 > 5);
    }
}
