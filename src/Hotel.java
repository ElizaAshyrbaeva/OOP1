public class Hotel<Person> implements PayTheRenAble {
    private Person[] people;
    private int roomNumber,howManyRooms,rent;

    public Hotel(Person[] people, int roomNumber, int howManyRooms, int rent) {
        this.people = people;
        this.roomNumber = roomNumber;
        this.howManyRooms = howManyRooms;
        this.rent = rent;
    }

    @Override
    public void payTheRent() {
        System.out.println("Hotel's rent is: "+rent);
    }

    @Override
    public void payTheService() {

    }

}

