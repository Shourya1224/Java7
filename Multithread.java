class Hello{
     public static void main(String[] args) {
        System.out.println("..");
          Thread t1=  new Thread( ()->{
             System.out.println("Namaste");
        
          });
          Thread t2=  new Thread( ()->{
            System.out.println("hello");

         });
         t1.start();
          t2.start();


     }
 }
