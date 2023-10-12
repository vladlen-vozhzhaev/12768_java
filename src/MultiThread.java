public class MultiThread {
    public static void main(String[] args) {
        /*MyThread thread1 = new MyThread("Мыть полы");
        MyThread thread2 = new MyThread("Мыть посуду");
        MyThread thread3 = new MyThread("Стирка белья");*/

        /*Thread thread1 = new Thread(new MyRunnableClass("Мыть полы"));
        Thread thread2 = new Thread(new MyRunnableClass("Мыть посуду"));
        Thread thread3 = new Thread(new MyRunnableClass("Стирка белья"));*/
        Thread thread1 = new Thread(()->{
            for (int i = 1; i <= 100; i++) {
                System.out.println("Мыть полы"+" "+i+"%");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println("Мыть посуду"+" "+i+"%");
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println("Стирка белья"+" "+i+"%");
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyRunnableClass implements Runnable{
    private String task;

    public MyRunnableClass(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(task+" "+i+"%");
        }
    }
}

class MyThread extends Thread{
    private String task;

    public MyThread(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 1; i <= 100; i++) {
            System.out.println(task+" "+i+"%");
        }
    }
}