package ru.netology.stats;

public class StatsService {

    public int sum(int[] sales) {
        int total = 0;

        for (int sale : sales) {
            total += sale;
        }

        return total;
    }

    public int avg(int[] sales) {
        int sum = sum(sales);
        return sum / sales.length;
    }

    public int monthWithMax(int[] sales) {
        int max = sales[0];
        for (int sale : sales) {
            if (max < sale) {
                max = sale;
            }
        }

        int monthNumber = 0;
        int monthWithMax = 0;
        for (int sale : sales) {
            monthNumber += 1;
            if (sale == max) {
                monthWithMax = monthNumber;
            }
        }
        return monthWithMax;
    }

    public int monthWithMin(int[] sales) {
        int min = sales[0];
        for (int sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }

        int monthNumber = 0;
        int monthWithMin = 0;
        for (int sale : sales) {
            monthNumber += 1;
            if (sale == min) {
                monthWithMin = monthNumber;
            }
        }
        return monthWithMin;
    }

    public int monthCountWithLessThanAverage(int[] sales) {
       int avg = avg(sales);

       int monthCount = 0;
       for (int sale : sales) {
           if (sale < avg) {
               monthCount +=1;
           }
       }
    return monthCount;
    }

    public int monthCountWithMoreThanAverage(int[] sales) {
        int avg = avg(sales);

        int monthCount = 0;
        for (int sale : sales) {
            if (sale > avg) {
                monthCount +=1;
            }
        }
        return monthCount;
    }
}