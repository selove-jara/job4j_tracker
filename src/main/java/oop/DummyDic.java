package oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        DummyDic tom = new DummyDic();
        String word = tom.engToRus("развитый");
        System.out.println(word);
    }
}
