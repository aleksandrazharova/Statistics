package ru.netology.stats;

import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldSumCorrect() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int ExpectedSum = 180;
        int Actual = service.sumSales(arr);
        Assertions.assertEquals(ExpectedSum, Actual);
    }

    @org.junit.jupiter.api.Test
    void shouldAvgCorrect() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int ExpectedAvg = 15;
        int Actual = service.avgSales(arr);
        Assertions.assertEquals(ExpectedAvg, Actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMonthMaxSales() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int ExpectedMonthMax = 8;
        int Actual = service.maxSales(arr);
        Assertions.assertEquals(ExpectedMonthMax, Actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMonthMinSales() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int ExpectedMonthMin = 9;
        int Actual = service.minSales(arr);
        Assertions.assertEquals(ExpectedMonthMin, Actual);
    }

    @org.junit.jupiter.api.Test
    void shouldBelowAvgMonths() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int ExpectedBelowAvgMonths = 5;
        int Actual = service.belowAvgSales(arr);
        Assertions.assertEquals(ExpectedBelowAvgMonths, Actual);
    }

    @org.junit.jupiter.api.Test
    void shouldAboveAvgMonths() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int ExpectedAboveAvgMonths = 5;
        int Actual = service.belowAvgSales(arr);
        Assertions.assertEquals(ExpectedAboveAvgMonths, Actual);
    }

}
