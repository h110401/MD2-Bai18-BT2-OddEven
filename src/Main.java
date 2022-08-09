public class Main {

    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        Thread odd = new Thread(oddThread);
        Thread even = new Thread(evenThread);

        odd.start();
        odd.join();
        even.start();
    }

}

class OddThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            try {
                System.out.println("OddThread " + i);
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenThread implements Runnable {

    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            try {
                System.out.println("EvenThread " + i);
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
