public class AnimalStart {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", "Дворняга", 4);
        Bird kesha = new Bird("Кеша", "Волнистый", 6);
        barsik.run();
        kesha.fly();
    }
}