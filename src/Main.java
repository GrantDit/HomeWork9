public class Main {
    public static void main(String[] args) {


        //Задание 1
        System.out.println("Задание 1");
        {
            int salary = 15000;
            int total = 0;
            int month = 0;
            while (total <= 2459000) {
                total = total + salary;
                month++;
                System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            }

            //Задание 2
            System.out.println("Задание 2");
            int a = 11;
            while (a != 1) {
                a--;
                System.out.print(a + " ");
            }
            System.out.print("\n");
            {
                int i = 1;
                for (i = 1; i <= 10; i++)
                    System.out.print(i + " ");
                System.out.print("\n");

            }
            //Задание 3
            System.out.println("Задание 3");
            int country = 12000000; // deadCountry
            int newDeadInside = country / 1000 * 17; // notDeadInside
            int deadInside = country / 1000 * 8;  //deadInside
            for (int years = 1; years <= 10; years++) {
                country = country - deadInside + newDeadInside; // хипстеры
                System.out.println("Год " + years + " численность населения составляет " + country);
            }

            //Задание 4
            System.out.println("Задание 4");
            int money = 15000;
            int totalMoney = 0;
            int Month = 0;
            while (totalMoney <= 12000000) {
                Month ++;
                totalMoney = totalMoney + money + (money/ 100 * 7 *Month)-(money/100 * 7);
                if (Month%6==0)
                    System.out.println("Месяц " + Month + " сумма накоплений равна " + totalMoney + " рублей");

            }
            //Задание 6
            System.out.println("Задание 6");
            int storage = 0;
            int deposit = 15000;
            for (int i = 1; i < 109 ; i++) {
                storage = storage + deposit + (deposit / 100 * 7 * i) - (deposit / 100 * 7);
                if (i%6==0)
            System.out.println("Месяц " + i + " сумма накоплений равна " + storage + " рублей");
        }
            //Задание 7
            System.out.println("Задание 7");
            int n = 8;
            for (int i = 1; i <=10; i++)
                System.out.println(n + " * " + i + " = " + i*n);

            }







            }



        }


































