package chapter3_variables;

public class Variables {

    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        Variables variables = new Variables();
        variables.testMethod();
        System.out.println(Variables.b);
    }

    public void testMethod() {
        int c = 5;
        System.out.println(c);
        System.out.println(a);
    }


}
