public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jan",24,"Dod","In a hotel!");
        Person person2 = new Person("Leila",20,"Mam","In a hotel!");
        Person person3 = new Person("Nuriz",17,"S","In a hotel!");

        Person person4 = new Person("Nazik",20,"M","In a hostel!");
        Person person5 = new Person("Zhigit",22,"D","In a hostel!");
        Person person6 = new Person("Abu",17,"S","In a hostel!");

        Person person7 = new Person("Alina",20,"M","In a flat!");
        Person person8 = new Person("Almaz",23,"D","In a flat!");
        Person person9 = new Person("Aike",17,"S","In a flat!");

        Person[] firstFamily = {person1, person2, person3};
        int counter1 = 0;
        for (Person ignored :firstFamily) {counter1++;
        }
        System.out.println("In a flat live "+counter1+" people.");


        Person[] secondFamily = {person4,person5,person6};
        int counter2 = 0;
        for (Person ignored :secondFamily) {counter2++;
        }
        System.out.println("In a hotel live "+counter2+" people.");


        Person[] thirdFamily = {person7,person8,person9};
        int counter3 = 0;
        for (Person ignored :thirdFamily) {
            counter3++;
        }
        System.out.println("In a hostel live " + counter3 + " people.");

        System.out.println();

        Flat flat = new Flat(firstFamily, 4, 2000);
        flat.payTheService();
        Hotel hotel = new Hotel(secondFamily, 7, 3, 5000);
        hotel.payTheRent();
        Hostel hostel = new Hostel(thirdFamily, 9, 2, 3000);
        hostel.payTheRent();
    }
}