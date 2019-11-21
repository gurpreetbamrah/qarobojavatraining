package chapter2_methods;

public class CallingMethod {

    public static void main(String[] args) {
        CallingMethod callingMethod = new CallingMethod();
        callingMethod.IamMethod1();
        callingMethod.IamMethod2();
    }

    public void IamMethod1() {
        System.out.println("I am method 1");
    }

   public void IamMethod2() {
       System.out.println("I am method 2");
    }


}
