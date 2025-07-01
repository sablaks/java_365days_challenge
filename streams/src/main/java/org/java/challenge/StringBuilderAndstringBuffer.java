package org.java.challenge;

public class StringBuilderAndstringBuffer {

    public static void main(String[] args) throws InterruptedException {
        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();
        Runnable builderTask = () -> {
            for(int i=0; i<3000; i++) {
                builder.append("A");
            }
        };
        Runnable bufferTask = () -> {
            for (int i=0; i<3000; i++) {
                buffer.append("A");
            }
        };
        Thread thread1 = new Thread(builderTask);
        thread1.start();
        Thread thread2 = new Thread(builderTask);
        thread2.start();
        thread1.join();
        thread2.join();

        Thread thread3 = new Thread(bufferTask);
        thread3.start();
        Thread thread4 = new Thread(bufferTask);
        thread4.start();
        thread3.join();
        thread4.join();
        System.out.println("Length from String Builder " +  builder.length());
        System.out.println("Length from String Buffer " +  buffer.length());
//        builderTestForThreadSafety(builderTask);
//        bufferTestForThreadSafety(bufferTask);
    }

    static void builderTestForThreadSafety(Runnable task) throws InterruptedException {
        Thread thread1 = new Thread(task);
        thread1.start();
        Thread thread2 = new Thread(task);
        thread2.start();
        thread1.join();
        thread2.join();
    }
   static void bufferTestForThreadSafety(Runnable task) throws InterruptedException {
        Thread thread3 = new Thread(task);
        thread3.start();
        Thread thread4 = new Thread(task);
        thread3.start();
        thread3.join();
        thread4.join();
//       System.out.println("Length from String Buffer " +  );
    }


}
