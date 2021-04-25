package Enum;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Country usa = new Country("США", true, "USA");
        Country norway = new Country("Норвегия", false, "Norway");
        Country mexico = new Country("Мексика", false, "Mexico");
        Country turkey = new Country("Турция", true, "Turkey");

        System.out.println("Доступные страны:");

        System.out.println(usa.toString());
        System.out.println(norway.toString());
        System.out.println(mexico.toString());
        System.out.println(turkey.toString());


        while (true) {

            Scanner in = new Scanner(System.in, "Cp1251");  // Создал объект класса сканер, System.in - стандартный поток вх данных.
            System.out.println("Введи интересующую тебя страну на русском, хочешь закрыть программу - введи 'Закрыть'");
            String vvood = in.nextLine();


            if (vvood.equals("Закрыть")) {
                break;
            }

            if (vvood.equals("Норвегия")) {
                norway.printstatus();
                continue;
            }

            if (vvood.equals("Мексика")) {
                mexico.printstatus();

            }
            if (vvood.equals("Турция")) {
                turkey.printstatus();
            }

            if (vvood.equals("США")) {
                usa.printstatus();
            }


            try {
                if (vvood.isEmpty()) {
                    throw new Exep("Пустая строка, нужно ввести страну");       //объявляю свою ошибку и ожидаю её
                }
            } catch (Exep e) {                                                //обрабатываю свою личную ошибку,Exep-свой класс,унаследованный от родительского ошибочного класса
                System.out.println(e);
                continue;
            }


            try {
                if (vvood.equals("USA") || vvood.equals("Norway") || vvood.equals("Mexico") || vvood.equals("Turkey")) {
                    throw new Exep("Введи страну по РУССКи!");
                }

            } catch (Exep e) {
                System.out.println(e);
                continue;
            }


            try {
                if (!vvood.equals("США") && !vvood.equals("Норвегия") && !vvood.equals("Мексика") && !vvood.equals("Турция")) {
                    throw new Exep("Введен некорретный символ!");
                }
            } catch (Exep e) {
                System.out.println(e);
            }
        }

        System.out.println("Хорошего Вам дня!");
    }
}


