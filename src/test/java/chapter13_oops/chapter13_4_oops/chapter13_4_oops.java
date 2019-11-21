package chapter13_oops.chapter13_4_oops;

class Bike{
    void run(){System.out.println("running");}
}
class Splendor extends Bike{

    void run(){
        System.out.println("running safely with 60km");}

    public static void main(String args[]){
        Bike bike = new Splendor();//upcasting
        bike.run();
        Splendor splendor=new Splendor();
        splendor.run();
    }
}