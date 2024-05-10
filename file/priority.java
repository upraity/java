// Q16. Write a program to use priority in thread.
class A extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
class priority{
    public static void main(String[] dj) {
        A t1 = new A();
        A t2 = new A();

        t1.setName("t1 thread");
        t2.setName("t2 thread");

        t1.start();
        t2.start();
    }
}
