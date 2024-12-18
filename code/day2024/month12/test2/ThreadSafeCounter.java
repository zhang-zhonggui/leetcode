package day2024.month12.test2;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeCounter {
    private int i;
    // write your code
    private Lock lock;
    public ThreadSafeCounter() {
        this.i = 0;
        // write your code
   lock = new ReentrantLock();
        
    }
    
    public void incr() {
        // write your code
        lock.lock();
        i = Main.incr();
        lock.unlock();
        
    }
    
    public void decr() {
        // write your code
        lock.lock();
        i = Main.decr();
        lock.unlock();
    }
    
    public int getCount() {
        return i;
    }
}