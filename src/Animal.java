interface RunningAnimals{
    public void run();
}
abstract public class Animal {
    private String nickname;
    private String breed;
    private int age;

    public Animal(String nickname, String breed, int age) {
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}

class Cat extends Animal implements RunningAnimals{
    public Cat(String nickname, String breed, int age) {
        super(nickname, breed, age);
    }
    @Override
    public void run() {
        System.out.println("Кот/кошка: "+this.getNickname()+" побежал(а)");
    }
}

class Bird extends Animal{
    public Bird(String nickname, String breed, int age) {
        super(nickname, breed, age);
    }
    public void fly(){
        System.out.println(this.getNickname()+" полетел(а)");
    }
}

class Horse extends Animal implements RunningAnimals{
    public Horse(String nickname, String breed, int age) {
        super(nickname, breed, age);
    }

    @Override
    public void run() {
        System.out.println("Лоашдь "+this.getNickname()+" побежала");
    }
}