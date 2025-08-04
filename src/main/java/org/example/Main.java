package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task 1
        int Int ;
        byte Byte ;
        short Short ;
        long Long ;
        float Float ;
        double Double ;
        char Char ;
        boolean Boolean ;

        //task 2
        double meaning1 = 27.12;
        long meaning2 = 987_678_965_549L;
        float meaning3 = 2.786f;
        short meaning4 = 569;
        short meaning5 = -159;
        int meaning6 = 27897;
        byte meaning7 = 67;
        System.out.println("Значение переменной "+"meaning1" + " с типом данных double равно " +meaning1 ); // выведет 27.12
        System.out.println("Значение переменной "+"meaning2" + " с типом данных long равно " +meaning2 );
        System.out.println("Значение переменной "+"meaning3" + " с типом данных float равно " +meaning3 );
        System.out.println("Значение переменной "+"meaning4" + " с типом данных short равно " +meaning4 );
        System.out.println("Значение переменной "+"meaning5" + " с типом данных short равно " +meaning5 );
        System.out.println("Значение переменной "+"meaning6" + " с типом данных int равно " +meaning6 );
        System.out.println("Значение переменной "+"meaning7" + " с типом данных byte равно " +meaning7 );

        //task3
        int ludmilaStudents = 23;
        int annaStudents = 27;
        int ekaterinaStudents = 30;
        int totalPapers = 480;

        int totalStudents = ludmilaStudents + annaStudents + ekaterinaStudents;
        int papersPerStudent = totalPapers / totalStudents;

        System.out.println("На каждого ученика рассчитано " + papersPerStudent + " листов бумаги");
        //task4
        final int bottlesPerTwoMinutes = 16;
        final int minutesInDay = 1440;

        int per20Min = bottlesPerTwoMinutes * (20 / 2);
        int perDay = bottlesPerTwoMinutes * (minutesInDay / 2);
        int perThreeDays = perDay * 3;
        int perMonth = perDay * 30;

        System.out.println("За 20 минут машина произвела " + per20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + perDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + perThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + perMonth + " штук бутылок");
        //task5
        int totalPaintBottles = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;

        int classesCount = totalPaintBottles / (whitePerClass + brownPerClass);
        int whiteBottles = classesCount * whitePerClass;
        int brownBottles = classesCount * brownPerClass;

        System.out.println("В школе, где " + classesCount + " классов, нужно " + whiteBottles +
                " банок белой краски и " + brownBottles + " банок коричневой краски");
        //task 6
        int bananasWeight = 5 * 80;
        int milkWeight = 200 * 105 / 100; // 200 мл молока = 210 грамм
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;

        int totalGramm = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        double totalKg = totalGramm / 1000.0;

        System.out.println("Вес завтрака в граммах: " + totalGramm + "г");
        System.out.println("Вес завтрака в килограммах: " + totalKg + "кг");
        //task 7
        int weightToLoose = 7000; // 7 кг = 7000 граммов
        int daysFor250gr = weightToLoose / 250;
        int daysFor500gr = weightToLoose / 500;
        int averageDays = (daysFor250gr + daysFor500gr) / 2;

        System.out.println("При похудении на 250 гр/день понадобится " + daysFor250gr + " дней.");
        System.out.println("При похудении на 500 гр/день понадобится " + daysFor500gr + " дней.");
        System.out.println("Средний срок похудения составляет примерно " + averageDays + " дней.");
        //task 8
        double mashaSalaryBefore = 67760;
        double denisSalaryBefore = 83690;
        double kristinaSalaryBefore = 76230;

        double increaseRate = 0.10;

        double mashaNewSalary = mashaSalaryBefore * (1 + increaseRate);
        double denisNewSalary = denisSalaryBefore * (1 + increaseRate);
        double kristinaNewSalary = kristinaSalaryBefore * (1 + increaseRate);

        double mashaAnnualIncrease = (mashaNewSalary - mashaSalaryBefore) * 12;
        double denisAnnualIncrease = (denisNewSalary - denisSalaryBefore) * 12;
        double kristinaAnnualIncrease = (kristinaNewSalary - kristinaSalaryBefore) * 12;

        System.out.printf("Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n",
                mashaNewSalary, mashaAnnualIncrease);
        System.out.printf("Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n",
                denisNewSalary, denisAnnualIncrease);
        System.out.printf("Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n",
                kristinaNewSalary, kristinaAnnualIncrease);
    }
}

