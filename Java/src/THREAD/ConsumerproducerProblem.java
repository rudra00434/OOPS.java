package THREAD;

class Stock {
    int qoh = 50;

    public synchronized void demand(int req) {
        try {
            while (req > qoh) {
                wait(); 
            }
            qoh -= req;
            System.out.println("Stock after demand: " + qoh);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public synchronized void supply(int d) {
        qoh += d;
        System.out.println("Stock after supply: " + qoh);
        notify(); // notify waiting thread
    }
}

class Producer extends Thread {
    Stock stock;
    int supplyQty;

    public Producer(Stock stock, int supplyQty) {
        this.stock = stock;
        this.supplyQty = supplyQty;
    }

    public void run() {
        try {
            Thread.sleep(1000); // Delay to let consumer thread run first
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stock.supply(supplyQty);
    }
}

class Consumer extends Thread {
    Stock stock;
    int req;

    public Consumer(Stock stock, int req) {
        this.stock = stock;
        this.req = req;
    }

    public void run() {
        stock.demand(req);
    }
}

public class ConsumerproducerProblem {
    public static void main(String[] args) {
        Stock st = new Stock();
        Consumer c = new Consumer(st, 75); // Requests 75, but only 50 available
        Producer p = new Producer(st, 50); // Supplies 50 after delay
        c.start();
        p.start();
    }
}
