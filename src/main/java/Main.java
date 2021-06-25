import javax.swing.plaf.TableHeaderUI;

public class Main {
    public static void main(String[] args) {

        // Создание группы для потоков
        ThreadGroup mainGroup = new ThreadGroup("mainGroup");

        // Создание потоков
        MyThread one = new MyThread();
        MyThread two = new MyThread();
        MyThread three = new MyThread();
        MyThread four = new MyThread();

        // Добавление потоков в группу
        Thread one1 = new Thread(mainGroup, one);
        Thread two2 = new Thread(mainGroup, two);
        Thread three3 = new Thread(mainGroup, three);
        Thread four4 = new Thread(mainGroup,four);

        // Присвоение имени потоку
        one.setName("Поток номер 1");
        two.setName("Поток номер 2");
        three.setName("Поток номер 3");
        four.setName("Поток номер 4");


        // Запуск потоков
        one1.start();
        two2.start();
        three3.start();
        four4.start();


        try {
            Thread.sleep(15000);
            System.out.printf("Количество активных потоков %d \n", mainGroup.activeCount());
            mainGroup.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Остановка группы потоков
        mainGroup.interrupt();

    }
}
