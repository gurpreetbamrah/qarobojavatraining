package chapter10_break;

public class BreakForLoop {
    public static void main(String[] args) {
        BreakForLoop breakForLoop=new BreakForLoop();
        breakForLoop.breakloop();
    }

    private void breakloop(){
        for (int i=0;i<5;i++){
          if(i==2){
              System.out.println("hello qarobo");
              break;
          }
        }

    }
}
