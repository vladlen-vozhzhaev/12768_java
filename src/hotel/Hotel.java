package hotel;

import java.util.Scanner;

public class Hotel {
    private Room[] rooms = {
            new Room(101, 2, true, true, false),
            new Room(102, 1, false, false, false),
            new Room(103, 3, false, false, true),
            new Room(201, 2, false, true, true),
            new Room(202, 3, true, true, true),
            new Room(203, 2, true, false, false),
            new Room(301, 1, true, true, true),
            new Room(302, 1, true, false, false),
            new Room(303, 2, false, false, true)
    };

    public void getFreeRooms(){
        for (Room room : rooms) {
            if(!room.isReserve())
                System.out.print(room.getNumber()+" ");
        }
        System.out.println(" ");
    }
    public void reservedRoom(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер комнаты для бронирования:");
        int number = scanner.nextInt();
        for (Room room : rooms) {
            if(room.getNumber() == number && !room.isReserve()){
                room.setReserve(true);
                System.out.println("Комната №"+room.getNumber()+" успешно забронирована");
                return;
            }else if (room.getNumber() == number && room.isReserve()) {
                System.out.println("Комната №"+room.getNumber()+" уже была забронирована");
                return;
            }
        }
        System.out.println("Номер комнаты не найден");
    }
}