public class Main4 {
    public static void main(String[] args) {
        /*int[] marks = {4,5,5,5,4,4,3,4,3,5,5,5,5};
        double summ = 0;
        for (int i = 0; i < marks.length; i++) {
            summ = summ + marks[i];
        }
        System.out.println( Math.round(summ / marks.length) );*/

        // Найти максимальный нечетный элемент массива
        int[] nums = {-6042,-2034,-1023,-5043,-2569,-1023,-2054};
        double min = 1/0.0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<min && nums[i]%2!=0){
                min = nums[i];
            }
        }
        System.out.println(min);
    }
}