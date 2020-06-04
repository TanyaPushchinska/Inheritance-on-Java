package lab2;

class Student extends Person {
  protected String groupName;

  public Student (String groupName, String firstname, String lastname, int age) {
      super(firstname, lastname, age);
      this.groupName = groupName;
  }

  public String getGroupName() {
      return "Name of group " + groupName;
  }
}