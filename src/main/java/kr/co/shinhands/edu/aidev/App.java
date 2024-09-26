package kr.co.shinhands.edu.aidev;

public class App {
    public static void main(String[] args) {
        sayHello("Hello World!");
    }

    private static void sayHello(String message) {
        for (int i = 0; i < 10; i++) {
            System.out.println(message);
        }
    }
}
