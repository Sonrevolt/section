package section13;

public class MainTicket {

    private int tickets = 1; // Chỉ có 1 vé

    // Synchronized method to ensure only one thread can access at a time
    public synchronized void buyTicket(String threadName) {
        if (tickets > 0) {
            System.out.println(threadName + " bought ticket.");
            tickets--;
        } else {
            System.out.println(threadName + " could not buy(out of ticket).");
        }
    }

    public static void main(String[] args) {
        MainTicket mainTicket = new MainTicket();

        // Create and start two threads
        Thread thread1 = new Thread(() -> mainTicket.buyTicket("Thread 1"));
        Thread thread2 = new Thread(() -> mainTicket.buyTicket("Thread 2"));

        thread1.start();
        thread2.start();
    }
}
