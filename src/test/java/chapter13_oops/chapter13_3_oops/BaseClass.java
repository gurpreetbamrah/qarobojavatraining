package chapter13_oops.chapter13_3_oops;

public class BaseClass {

    public void method() {
        System.out.println("I am base class method");
    }
}

class SubClass extends BaseClass {

    public void method() {
      //  super.method();
        System.out.println("I am sub class method");
    }

}

class HereISMain {
    public static void main(String[] args) {
        SubClass subClass=new SubClass();
        subClass.method();
       BaseClass subClass1=new BaseClass();
        subClass1.method();

    }
}

