public class Employee {
    private Person person;
    private Organization organization;

    public Employee(Person person, Organization organization){
        this.person = person;
        this.organization = organization;
        this.organization.increaseNumberOfEmployees(1);
    }

    public boolean compareWithAnotherEmployee(Employee employee2){
        if(this.person.getName().equals(employee2.getPerson().getName())
        && this.person.getSex().equals(employee2.getPerson().getSex())
        && this.person.getBirthDay().equals(employee2.getPerson().getBirthDay())
        && this.organization.getName().equals(employee2.getOrganization().getName())){
            employee2.getOrganization().decreaseNmmberOfEmployees(1);
            return true;
        }
        return false;
    }

    public Person getPerson(){
        return this.person;
    }

    public Organization getOrganization(){
        return this.organization;
    }

    public void introductionOfAnEmployee(){
        System.out.println("Hello, my name is " + this.person.getName() + ", my birthday is on the " + this.person.getBirthDay() + ". I work at " + this.organization.getName() + " where my job is a(n) " + 
        this.person.getJobTitle() + ".");
    }
}
