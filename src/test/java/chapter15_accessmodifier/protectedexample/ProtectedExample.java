package chapter15_accessmodifier.protectedexample;

 class ProtectedExample {
     protected int a=10;
     protected void iAmProtectedMethod(){
         System.out.println("I am protected method");
     }
}

class OverrideProtectedExample extends ProtectedExample{

    public static void main(String[] args) {
        OverrideProtectedExample overrideProtectedExample=new OverrideProtectedExample();
        overrideProtectedExample.iAmProtectedMethod();
    }
}
