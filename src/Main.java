public class Main {
    public static void main(String[] args) {
       //task 1
       int eggs = 3;
        System.out.println("Значение переменной eggs с типом int равно "
                + eggs + ".");
        byte glassOfMilk = 1;
        System.out.println("Значение переменной glassOfMilk с типом byte равно "
                + glassOfMilk + ".");
        short cupOfFlour = 2;
        System.out.println("Значение переменной cupOfFlour с типом short равно "
                + cupOfFlour + ".");
        long apple = 5L;
        System.out.println("Значение переменной apple с типом long равно "
                + apple + ".");
        float spoonOfButter = 2.5f;
        System.out.println("Значение переменной spoonOfButter с типом float равно "
                + spoonOfButter + ".");
        double spoonOfSugar = 5.5;
        System.out.println("Значение переменной spoonOfSugar с типом double равно "
                + spoonOfSugar + ".");
        //task 2
     float a = 27.12f;//or double
     long b = 987678965549L;
     double c = 2.786;//or float
     int d = 569;//or short/long
     short e = -159;//or int/long
     int f = 27897;//or short/long
     byte g = 67;//or short/int/long
     //task 3
     int lyudmilaStudents = 23;
     int annaStudents = 27;
     int ekaterinaStudents = 30;
     int totalStudents = lyudmilaStudents + annaStudents + ekaterinaStudents;
     int sheetsOfPaper = 480;
     float sheetsPerStudent = (float) (sheetsOfPaper/totalStudents);
     System.out.println("На каждого ученика рассчитано " + sheetsPerStudent +
             " листов бумаги.");
     //task 4
     int bottlesNumber1 = 16;
     int timeOfWork1 = 2;
     int efficiencyPerMinute = bottlesNumber1/timeOfWork1;
     int timeOfWork2 = 20;
     int efficiency2 = efficiencyPerMinute*timeOfWork2;
     System.out.println("За " + timeOfWork2 + " минут машина произвела " + efficiency2 +
             " штук бутылок.");
     int minutesIn1Day = 24*60;
     int timeOfWork3 = minutesIn1Day;
     int efficiency3 = efficiencyPerMinute*timeOfWork3;
     timeOfWork3 = 1;
     System.out.println("За " + timeOfWork3 + " сутки машина произвела " + efficiency3 +
             " штук бутылок.");
     int timeOfWork4 = minutesIn1Day*3;
     int efficiency4 = efficiencyPerMinute*timeOfWork4;
     timeOfWork4 = 3;
     System.out.println("За " + timeOfWork4 + " дня машина произвела " + efficiency4 +
             " штук бутылок.");
     int timeOfWork5 = minutesIn1Day*30;
     int efficiency5 = efficiencyPerMinute*timeOfWork5;
     timeOfWork5 = 1;
     System.out.println("За " + timeOfWork5 + " месяц машина произвела " + efficiency5 +
             " штук бутылок.");
     // task 5
     int paintCanTotal = 120;
     int whitePaintPerClass = 2;
     int brownPaintPerClass = 4;
     int classTotal = paintCanTotal/(whitePaintPerClass+brownPaintPerClass);
     int whitePaintTotal = classTotal*whitePaintPerClass;
     int brownPaintTotal = classTotal*brownPaintPerClass;
     System.out.println("В школе, где " + classTotal + " классов, нужно " + whitePaintTotal +
             " банок белой краски и " + brownPaintTotal + " банок коричневой краски.");
     //task 6
     int bananasWeight = 80*5;
     int milkWeight = 105*2;
     int iceCreamWeight = 100*2;
     int eggsWeight = 70*4;
     int totalBreakfastWeightG = bananasWeight+milkWeight+iceCreamWeight+eggsWeight;
     double totalBreakfastWeightKg = (double) totalBreakfastWeightG/1000;
     System.out.println("Спортзавтрак весит " + totalBreakfastWeightG + " г, что равно " + totalBreakfastWeightKg +
             " кг.");
     //task 7
     double totalWeightToLoose = 7000;
     double loosePerDay1 = 250;
     double loosePerDay2 = 500;
     int loosePeriod1 = (int) (totalWeightToLoose/loosePerDay1);
     int loosePeriod2 = (int) (totalWeightToLoose/loosePerDay2);
     int loosePeriodAverage = (loosePeriod1 + loosePeriod2)/2;
     System.out.println("Если терять " + loosePerDay1 + " г в день, то понадобится "
             + loosePeriod1 + " дней для похудения.");
     System.out.println("Если терять " + loosePerDay2 + " г в день, то понадобится "
             + loosePeriod2 + " дней для похудения.");
     System.out.println("В среднем понадобится "
             + loosePeriodAverage + " день для похудения.");

     //task 8
     float percentToWage = 0.1f;
     int mashaWage1 = 67760;
     int mashaWage2 = (int) (mashaWage1 + mashaWage1*percentToWage);
     int mashaDif = (int) (mashaWage1*percentToWage*12);
     System.out.println("Маша теперь получает " + mashaWage2 +
             " рублей. Годовой доход вырос на " + mashaDif + " рублей.");
     int denisWage1 = 83690;
     int denisWage2 = (int) (denisWage1 + denisWage1*percentToWage);
     int denisDif = (int) (denisWage1*percentToWage*12);
     System.out.println("Денис теперь получает " + denisWage2 +
             " рублей. Годовой доход вырос на " + denisDif + " рублей.");
     int kristinaWage1 = 76230;
     int kristinaWage2 = (int) (kristinaWage1 + kristinaWage1*percentToWage);
     int kristinaDif = (int) (kristinaWage1*percentToWage*12);
     System.out.println("Кристина теперь получает " + kristinaWage2 +
             " рублей. Годовой доход вырос на " + kristinaDif + " рублей.");

    }
}