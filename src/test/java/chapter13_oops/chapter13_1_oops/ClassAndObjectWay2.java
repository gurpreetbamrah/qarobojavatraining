package chapter13_oops.chapter13_1_oops;

import java.lang.reflect.Method;

public class ClassAndObjectWay2 {
    public static void main(String[] args) throws NoSuchMethodException {
        try {
            Class cls = Class.forName("chapter13_oops.chapter13_1_oops.ClassAndObjectWay2");


            ClassAndObjectWay2 obj = (ClassAndObjectWay2) cls.newInstance();
            obj.display();

            Method mthd = cls.getDeclaredMethod("display", null);

            System.out.println("method  1 = " + mthd.toString());

        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        }
    }

    public void display() {
        System.out.println("Hello qarobo");
    }
}
