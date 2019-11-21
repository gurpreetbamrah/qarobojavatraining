package chapter5_ifelse;

public class IfElse {



    public static void main(String[] args) {
        IfElse ifElse = new IfElse();
        ifElse.if_else_example();
        ifElse.nested_if_else();
        IfElse.if_else_example();
    }

    private static void if_else_example() {
        int a = 10;
        int b = 2;

        if (b > a) {
            System.out.println("I am inside if condition");
        } else {
            System.out.println("I am inside else");
        }

    }

    private void nested_if_else() {
        int a = 7;
        int b = 2;
        int c=4;

        if (a/b > c) {
            System.out.println("I am inside if condition 1");
        } else if(b>c) {
            System.out.println("I am inside if condition 2");
        }
        else {
            System.out.println("hello robo");
        }

    }
}
