package com.sparta.fw;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.sparta.fw.Raindrops.factorOutputs;


public class TestingRaindrops {

    @Nested
    @DisplayName("Check number factors 3,5,7 return corresponding outputs")
    class CheckNumberFactorsReturnRaindrops {
        @Test
        @DisplayName("Check 3 returns 'Pling'")
        void checkForBoundaryThree() {
            Assertions.assertEquals("Pling", factorOutputs(3));
        }

        @Test
        @DisplayName("Check 5 returns 'Plang'")
        void checkForBoundaryFive() {
            Assertions.assertEquals("Plang", factorOutputs(5));
        }

        @Test
        @DisplayName("Check 7 returns 'Plong'")
        void checkForBoundarySeven() {
            Assertions.assertEquals("Plong", factorOutputs(7));
        }

    }

    @Nested
    @DisplayName("Boundary Tests - Negative numbers, Invalid Boundary Partitions -IBP")
    class BoundaryTests {

        @Test
        @DisplayName("Check -123456789 returns -123456789 (Mid Negative Int range)")
        void checkMidNegativeValue() {
            Assertions.assertEquals("-123456789", factorOutputs(-123456789));
        }

        @Test
        @DisplayName("Check -1 returns -1")
        void checkForBoundaryNegat1Below0() {
            Assertions.assertEquals("-1", factorOutputs(-1));
        }

        @Test
        @DisplayName("Check 1 returns 1")
        void check1Returns1IBP() {
            Assertions.assertEquals("1", factorOutputs(1));
        }

        @Test
        @DisplayName("Check 0 returns 0")
        void boundary0Returns0IBP() {
            Assertions.assertEquals("0", factorOutputs(0));
        }

        @Test
        @DisplayName("Check 4 returns 4")
        void check4Returns4IBP() {
            Assertions.assertEquals("4", factorOutputs(4));
        }

        @Test
        @DisplayName("Check 2 returns 2")
        void check6Returns6IBP() {
            Assertions.assertEquals("2", factorOutputs(2));
        }

        @Test
        @DisplayName("Check 8 returns 8")
        void check8Returns8IBP() {
            Assertions.assertEquals("8", factorOutputs(8));
        }

    }

    @Nested
    @DisplayName("Testing out Examples given")
    class GivenExampleTests {
        @Test
        @DisplayName("Check 28 returns 'Plong'")
        void check28EqualsPlong() {
            Assertions.assertEquals("Plong", factorOutputs(28));
        }

        @Test
        @DisplayName("Check 30 returns 'PlingPlang'")
        void check30EqualsPlingPlang() {
            Assertions.assertEquals("PlingPlang", factorOutputs(30));
        }

        @Test
        @DisplayName("Check 34 returns 34")
        void check34Equals34() {
            Assertions.assertEquals("34", factorOutputs(34));
        }

    }

    @Nested
    @DisplayName("Testing for double outputs")
    class TestingDoubleOutputs {
        @Test
        @DisplayName("Check 35 returns 'PlangPlong'")
        void check35EqualsPlangPlong() {
            Assertions.assertEquals("PlangPlong", factorOutputs(35));
        }

        @Test
        @DisplayName("Check 15 returns 'PlingPlang'")
        void check15EqualsPlangPlong() {
            Assertions.assertEquals("PlingPlang", factorOutputs(15));
        }
        @Test
        @DisplayName("Check 21 returns 'PlingPlong'")
        void check15EqualsPlingPlong() {
            Assertions.assertEquals("PlingPlong", factorOutputs(21));
        }
        @Test
        @DisplayName("Check 45 returns 'PlingPlang'")
        void check45EqualsPlingPlang() {
            Assertions.assertEquals("PlingPlang", factorOutputs(45));
        }


    }
}
