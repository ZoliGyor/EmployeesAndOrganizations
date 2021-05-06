public class Main {
    public static void main(String[] args) {
        Organization faceBook = new Organization("FaceBook");
        Organization google = new Organization("Google");

        Employee john = new Employee(new Person("John", "Male", "programmer", "06.06.1997"), google);
        john.introductionOfAnEmployee();
        
        Employee alex = new Employee(new Person("Alex", "Female", "salesperson", "09.21.1989"), faceBook);
        alex.introductionOfAnEmployee();
        
        Employee sam = new Employee(new Person("Sam", "Other", "accountant", "11.06.1999"), google);
        sam.introductionOfAnEmployee();

        faceBook.report();
        google.report();

        Employee alex2 = new Employee(new Person("Alex", "Female", "data analyst", "09.21.1989"), faceBook);
        alex2.introductionOfAnEmployee();

        faceBook.report();
        alex.compareWithAnotherEmployee(alex2);
        faceBook.report();
    }   
}
