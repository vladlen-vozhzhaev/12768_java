public class Main1 {
    public static void main(String[] args) {
        /*double a = 8;
        double b = 3;
        System.out.println(a+b); // 11
        System.out.println(a-b); // 5
        System.out.println(a*b); // 24
        System.out.println(a/b); // 2
        System.out.println(a%b); // 2 (15%4)=3
        System.out.println(a==b); // false
        System.out.println(a<b); // false
        System.out.println(a>=b); // true
        System.out.println(3*a+(a+b));*/
        // Покупаем на все деньги сникерсы, а на сдачу конфеты
        // Сколько всего сникерсов и конфет можно купить?
        int sum = 1000;
        int snickersCost = 35;
        double candyCost = 3.5;
        int snickersCount = sum/snickersCost;
        int change = sum-snickersCost*snickersCount;
        int candyCount = (int) (change/candyCost);
        System.out.println("Сникерсов: "+snickersCount+" конфет: "+candyCount);
    }
}
