package hotel;

import java.util.Scanner;

/*
* Наша программа предназначена для администратора отеля
* Администратор может с помощью программы
* 1) Узнать кол-во свободных номеров
* 2) Забронировать номер
* 3) Выбрать номер по характеристикам
* /getFreeRooms - получить список свободных комнат
* /reserve - забронировать комнату
* ,,,,,
* */
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true){
            System.out.println("Введите команду:");
            command = scanner.nextLine();
            if(command.equals("/getFreeRooms")){
                hotel.getFreeRooms();
            }else if (command.equals("/reserve")) {
                hotel.reservedRoom();
            }else{
                System.out.println("Неправильная команда");
            }
        }
    }
}
