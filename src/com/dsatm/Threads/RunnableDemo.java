package com.dsatm.Threads;

public class RunnableDemo {
    public static void main(String[] args) {
        UsingRunnable obj = new UsingRunnable(4,0,"Kiran");
        Runnable runnable=new Runnable() {
            @Override
            public void run() { // anonymous class
                System.out.println("Runnable With Anonymous Class");
            }
        };
        //It is similar to like lambda expression that why we used ';' symbol it is called ananymous expresion we have to use either any one of it
        //Creating lambda expression
        runnable=() -> {
            System.out.println("Runnable with lambda expression");
        };
        Thread ob1=new Thread(runnable);//implements runnable
        ob1.start();
    }
}
/* // Hita's Code
package com.tnsif.threads;

public class ThreadMethodDemo {

	public static void main(String[] args) {
		ChildThread one=new ChildThread(5,"First");
		ChildThread two=new ChildThread(10,"Second");
		one.setPriority(Thread.MIN_PRIORITY);
		two.setPriority(Thread.MAX_PRIORITY);
		one.start();
		two.start();
		//Thread.currentThread().setName("Parent");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

		System.out.println("Current thread "+ Thread.currentThread());

	}


}
*/
