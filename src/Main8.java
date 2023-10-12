public class Main8 {
    public static void main(String[] args) {
        String[] cars = {"bmw", "audi"}; // Array
        try {
            System.out.println(cars[0]);
            System.out.println(cars[2]);
            System.out.println(cars[1]);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Программа успешно завершилась");
    }
}