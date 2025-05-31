package org.example.sof3041_sum25_sd20102.annotations;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilsTest {

    static MyUtils myUtils;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Set Up Before Class - @BeforeAll");
        myUtils = new MyUtils();

    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("Tear Down After Class - @AfterAll");
    }

    @BeforeEach
    void setup() {

        System.out.println("Set up @BeforeEach");
        // myUtils = new MyUtils();
    }

    @AfterEach
    void tearDown() {

        System.out.println("Tear Down @AfterEach");
    }

    @Test
    void add() {

        //Assertions.assertEquals(10, new MyUtils().add(5, 5));
        Assertions.assertEquals(10, myUtils.add(5, 5));
    }

    @Test
    void reverse() {

        assertEquals("abc", new MyUtils().reverse("cba"));
    }
}