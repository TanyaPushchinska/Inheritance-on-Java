package lab2;

class Person {
    protected String firstname;
    protected String lastname;
    protected int age;

    public Person (String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String toString() {
        return "Fullname: " + firstname + " " + lastname + "\n" + "Age: " + age;
    }
}