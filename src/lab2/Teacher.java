package lab2;

class Teacher extends Person {
  protected String nameSubject;

  public Teacher (String nameSubject, String firstname, String lastname, int age) {
    super(firstname, lastname, age);
    this.nameSubject = nameSubject;
  }

  public Teacher(String firstname, String lastname, int age) {
    super(firstname, lastname, age);
  }

  public String getNameSubject() {
    return firstname + " teaches " + nameSubject;
  }

  public String getCountWorkYears(int startWorking) {
    int countWorkYears = age - startWorking;
    return firstname + " has been working for " + countWorkYears + " years";
  }
}