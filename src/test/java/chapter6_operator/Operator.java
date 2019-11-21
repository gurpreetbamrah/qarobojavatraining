package chapter6_operator;

public class Operator {

    public static void main(String[] args) {
        int x=20;
        int y=10;
        System.out.println(x++);
        //"x++" means "use the current value of x, then increment it".
        System.out.println(x);
        //   "++y" means "increment y, then use the new value"
        System.out.println(++y);
        System.out.println(y);

        System.out.println(x--);
        System.out.println(x);

        int a=10;
        int b=10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21





    }
}
