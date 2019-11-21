package chapter4_datatypes;

public class DataTypes {

    public static void main(String[] args) {

        String string = "hello";

        int a = 10;
        boolean test = false;
        float f = 10.42f;
        double d = 10.42;

        String string2="123";
        int number= Integer.parseInt(string2);
        System.out.println(number);


        System.out.println("String is->" + string);
        System.out.println("Integer is->" + a);
        test = true;
        System.out.println("Boolean is->" + test);

        System.out.println("Value of float variable f is :" + f);
        System.out.println("Value of float variable f is :" + d);
    }


}
