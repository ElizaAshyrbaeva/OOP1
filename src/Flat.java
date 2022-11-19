public class Flat implements  PayTheRenAble {
    private Person[] people;
    private int howManyRooms, comService;

    public Flat(Person[] people, int howManyRooms, int comService) {
        this.people = people;
        this.howManyRooms = howManyRooms;
        this.comService = comService;
    }

    @Override
    public void payTheRent() {

    }

    @Override
    public void payTheService() {
        System.out.println("Flat's service is: "+comService);
    }
}

