public class Person {
    private String name;
    private int age;
    private String whoIsThis;
    private String address;

    public Person(String name, int age, String whoIsThis, String address) {
        this.name = name;
        this.age = age;
        this.whoIsThis = whoIsThis;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWhoIsThis() {
        return whoIsThis;
    }

    public void setWhoIsThis(String whoIsThis) {
        this.whoIsThis = whoIsThis;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", whoIsThis='" + whoIsThis + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
