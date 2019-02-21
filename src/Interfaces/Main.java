package Interfaces;

public class Main {
    public static void main(String[] args) {
        CopyFileTask task1 = new CopyFileTaskImpl("C:\\Temp\\Java\\Lection_IO.ppt", "C:\\Temp\\Java\\tt.ppt", new FileCopyUtilsImpl2());
        CopyFileTask task2 = new CopyFileTaskImpl("C:\\Temp\\Some\\[FreeCourseSite.com] Udemy - The Complete 2019 Web Development Bootcamp\\06 Introduction to Bootstrap 4\\049 What is Bootstrap.mp4\"","C:\\Temp\\Some\\[FreeCourseSite.com] Udemy - The Complete 2019 Web Development Bootcamp\\Folder qwerty.mp4", new FileCopyUtilsImpl2());
        CopyFileTask task3 = new CopyFileTaskImpl("C:\\Temp\\Some\\[FreeCourseSite.com] Udemy - The Complete 2019 Web Development Bootcamp\\08 Introduction to Javascript ES6\\078 Javascript Alerts - Adding Behaviour to Websites.mp4\"","C:\\Temp\\Some\\[FreeCourseSite.com] Udemy - The Complete 2019 Web Development Bootcamp\\Folder qwerty.mp4",new FileCopyUtilsImpl3());
        CopyFileTask task4 = new CopyFileTaskImpl("C:\\Temp\\Some\\[FreeCourseSite.com] Udemy - The Complete 2019 Web Development Bootcamp\\12 Advanced Javascript and DOM Manipulation\\129 How to Play Sounds on a Website.mp4\"","C:\\Temp\\Some\\[FreeCourseSite.com] Udemy - The Complete 2019 Web Development Bootcamp\\Folder qwerty.mp4", new FileCopyUtilsImpl4());

        FindFileTaskImpl task6 = new FindFileTaskImpl("C:\\Temp\\Java", ".pp", System.out);
        FindFileTaskImpl task7 = new FindFileTaskImpl("C:\\Temp\\Java",".djvu", System.out);
        FindFileTaskImpl task8 = new FindFileTaskImpl("C:\\Temp\\Some\\[FreeCourseSite.com] Udemy - The Complete 2019 Web Development Bootcamp", "SQL", System.out);
        FindFileTaskImpl task9 = new FindFileTaskImpl("C:\\Temp\\Some\\[FreeCourseSite.com] Udemy - The Complete 2019 Web Development Bootcamp","NODE",System.out);

        TaskStorageImpl storage = new TaskStorageImpl();
        storage.add(task1);
        storage.add(task4);
        storage.add(task2);
        storage.add(task7);
        storage.add(task6);
        storage.add(task9);
        storage.add(task8);
        storage.add(task3);

        TaskExecuterImpl executer1 = new TaskExecuterImpl();
        TaskExecuterImpl executer2 = new TaskExecuterImpl();
        TaskExecuterImpl executer3 = new TaskExecuterImpl();
        executer1.setStorage(storage);
        executer2.setStorage(storage);
        executer3.setStorage(storage);
        executer1.start();
        executer2.start();
        executer3.start();
    }
}
