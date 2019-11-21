package chapter15_accessmodifier.publicexample;

public class PublicExample {

    public int a=10;

    public void iamPublicMethod(){
        System.out.println("I am public method");
    }

    public static void main(String[] args) {
        PublicExample publicExample=new PublicExample();
        publicExample.iamPublicMethod();
    }
}
