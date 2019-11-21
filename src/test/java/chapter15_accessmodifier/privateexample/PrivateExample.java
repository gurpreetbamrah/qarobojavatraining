package chapter15_accessmodifier.privateexample;

public class PrivateExample {
    private int a=10;
    private void privateMethod(){
        System.out.println("Hi I am private Method");
    }

    public static void main(String[] args) {
        PrivateExample privateExample=new PrivateExample();
        privateExample.privateMethod();
    }
}

/*
class a {
    public static void main(String[] args) {
        PrivateExample privateExample=new PrivateExample();
        privateExample.privateMethod();
    }

*/
