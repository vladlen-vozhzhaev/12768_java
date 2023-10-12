public class Main5 {
    public static void main(String[] args) {
        String[] cars = {"bmw", "audi", "kia", "vaz"};
        String[] users = {"admin", "user", "moderator"};
        printArray(cars);
        printArray(users);
    }

    static void printArray(String[] items){
        for (String item : items){
            System.out.println(item);
        }
    }

    static int f(int x, int y){
        return x+y;
    }

}
