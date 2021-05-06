public class Organization{
    private String name;
    private int numberOfEmployees;

    public Organization(String name){
        this.name = name;
        numberOfEmployees = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfEmployees(){
        return this.numberOfEmployees;
    }

    public void increaseNumberOfEmployees(int number){
        this.numberOfEmployees += number;
    }

    public void decreaseNmmberOfEmployees(int number){
        this.numberOfEmployees -= number;
    }

    public void report(){
        System.out.println("At " + this.name + ", we currently have " + this.getNumberOfEmployees() + " employee(s).");
    }
}
