package test;

import java.util.BitSet;
import java.util.concurrency.ExecutorService;
import java.util.concurrency.Executors;
import java.util.concurrency.locks.LockSupport;

/**
 * Test
 *
 * @author hank
 * @create 2017-07-14 15:08
 **/
public class Test {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        BitSet bitSet = new BitSet(8 * 1024 * 1024 * 10);
        bitSet.set(1);
        System.out.println(bitSet.get(1));
        LockSupport.unpark(Thread.currentThread());
        LockSupport.park();
        System.out.println("退出");


    }
}
