public class SeatManager {
    String[] seats;

    public SeatManager(int n) {
        this.seats = new String[n];

    }

    public int reserve() {
        for(int i=0; i<seats.length; i++){
            if(seats[i]==null){
                seats[i] = "reserve";
                return i+1;
            }
        }
        return -1;
    }

    public void unreserve(int seatNumber) {
        seats[seatNumber-1] = null;
    }
}
