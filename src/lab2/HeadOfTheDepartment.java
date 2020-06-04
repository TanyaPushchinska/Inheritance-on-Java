package lab2;

class HeadOfTheDepartment extends Teacher {
    protected String nameDepartment;

    public HeadOfTheDepartment(String nameDepartment, String firstname, String lastname, int age) {
        super(firstname, lastname, age);
        this.nameDepartment = nameDepartment;
    }

    public String getNameDepartment() {
        return "Name of department - " + nameDepartment;
    }
}