package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// example
        int run = 1;
        while (run <= 10) {
            System.out.print(" " + run);
            run ++;
        }
        System.out.println();
        for (int i = 10; i>0; i--)
            System.out.print(" " + i);
        System.out.println();

        // задача 2
        for (int f = 4; f <=31;f = f+7)
            System.out.println(f + " число отчетная пятница");
        System.out.println();

        // задача 3

        for (int u = 0; u <= 2021; u = u + 79)
            System.out.println("prolet " + u); // этим дейсвтием я посчитал все года прибития кометы
        // получил некий список и из этого списка годов я взял последний 1975 и отнял 200, получит 1775
        // ближайшая дата к 1775 голу в котором пролетела комета это 1817 - она и была вязта за первую переменную
        // а вторая переменная 2075 получилась от сложения 100 к 1975 году
        for (int starWay = 1817; starWay <= 2075; starWay = starWay +79) {
            if (starWay > 1817)  // так как мы знаем что 1817 году комета пролетала, а нам эта дата не нужна
                // я использовал цикл
                System.out.println("пролет кометы " + starWay);
        }

        }


    }

