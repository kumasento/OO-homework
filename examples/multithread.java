class TestThreadOne extends Thread {
  public void run() {
    while (true) {
      System.out.println("This is TestThreadOne runnning ...");
    }
  }
}

class TestThreadTwo extends Thread {
  public void run() {
    while (true) {
      System.out.println("This is TestThreadTwo runnning ...");
    }
  }
}

class TestMultiThread {
  public static void main(String args[]) {
    TestThreadOne t1 = new TestThreadOne();
    TestThreadTwo t2 = new TestThreadTwo();
    t1.start();
    t2.start();
  }
}
