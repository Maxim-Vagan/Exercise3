package ru.maxvagan;

public class Main {

    public static void main(String[] args) {
//	    Task 1
        System.out.println("Task 1");
        long clientOS = Math.round(Math.random()); //when clientOS = 0 then "iOS"; when clientOS = 1 then "Android";
        if (clientOS == 0) {
            System.out.println("Для обновления новой версии под iOS используйте далее ссылку...");
        } else {
            System.out.println("Для обновления новой версии под Android используйте далее ссылку...");
        }
//      Task 2
        System.out.println("Task 2");
        long clientDeviceYear = 2000 + Math.round(Math.random()*22); //Expected Random range of years from 2000 to 2022
        System.out.println("id ОС вашего устройства: " + clientOS + ".");
        System.out.println("Год выпуска вашего устройства: " + clientDeviceYear + ". Поэтому");
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Используйте облегчённую версию под iOS");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Используйте полную версию под iOS");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Используйте облегчённую версию под Android");
        } else {
            System.out.println("Используйте полную версию под Android");
        }
//      Task 3
        System.out.println("Task 3");
//        short selectedYear = 1948;
        long selectedYear = 2000 + Math.round(Math.random()*22);
        boolean isLeapYear = (selectedYear % 1900) % 4 == 0;
        if (isLeapYear) {
            System.out.println("Год " + selectedYear + " - високосный");
        } else {
            System.out.println("Год " + selectedYear + " - невисокосный");
        }
//      Task 4
        System.out.println("Task 4");
        byte deliveryDistance = 95;
//        long deliveryDistance = Math.round(Math.random()*100);
        System.out.println("Дистанция доставки: " + deliveryDistance + " км");
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            deliveryDays = deliveryDays + 0;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = deliveryDays + 1;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 2;
        }
        System.out.println("Срок доставки: " + deliveryDays + " дней");
//      Task 5
        System.out.println("Task 5");
        byte monthNumber = 4;
        switch (monthNumber) {
            case 1: System.out.println("Месяц :" + monthNumber + " - Январь. Сезон - Зима"); break;
            case 2: System.out.println("Месяц :" + monthNumber + " - Февраль. Сезон - Зима"); break;
            case 3: System.out.println("Месяц :" + monthNumber + " - Март. Сезон - Весна"); break;
            case 4: System.out.println("Месяц :" + monthNumber + " - Апрель. Сезон - Весна"); break;
            case 5: System.out.println("Месяц :" + monthNumber + " - Май. Сезон - Весна"); break;
            case 6: System.out.println("Месяц :" + monthNumber + " - Июнь. Сезон - Лето"); break;
            case 7: System.out.println("Месяц :" + monthNumber + " - Июль. Сезон - Лето"); break;
            case 8: System.out.println("Месяц :" + monthNumber + " - Август. Сезон - Лето"); break;
            case 9: System.out.println("Месяц :" + monthNumber + " - Сентябрь. Сезон - Осень"); break;
            case 10: System.out.println("Месяц :" + monthNumber + " - Октябрь. Сезон - Осень"); break;
            case 11: System.out.println("Месяц :" + monthNumber + " - Ноябрь. Сезон - Осень"); break;
            case 12: System.out.println("Месяц :" + monthNumber + " - Декабрь. Сезон - Зима"); break;
            default: System.out.println("Внимание: Неверный номер месяц!");
        }
//      "Не нашёл доп. задачи 6 и 7"
//      Task 6
//      Task 7
    }
}
