package ru.geekbrains.hometask2;


/**
 * Double Checked Locking
 * Плюсы:
 * - Ленивая инициализация.
 * - Потокобезопасность
 * - Высокая производительность в многопоточной среде
 * Минусы:
 * - Не поддерживается на версиях Java ниже 1.5 (в версии 1.5 исправили работу ключевого слова volatile)
 *
 * Для корректной работы данного варианта реализации обязательно одно из двух условий.
 *   Переменная INSTANCE должна быть либо final, либо volatile.
 * Использовать: В редких случаях, когда нужно обрабатывать исключения при создании синглтона.
 *               (когда неприменим Class Holder Singleton)
 */

public class Singleton4 {
    private static volatile Singleton4 INSTANCE;

    private Singleton4() {
        System.out.println("Singleton Double Checked Locking");
    }

    public static Singleton4 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton4.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton4();
                }
            }
        }
        return INSTANCE;
    }
}