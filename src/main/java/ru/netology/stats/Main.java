package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();

        System.out.println("Сумма всех продаж: " + service.sumSales(arr));
        System.out.println("Средняя сумма продаж в месяц: " + service.avgSales(arr));
        System.out.println("Продажи на максимальную сумму в месяце: " + service.maxSales(arr));
        System.out.println("Продажи на минимальную сумму в месяце: " + service.minSales(arr));
        System.out.println("Количество месяцев с продажами ниже среднего: " + service.belowAvgSales(arr));
        System.out.println("Количество месяцев с продажами выше среднего: " + service.aboveAvgSales(arr));
    }
}