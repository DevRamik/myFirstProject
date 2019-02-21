package Interfaces;

public class TaskExecuterImpl extends Thread implements TaskExecutor {
    private TasksStorage storage;
    private boolean stopFlag = false;

    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        this.storage = storage;
    }

    @Override
    public TasksStorage getStorage() {
        return this.storage;
    }

    @Override
    public void run() {
        while (!stopFlag){
            Task task = storage.get();
            System.out.println(Thread.currentThread().getName() + " Взял задачу " + task);
            if (task != null) {
                try {
                    System.out.println(Thread.currentThread().getName() + " Пробуем выполнить задачу " + task);
                    task.execute();
                    System.out.println(Thread.currentThread().getName() + " Задача выполнена " + task);
                } catch (TaskExecutionFailedException e) {
                    System.out.println(e);
                    if (task.getTryCount() < 5) {
                        System.out.println(Thread.currentThread().getName() + " Не получилось выаолнить задачу и возвращаю её обратно " + task);
                        task.incTryCount();
                        storage.add(task);
                    } else {
                        System.out.println(Thread.currentThread().getName() + " Задача не выполнима " + task);
                    }
                }
            } else {
                stopFlag = true;
            }
        }
    }
}
