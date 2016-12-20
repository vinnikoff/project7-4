import java.util.*;
import java.lang.*;

public class BookingComAPI implements API {

    private Room[] rooms = new Room[5];
    private Room[] roomsfind = new Room[5];


    public BookingComAPI() {
        List<Room> rooms1 = new ArrayList<>();
        rooms1.add(new Room(1, 2, 3, "q", "w"));
        rooms1.add(new Room(4, 5, 6, "e", "r"));
        rooms1.add(new Room(4, 5, 6, "e", "r"));
        rooms1.add(new Room(10, 11, 12, "u", "i"));
        rooms1.add(new Room(13, 14, 15, "o", "p"));


        for (int i=0; i<5; i++) {
            rooms[i] = rooms1.get(i);
        }
        //Room room1 = new Room(1, 2, 3, "q", "w");
        //Room room2 = new Room(4, 5, 6, "e", "r");
        //rooms[1] = room2;
        //Room room3 = new Room(4, 5, 6, "e", "r");
        //rooms[2] = room3;
        //Room room4 = new Room(10, 11, 12, "u", "i");
        //rooms[3] = room4;
        //Room room5 = new Room(13, 14, 15, "o", "p");
        //rooms[4] = room5;

    }

        @Override
    public Room[] findRooms(int price, int persons, String hotel, String city)
    {
int j=0;
for (int i=0; i<5; i++)
{

    Room e4 = new Room(rooms[i].getId(), rooms[i].getPrice(), rooms[i].getPersons(), rooms[i].getHotelName(), rooms[i].getCityName());
    Room e5 = new Room(100, price, persons, hotel, city);

    if (e4.equals(e5) && e4.hashCode()==e5.hashCode()) {
        roomsfind [j]=e4;
    j++;}
}

        Room[] result = new Room[j];
        System.arraycopy(roomsfind, 0, result, 0, j);

        return result;
    }


    @Override
    public Room[] getAllRoom() {
        return rooms;
    }

    @Override
    public String toString() {
        return "BookingComAPI{" +
                "rooms=" + Arrays.toString(rooms) +
                ", roomsfind=" + Arrays.toString(roomsfind) +
                '}';
    }
}
