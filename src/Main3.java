public class Main3 {
    public static void main(String[] args) {
        String[] cars = {"bmw", "audi", "kia", "vaz"}; // Array
        /*System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);*/
        /*int i = 0;
        while (i < cars.length){
            System.out.println(cars[i]);
            i = i + 1;
        }*/


        /*int i = 5;
        System.out.println(i); // 5
        System.out.println(--i); // 4
        System.out.println(i--); // 4
        System.out.println(i); // 3*/

        /*for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }*/

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
