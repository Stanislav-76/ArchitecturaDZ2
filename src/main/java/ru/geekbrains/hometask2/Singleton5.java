package ru.geekbrains.hometask2;


/**
 * Holder Singleton
 * Плюсы:
 * - Ленивая инициализация.
 * - Потокобезопасность.
 * - Высокая производительность в многопоточной среде.
 * Минусы:
 *  - Для корректной работы необходима гарантия, что объект класса Singleton инициализируется без ошибок. Иначе первый
 *    вызов метода getInstance закончится ошибкой ExceptionInInitializerError, а все последующие NoClassDefFoundError.
 * Использовать: Всегда, когда нужна многопоточность и есть гарантия, что объект синглтон класса будет создан без проблем.
 */

public class Singleton5 {

    private Singleton5() {
        System.out.println("Holder Singleton");
    }

    private static class SingletonHolder {
        public static final Singleton5 HOLDER_INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}