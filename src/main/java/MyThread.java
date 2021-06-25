class MyThread extends Thread {

    @Override
        public void run() {
            try {
                while(!isInterrupted()) {
                    Thread.sleep(3000);
                    System.out.println(getName() + ", id: " + getId() + " | Всем привет!");
                }
            } catch (InterruptedException err) {

            } finally{
                System.out.printf("%s завершен\n", getName());
            }
        }
    }

