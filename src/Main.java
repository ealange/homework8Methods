public class Main {

    public static void isYearAreLeap(int year) {
        int yearRemOfDivision400 = year % 400;
        int yearRemOfDivision100 = year % 100;
        int yearRemOfDivision4 = year % 4;
        if (yearRemOfDivision400 == 0) {
            System.out.println(year + "-год високосный");
        } else {
            if (yearRemOfDivision4 == 0 && yearRemOfDivision100 != 0) {
                System.out.println(year + "Год високосный");
            } else {
                System.out.println(year + "-год не високосный");
            }
        }
    }

    public static void selectAppVersion(byte clientOs, short year) {
        int currentYear = 2022;
        if (year > currentYear) {
            throw new RuntimeException("Вернитесь обратно в будущее");
        } else if (year < currentYear) {
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.print("Установите версию приложения для ");
        }
        if (clientOs == 0) {
            System.out.println("iOS по ссылке");
        } else {
            System.out.println("Android по ссылке");
        }
    }

    public static void calculateDeliveryPeriod(int distance) {
        int deliveryPeriod = 1;
        if (distance > 100) {
            throw new RuntimeException("Проще самому заехать");
        } else if (distance > 20) {
            deliveryPeriod = deliveryPeriod + 1;
        }
        if (distance > 60) {
            deliveryPeriod = deliveryPeriod + 1;
        }
        System.out.println("Потребуется " + deliveryPeriod + " дня доставки.");
    }

    public static void main(String[] args) {
//        task1
        int year = 2001;
        isYearAreLeap(year);
//        task2
        byte clientOs = 0;
        short smartphoneYear = 2005;
        selectAppVersion(clientOs, smartphoneYear);
//        task3
        int deliveryDistance = 1;
        calculateDeliveryPeriod(deliveryDistance);
        
    }
}