package ru.geekbrains.hometask2;


/**
 * Lazy Initialization
 * Плюсы:
 * - Ленивая инициализация.
 * Минусы:
 * - Не потокобезопасно
 * Использовать: Всегда, когда не нужна многопоточность.
 */

public class Singleton2 {
    private static Singleton2 INSTANCE;

    private Singleton2() {
        System.out.println("Singleton Lazy Initialization");
    }

    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
}