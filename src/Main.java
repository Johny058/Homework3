// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Привет мир!");
        System.out.println("Задача № 1,2");
        int res1 = 0;
        byte res2 = 67;
        short res3 = -159;
        short res4 = -569;
        short res5 = 27897;
        long res6 = 987678965549L;
        float res7 = 27.12f;
        float res8 = 2.786f;
        System.out.println("Задача № 3");
        byte teaher1 = 23;
        byte teaher2 = 27;
        byte teaher3 = 30;
        short paper = 480;
       int totalStudents = teaher1 + teaher2 + teaher3;
       int res = paper / totalStudents;
        System.out.println("На каждого ученика расчитано " + res + " листов бумаги");
        System.out.println("Задача № 4");
        byte bottes = 16;
        byte timeForPerformance = 2;
        int productivityPerMinute = bottes / timeForPerformance;
         //System.out.println("Производительность в минуту: " + productivityPerMinute);
        short machinePerformance1 = 20 * 8;
        System.out.println("За 20 минут машина произвела " + machinePerformance1
                + "  штук бутылок");
        short machinePerformance2 = 60 * 24 * 8;
        System.out.println("За сутку машина произвела " + machinePerformance2
                + " штук бутылок");
        int productivityPerDay = 11520;
        int machinePerformance3 = 11520 * 3;
        System.out.println("За 3 дня машина произвела " + machinePerformance3
                + " штук бутылок");
        int machinePerformance4 = 11520 * 31;
        System.out.println("За месяц машина произвела " + machinePerformance4
                + " штук бутылок");
        System.out.println("Задача № 5");
        byte totalCans = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int totalClasses = totalCans / (whitePaint + brownPaint);
        //System.out.println("Всего классов " + totalClasses);
        int totalWhitePaint = totalClasses * whitePaint;
        int totalBrownPaint = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно "
                + totalWhitePaint + " банок белой краски и " + totalBrownPaint
                + " банок коричневой краски");
        System.out.println("Задача № 6");
        byte totalBananas = 5;
        byte bananaWeight = 80;
        short totalMilk = 200;
        short milkWeight = 105;
        byte totalIceCream = 2;
        byte iceCreamWeight = 100;
        byte totalEggs = 4;
        byte eggsWeight = 70;
        short breakfastWeight1 = (5 * 80) + (2 * 105) + (2 * 100) + (4 * 70);
        System.out.println("Спортзавтрак весит " + breakfastWeight1 + " грамм");
        float breakfastWeight2 = 1090 / 1000f;
        System.out.println("Спортзавтрак весит " + breakfastWeight2 + " киллограм");
        System.out.println("Задача № 7");
        byte weight = 7;
        float weightLoss1 = 0.25f;
        float weightLoss2 = 0.50f;
        float resLoss1= weight / weightLoss1;
        float resLoss2= weight / weightLoss2;
        System.out.println(" Если каждый день худеть на 250 грамм, результата " +
                "можно добиться через " + resLoss1 + " дней");
        System.out.println(" Если каждый день худеть на 500 грамм, результата " +
                "можно добиться через " + resLoss2 + " дней");
        float resLoss3 = resLoss2 % resLoss1 / 2 + resLoss2;
        System.out.println("В среднем спортсмен похудеет через " + resLoss3 + " день");
        System.out.println("Задача № 8");
        int mishaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mishaSalaryIncrease = mishaSalary / 100 * 10 + mishaSalary;
        int denisSalaryIncrease = denisSalary / 100 * 10 + denisSalary;
        int kristinaSalaryIncrease = kristinaSalary / 100 * 10 + kristinaSalary;
        int mishaAnnualSalary = mishaSalaryIncrease * 12;
        int denisAnnualSalary = denisSalaryIncrease * 12;
        int kristinaAnnualSalary = kristinaSalaryIncrease * 12;
        int costsMishaSalary = mishaSalary * 12;
        int costsDenisSalary = denisSalary * 12;
        int costsKristinaSalary = kristinaSalary * 12;
        int misha = mishaAnnualSalary - costsMishaSalary;
        int denis = denisAnnualSalary - costsDenisSalary;
        int kristina = kristinaAnnualSalary - costsKristinaSalary;
        System.out.println("Маша теперь получает " + mishaSalaryIncrease + " рублей. " +
                "Годовой доход вырос на " + misha + "рублей");
        System.out.println("Денис теперь получает " + denisSalaryIncrease + " рублей. " +
                "Годовой доход вырос на " + denis + "рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryIncrease + " рублей. " +
                "Годовой доход вырос на " + kristina + "рублей");




























    }
}