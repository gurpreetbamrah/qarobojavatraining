package chapter13_oops.chapter13_3_oops;

public class Overloading {

    public int overloadmethod(int a, int b) {
        return  a + b;
    }

    public int overloadmethod(int a, int b,int c) {
        return a + b+c;
    }

    public static void main(String[] args) {
        Overloading overloading=new Overloading();
        System.out.println(overloading.overloadmethod(2,3));
        System.out.println(overloading.overloadmethod(2,3,4));
    }
}
