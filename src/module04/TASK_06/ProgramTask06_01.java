package module04.TASK_06;

import javax.swing.plaf.TableHeaderUI;

public class ProgramTask06_01 {
    public static void main(String[] args) throws InterruptedException {
        // NEW
        Thread thread1 = new Thread(() -> {
        });
        System.out.println(thread1.getState());

        // RUNNABLE
        Thread thread2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getState());
        });
        thread2.start();

        //TERMINATED
        Thread.sleep(2000);
        System.out.println(thread2.getState());

        // BLOCKED
        Thread blocked1 = new Thread(new BlockedThread());
        Thread blocked2 = new Thread(new BlockedThread());

        blocked1.start();
        blocked2.start();

        Thread.sleep(1000);
        System.out.println(blocked2.getState());

        // WAIT
        Thread waitingThread = new Thread(new WaitingThread());
        waitingThread.start();
        Thread.sleep(1000);
        System.out.println(waitingThread.getState());

        // TIMED WAIT
        Thread timedWaitingThread = new Thread(new TimedWaitingThread());
        timedWaitingThread.start();
        Thread.sleep(1000);
        System.out.println(timedWaitingThread.getState());



        System.exit(0);
    }
}


class BlockedThread implements Runnable {

    @Override
    public void run() {
        infinite();
    }

    public static synchronized void infinite() {
        while(true) {
        }
    }
}

class WaitingThread implements Runnable {

    @Override
    public void run() {
        Thread infiniteThread = new Thread(new BlockedThread());
        infiniteThread.start();
        try {
            infiniteThread.join();
            return;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class TimedWaitingThread implements Runnable {

    @Override
    public void run() {
        Thread infiniteThread = new Thread(new BlockedThread());
        infiniteThread.start();
        try {
            infiniteThread.join(100000);
            return;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}