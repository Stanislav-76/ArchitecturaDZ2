package ru.geekbrains.hometask2;


/**
 * Synchronized Accessor
 * Плюсы:
 * - Ленивая инициализация.
 * - Потокобезопасность
 * Минусы:
 * - Низкая производительность в многопоточной среде
 * Использовать: Никогда. Либо когда скорость работы при многопоточности не имеет значения. Но лучше никогда.
 */

public class Singleton3 {
    private static Singleton3 INSTANCE;

    private Singleton3() {
        System.out.println("Singleton Synchronized Accessor");
    }

    public static synchronized Singleton3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }
}