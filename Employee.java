public class Employee {
    private Person person;
    private Organization organization;

    public Employee(Person person, Organization organization){
        this.person = person;
        this.organization = organization;
    }

    public boolean compareWithAnotherEmployee(Employee employee2){
        if(this.person.getName().equals(employee2.getPerson().getName())
        && this.person.getSex().equals(employee2.getPerson().getSex())
        && this.person.getBirthDay().equals(employee2.getPerson().getBirthDay())
        && this.organization.getName().equals(employee2.getOrganization().getName())){
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
}
