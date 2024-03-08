package hw_04032024;

import java.util.Scanner;

import java.util.Scanner;

//Создайте класс Converter - конвертер системы счисления.
public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // У пользователя спрашивается число системы счисления, (используйте Scanner)

        System.out.println("Введите десятичное число:");
        int userNumber = scanner.nextInt();

        //Запрашивается само число (ожидается корректный ввод)
        //У пользователя спрашивается число системы счисления в какую перевести
        //Конвертация должна быть с помощью класса обертки Long.

        System.out.println("Выберите в какую систему исчисления Вы хоите перевести Ваше число:1.двоичную или 2. восьмиричную");
        int baseSystem = scanner.nextInt();

        // Конвертация должна быть с помощью класса обертки Long

        if (baseSystem == 1) {
            // Перевод в двоичную систему
            String binaryResult = Long.toBinaryString(userNumber);
            //Long.toBinaryString() ist eine Methode in Java, die Teil der Long-Klasse ist.
            // Diese Methode wird verwendet, um eine Dezimalzahl in ihre binäre (Dual-) Darstellung umzuwandeln.
            System.out.println("Результат конвертации в двоичную систему: " + binaryResult);
        } else if (baseSystem == 2) {
            // Перевод в восьмеричную систему
            String octalResult = Long.toOctalString(userNumber);
            System.out.println("Результат конвертации в восьмеричную систему: " + octalResult);
        } else {
            System.out.println("Некорректный выбор системы счисления. Выберите 1 или 2.");
        }
    }


}



