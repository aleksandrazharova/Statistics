package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int saleYear = 0;
        for (int i = 0; i < sales.length; i++) {
            saleYear = saleYear + sales[i];
        }
        return saleYear;
    } //Сумма всех продаж.

    public int avgSales(int[] sales) {
        int saleYear = 0;
        for (int i = 0; i < sales.length; i++) {
            saleYear = saleYear + sales[i];
        }
        return saleYear / sales.length;
    } //Среднюю сумма продаж в месяц.

    public int maxSales(int[] sales) {
        int maxMonth = 0; //пик продаж месяц
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    } //Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    } //Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму

    public int belowAvgSales(int[] sales) {
        int avg = avgSales(sales); //среднее
        int belowAvg = 0; //ниже среднего переменная
        for (int i = 0; i < sales.length; i++) { //можно иначе (int i : sales) {i < avg}
            if (sales[i] < avg) {
                belowAvg = belowAvg + 1;
            }
        }
        return belowAvg;
    } //Количество месяцев, в которых продажи были Ниже среднего


    public int aboveAvgSales(int[] sales) {
        int avg = avgSales(sales);
        int aboveAvg = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                aboveAvg = aboveAvg + 1;
            }
        } //Количество месяцев, в которых продажи были выше среднего
        return aboveAvg;
    }

}
