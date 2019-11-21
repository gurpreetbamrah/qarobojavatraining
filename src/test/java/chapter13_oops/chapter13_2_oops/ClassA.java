package chapter13_oops.chapter13_2_oops;

public class ClassA {

    int a = 10;
    int b = 20;

    public void display() {
        System.out.println(b - a);
    }

}

class ClassB extends ClassA {

    public void display() {
        //  super.display();   //  prevent overriding
        System.out.println(b + a);
    }

}

class ClassD {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.display();


    }
}
