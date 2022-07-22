public class Human {

    private int age;

    public int getAge() {
        return age;
    }

    private String name;

    public String getName() {
        return name;
    }

    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public Human(int age, String name, String lastName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
    }

    public String getLastNameAndName() {
        return getLastName() + " " + getName();
    }

    public Boolean ageIsGreaterThan30() {
        return age > 30;
    }
}
