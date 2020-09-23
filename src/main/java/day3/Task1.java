package day3;

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
// ПРОГРАММА ПО УСЛОВИЯМ ЗАДАЧИ РАБОТАЕТ,НО ТЕСТ НЕ ПРОХОДИТ.
// ПРОШУ ДАТЬ ПОЯСНЕНИЕ,ГДЕ МОЯ ОШИБКА.
////////////////////////////////////////////////////////////////////////

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String gorod = scanner.nextLine();

            if (gorod.equals("Stop")) {
                break;
            }

            switch (gorod) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Англия");
                    break;

                default:

                    System.out.println("Неизвестная страна");

            }

        }

    }
}

