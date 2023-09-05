package ru.geekbrains.hometask2;


/**
 * Simple Solution
 * Самая простая реализация.
 * Плюсы:
 * - Простота и прозрачность кода
 * - Потокобезопасность
 *  -Высокая производительность в многопоточной среде
 * Минусы:
 * - Не ленивая инициализация.
 *  Использовать: Никогда. Либо когда не важна ленивая инициализация. Но лучше никогда.
 */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        System.out.println("Singleton Simple Solution");
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}