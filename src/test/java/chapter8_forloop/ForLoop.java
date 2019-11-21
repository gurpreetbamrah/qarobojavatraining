package chapter8_forloop;

public class ForLoop {
    public static void main(String[] args) {
        ForLoop forLoop = new ForLoop();
        forLoop.iterateProgram();
        forLoop.advanceForLoop();
    }

    private void iterateProgram() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("qarobo->" + i);
        }
    }

    private void advanceForLoop() {
        String str[] = {"hello", "robo"};
        for (String string : str) {
            System.out.println("advance forloop->" + string);
        }
    }
}
