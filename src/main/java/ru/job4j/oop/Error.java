package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error666 = new Error(true, 666, "Перезагрузите компьютер, обычно помогает.");
        error666.printInfo();
        Error error400 = new Error(false, 400, "Плохой запрос.");
        error400.printInfo();
        Error error404 = new Error(true, 404, "Запрошенный материал не найден.");
        error404.printInfo();
    }

    public void printInfo() {
        System.out.println("Активна: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }
}

