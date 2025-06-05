class Multithreading { 
    public static void main(String[] args) {
          Thread t1=  new Thread(()->{
             System.out.println("Namaste");
              try {
                  Thread.sleep(2000);
              } catch (InterruptedException ex) {
              }
               System.out.println("Byee");
         });
         Thread t2=  new Thread(()->{
            System.out.println("Hello");
         });
         t1.start();
         try {
             t1.join();
         } catch (InterruptedException e) {
            //  TODO Auto-generated catch block
            //  e.printStackTrace();
       }
        t2.start();

    }
 }