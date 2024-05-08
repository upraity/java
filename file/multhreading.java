// Q15. Write a program to use multi threading.  
class A extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}
class multithreading{
    public static void main(String[] dj){
        A z = new A();
        z.start();
    }
}
