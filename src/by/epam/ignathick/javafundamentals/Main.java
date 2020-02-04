package by.epam.ignathick.javafundamentals;

import by.epam.ignathick.javafundamentals.by.epam.ignathick.task.Matrix;
import by.epam.ignathick.javafundamentals.by.epam.ignathick.task.RandomNumber;
import by.epam.ignathick.javafundamentals.by.epam.ignathick.task.ReverseArgument;
import by.epam.ignathick.javafundamentals.by.epam.ignathick.task.UserWelcome;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(); // Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
        UserWelcome userWelcome = new UserWelcome("Alexander"); //1. Приветствовать любого пользователя при вводе его имени через командную строку
        ReverseArgument reverseArgument = new ReverseArgument(args); //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        RandomNumber randomNumber = new RandomNumber(5, 100); //3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    }
}
