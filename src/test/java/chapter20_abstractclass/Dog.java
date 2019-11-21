package chapter20_abstractclass;

//abstract parent class
abstract class Animal {
    //abstract method
    public abstract void sound();

}
class Cat extends Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

//Dog class extends Animal class
public class Dog extends Animal {

    public void sound() {
        System.out.println("Woof");
    }



    public static void main(String args[]) {
        Animal obj = new Dog();
        obj.sound();
        Animal animal=new Cat();
        animal.sound();


    }
}

