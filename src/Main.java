import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        //Задание 1
        System.out.println("Задание 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2459000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }

        //Задание 2
        System.out.println("\n Задание 2");
        int a = 11;
        while (a != 1) {
            a--;
            System.out.print(a + " ");
        }
        System.out.print("\n");

        int i = 1;
        for (i = 1; i <= 10; i++)
            System.out.print(i + " ");
        System.out.print("\n");


        //Задание 3
        System.out.println("\n Задание 3");
        int country = 12000000;
        for (int years = 1; years <= 10; years++) {
            country = country + country / 1000 * 17 - country / 1000 * 8; // Узнал тысячи, прибавил к ним родившихся и отнял умерших
            System.out.println("Год " + years + " численность населения составляет " + country);
        }

        //Задание 2.1 - 2.2
        System.out.println("\n Задание 2.1 - 2.2");
        int totalMoney = 15000; // Задал переменную всего денег
        int Month = 0; // Задал пере
        while (totalMoney <= 12000000) {
            if (Month % 6 == 0)
                System.out.println("Месяц " + Month + " сумма накоплений равна " + totalMoney + " рублей");
            Month++;
            totalMoney = totalMoney + totalMoney / 100 * 7;

        }
        //Задание 2.3
        System.out.println("\n Задание 2.3");
        int storage = 0;
        int deposit = 15000;
        for (i = 1; i <= 9 * 12; i++) {
            storage = storage + deposit + (storage / 100 * 7);
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " сумма накоплений равна " + storage + " рублей");
        }
        // Задание 2.4
        System.out.println("\n Задание 2.4");
        int Friday1 = 1;
        for (int Friday = Friday1; Friday <= 31; Friday += 7)
            System.out.println("Сегодня пятница," + Friday + "-е число. Необходимо подготовить отчет.");


        //Задание 7
        System.out.println(" \n Задание 7");
        int years = 0; // вынес за цыкл для вывода
        for (years = 0; years <= LocalDate.now().getYear() + 100; years += 79) {
            if (years >= LocalDate.now().getYear() - 200 && years <= LocalDate.now().getYear()) // отнял 200 лет от текущей даты.
                System.out.println("год кометы " + years); // вывел год кометы
            if (years > LocalDate.now().getYear()) // отнял 200 лет от текущей даты.
                System.out.println("следующий год кометы " + years); // вывел год кометы
        }

        //Задание 8
        System.out.println("\n Задание 8");
        for (int n = 1; n <= 10; n++) {
            for (a = 1; a <= 10; a++) {
                System.out.print(n + " * " + a + " = " + a * n + "\t");
            }
            System.out.println();
        }

    }
}





























































