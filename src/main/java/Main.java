public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        Student student1 = new Student("Иванов Александр", 1, 1, new double[]{3.5, 4.0, 5.0});
        Student student2 = new Student("Сидирова Инна", 2, 2, new double[]{2.5, 3.0, 4.0});
        Student student3 = new Student("Волков Дмитрий", 1, 1, new double[]{5.0, 4.5, 4.5});
        Student student4 = new Student("Крылова Алина", 2, 2, new double[]{2.0, 1.5, 3.0});

        StudentManager manager = new StudentManager();
        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);
        manager.addStudent(student4);

        System.out.println("Студенты которые обучаются на 1 курсе");
        manager.printStudents(1);
        System.out.println("Студенты которые обучаются  на 2 курсе");
        manager.printStudents(2);

        manager.removeLowGradeStudents();
        manager.promoteStudents();

        System.out.println("Студенты которых перевели на 2 курс ");
        manager.printStudents(2);
        System.out.println("Студенты которых перевели на 3 курс ");
        manager.printStudents(3);

        System.out.println("\nЗадание 2");
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов Александр", "123-456-789");
        phoneBook.add("Иванов Александр", "987-654-321");
        phoneBook.add("Сидирова Инна", "779-455-632");
        phoneBook.add("Волков Дмитрий", "555-555-555");
        phoneBook.add("Крылова Алина", "111-222-333");

        System.out.println("Телефоны Иванов Александр: " + phoneBook.get("Иванов Александр"));
        System.out.println("Телефоны Сидирова Инна: " + phoneBook.get("Сидирова Инна"));
        System.out.println("Телефоны Волков Дмитрий: " + phoneBook.get("Волков Дмитрий"));
        System.out.println("Телефоны Крылова Алина: " + phoneBook.get("Крылова Алина"));

        System.out.println("\nВсе записи в справочнике:");
        phoneBook.printAll();
    }
}

