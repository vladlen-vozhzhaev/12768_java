public class Main {
    public static void main(String[] args) {
        Person masha = new Person("Маша", "Петрова", 70, null, null);
        Person ivan = new Person("Иван", "Иванов", 35, null, null);
        Person olga = new Person("Ольга", "Иванова", 35, masha, null);
        Person alex = new Person("Алекс", "Иванов", 13, olga, ivan);
        alex.info();
    }
}