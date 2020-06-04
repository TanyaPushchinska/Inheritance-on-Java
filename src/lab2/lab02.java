package lab2;

public class lab02 {
    public static void main(String[] args){
        System.out.println("About Person:");
        Person newPerson = new Person("Maria", "Kovalchuk", 25);
        System.out.println(newPerson + "\n");

        System.out.println("About Teacher:");
        Teacher newTeacher = new Teacher("mathematic", "Orest", "Demchuk", 35);
        System.out.println(newTeacher);
        System.out.println(newTeacher.getNameSubject());
        System.out.println(newTeacher.getCountWorkYears(24)  + "\n");

        System.out.println("About Student:");
        Student newStudent = new Student("KN-11z", "Olesya", "Davydiv", 22);
        System.out.println(newStudent);
        System.out.println(newStudent.getGroupName() + "\n");

        System.out.println("About Head of the department:");
        HeadOfTheDepartment newHeadDepartment = new HeadOfTheDepartment("physics", "Dmitro", "Zayats", 43);
        System.out.println(newHeadDepartment);
        System.out.println(newHeadDepartment.getNameDepartment());
        System.out.println(newHeadDepartment.getCountWorkYears(23) + "\n");
    }
}
