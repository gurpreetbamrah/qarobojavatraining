package chapter9_whileloop;

public class WhileLoop {
    public static void main(String[] args) {
        WhileLoop whileLoop=new WhileLoop();
        whileLoop.exampleWhileLoop();
        whileLoop.infiniteLoop();
    }

    private void exampleWhileLoop(){
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
    private void infiniteLoop(){
        while(true){
            System.out.println("infinitive while loop");
        }
    }


}

