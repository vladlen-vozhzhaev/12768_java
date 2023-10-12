/*Здоровье персонажа не может превышать 100ед.*/
public class Person {
    private String name;
    String lastname;
    int age;
    private int hp;
    Person mother;
    Person father;

    public Person(String name, String lastname, int age, Person mother, Person father) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.hp = 100;
        this.mother = mother;
        this.father = father;
    }
    public void info(){
        String info = "Имя: "+this.name+"\n" +
                      "Фамилия: "+this.lastname+"\n" +
                      "Возраст: "+this.age+"лет\n";
        if(this.mother != null) { // Проверяем, существует ли мама
            info = info + "Имя мамы: " + this.mother.getName() + "\n";
            if (this.mother.mother != null) info = info + "Имя бабушки по маминой линии: " + this.mother.mother.getName() + "\n"; // Проверяем существует ли бабушка по маминой линии
            if (this.mother.father != null) info = info + "Имя дедушки по маминой линии: " + this.mother.father.getName()+ "\n"; // Проверяем существует ли дедушка по маминой линии
        }
        if (this.father != null) { // Проверяем, существует ли папа
            info = info + "Имя папы: " + this.father.getName() + "\n";
            if (this.father.mother != null) info = info + "Имя бабушки по папиной линии: " + this.father.mother.getName() + "\n"; // Проверяем существует ли бабушка по папиной линии
            if (this.father.father != null) info = info + "Имя дедушки по папиной линии: " + this.father.father.getName() + "\n";// Проверяем существует ли дедушка по папиной линии
        }
        System.out.println(info);
    }
    public int getHp(){
        return this.hp;
    }
    public void setHp(int value){
        if(this.hp + value >= 100) this.hp = 100;
        else this.hp = this.hp + value;
    }

    public String getName() {
        return name;
    }

    void sayHi(String name){
        System.out.println("Привет "+name+" меня зовут "+this.name);
    }
}