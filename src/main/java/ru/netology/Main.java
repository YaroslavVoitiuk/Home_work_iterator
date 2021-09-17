package ru.netology;

public class Main {

    public static void main(String[] args) {
        for (int r : new Randoms(60, 70)) {
            System.out.println("Случайное число: " + r);
            if (r == 70) {
                System.out.println("Выпало число " + r + ", давайте на этом закончим");
                break;
            }
        }
    }
}
