package hotel;

public class Room {
    private int number;
    private int place;
    private boolean wc;
    private boolean conditioner;
    private boolean tv;
    private boolean reserve;

    public Room(int number, int place, boolean wc, boolean conditioner, boolean tv) {
        this.number = number;
        this.place = place;
        this.wc = wc;
        this.conditioner = conditioner;
        this.tv = tv;
        this.reserve = false;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    public int getNumber() {
        return number;
    }

    public int getPlace() {
        return place;
    }

    public boolean isWc() {
        return wc;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public boolean isTv() {
        return tv;
    }

    public boolean isReserve() {
        return reserve;
    }
}
