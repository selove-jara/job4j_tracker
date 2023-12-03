package oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
        active = true;
        status = 666;
        message = "Все сломалось, помогите мне";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Ошибка активна:" + active);
        System.out.println("Номер ошибки:" + status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error bug = new Error(false, 555, "Сам починится");
        bug.printInfo();

    }
}
