public class Main6 {
    public static void main(String[] args) {
        getChange(28);
    }

    /*
    * Имеется кофемашина, мы даём ей купюру, заказываем кофе, и получаем сдачу.
    * Сдачу получаем номиналом 1 2 5 10 руб.
    * 32 = 10 10 10 2
    * 28 = 10 10 5 2 1
    * */
    static void getChange(int num){ // 28
        int coin = num>=10?10:num>=5?5:num>=2?2:num>=1?1:0; // Тернарный оператор
        /*int coin = 0;
        if(num >= 10) coin = 10;
        else if (num >= 5) coin = 5;
        else if(num >= 2) coin = 2;
        else if(num >= 1) coin = 1;*/

        if (coin != 0){
            System.out.println(coin);
            getChange(num - coin);
        }
    }

    static int f(int n){
        if(n>2){
            return g(n-1)+f(n-2);
        }else{
            return n;
        }
    }

    static int g(int n){
        if(n>2){
            return f(n-1)+g(n-2);
        }else{
            return 1;
        }
    }

    // Что вернёт функция при вызове f(5);
    /*
    * f(5) = g(4)+f(3) = 3+2=5
    * g(4) = f(3)+g(2) = 2+1=3
    * f(3) = g(2)+f(1) = 2
    * g(2) = 1;
    * f(1) = 1;
    * */
}
